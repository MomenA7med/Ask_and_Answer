package momen.ask_and_answer;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Egabat extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;
    DB db;
    ListView listView;
    static ArrayList<String> asks = new ArrayList<String>();
    static ArrayList<String> answers = new ArrayList<String>();
    TextView emp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.egabat);
        listView = (ListView) findViewById(R.id.my_list);
        emp =(TextView) findViewById(R.id.empty2);
        emp.setText("لا يوجد اجابات ..");
        listView.setEmptyView(emp);
        sqLiteDatabase = openOrCreateDatabase("education",0,null);
        db = new DB(sqLiteDatabase);
        db.create();
        Intent i = getIntent();
        String mwad = i.getStringExtra("sub");
        if(mwad.matches("arabic")) {
            asks = db.getAskA();
            answers = db.getEgA();
        }
        else if(mwad.matches("english")){
            asks = db.getAskE();
            answers = db.getEgE();
        }
        else if(mwad.matches("france")){
            asks = db.getAskF();
            answers = db.getEgF();
        }
        else if(mwad.matches("biology")){
            asks = db.getAskB();
            answers = db.getEgB();
        }
        else if(mwad.matches("geology")){
            asks = db.getAskG();
            answers = db.getEgG();
        }
        else if(mwad.matches("chemistry")){
            asks = db.getAskC();
            answers = db.getEgC();
        }
        else if(mwad.matches("physics")){
            asks = db.getAskP();
            answers = db.getEgP();
        }
        myAdapter adapter = new myAdapter(Egabat.this,android.R.layout.simple_list_item_1,asks);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Egabat.this,Last.class);
                intent.putExtra("pos",i);
                startActivity(intent);
            }
        });
    }

    public class myAdapter extends ArrayAdapter<String>
    {

        public myAdapter(Context context, int resource, ArrayList<String> asks) {
            super(context, resource,asks);
        }
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inf = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View v =inf.inflate(R.layout.list_item,parent,false);
            TextView tv = (TextView) v.findViewById(R.id.itemTxt);
            tv.setText(asks.get(position));
            ImageView que = (ImageView) v.findViewById(R.id.que);
            que.setImageResource(R.drawable.tmark);
            return v;
        }
    }
}
