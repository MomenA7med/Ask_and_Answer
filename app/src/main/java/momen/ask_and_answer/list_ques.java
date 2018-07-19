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
import java.util.Set;

public class list_ques extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;
    DB db;
    ListView listView;
    static ArrayList<String> aarr = new ArrayList<String>();
    ArrayList<String> tf = new ArrayList<String>();
    static Set<String> set;
    static myAdapter adapter;
    TextView emp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ques);
        listView = (ListView) findViewById(R.id.myList);
        emp = (TextView) findViewById(R.id.empty);
        emp.setText(" لا توجد اسئله لديك ...");
        listView.setEmptyView(emp);
        sqLiteDatabase = openOrCreateDatabase("education",0,null);
        db = new DB(sqLiteDatabase);
        db.create();
        Intent i = getIntent();
        String mwad = i.getStringExtra("sub");
        if(mwad.matches("arabic"))
            aarr = db.getAllA();
        else if(mwad.matches("english"))
            aarr = db.getAllE();
        else if(mwad.matches("france"))
            aarr = db.getAllF();
        else if(mwad.matches("biology"))
            aarr = db.getAllB();
        else if(mwad.matches("geology"))
            aarr = db.getAllG();
        else if(mwad.matches("chemistry"))
            aarr = db.getAllC();
        else if(mwad.matches("physics"))
            aarr = db.getAllP();
        adapter = new myAdapter(this, android.R.layout.simple_list_item_1, aarr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(list_ques.this, Answer.class);
                intent.putExtra("pos", i);
                startActivity(intent);
            }
        });
        //}
    }

    @Override
    protected void onResume() {
        listView.setEmptyView(emp);
        Intent i = getIntent();
        final String mwad = i.getStringExtra("sub");
        if(mwad.matches("arabic"))
            aarr = db.getAllA();
        else if(mwad.matches("english"))
            aarr = db.getAllE();
        else if(mwad.matches("france"))
            aarr = db.getAllF();
        else if(mwad.matches("biology"))
            aarr = db.getAllB();
        else if(mwad.matches("geology"))
            aarr = db.getAllG();
        else if(mwad.matches("chemistry"))
            aarr = db.getAllC();
        else if(mwad.matches("physics"))
            aarr = db.getAllP();

        adapter = new myAdapter(this, android.R.layout.simple_list_item_1, aarr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(list_ques.this, Answer.class);
                    intent.putExtra("pos", i);
                    intent.putExtra("sub", mwad);
                    startActivity(intent);
                }
            });
        super.onResume();
    }

    public class myAdapter extends ArrayAdapter<String>
    {

        public myAdapter(Context context,int resource, ArrayList<String> aarr) {
            super(context, resource,aarr);
        }
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inf = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View v =inf.inflate(R.layout.list_item,parent,false);
            TextView tv = (TextView) v.findViewById(R.id.itemTxt);
            tv.setText(aarr.get(position));
            ImageView que = (ImageView) v.findViewById(R.id.que);
            que.setImageResource(R.drawable.qmark);
            return v;
        }
    }
}
