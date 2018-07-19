package momen.ask_and_answer;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class question extends AppCompatActivity {
    EditText et;
    String str;
    SQLiteDatabase sqLiteDatabase;
    DB db;
    boolean chj =false ;
    ArrayList<String> tf = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        et = (EditText) findViewById(R.id.et);
        sqLiteDatabase = openOrCreateDatabase("education",0,null);
        db = new DB(sqLiteDatabase);
        db.create();

    }

    public void done(View view) {
        str = et.getText().toString();
        if(str.matches(""))
        {
            Toast.makeText(question.this,"احنا هنهزر ! فين السؤال ؟",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = getIntent();
            String mwad = i.getStringExtra("sub");
            if(mwad.matches("arabic"))
                chj = db.insertS(str);
            else if(mwad.matches("english"))
                chj = db.insertE(str);
            else if(mwad.matches("france"))
                chj = db.insertF(str);
            else if(mwad.matches("biology"))
                chj = db.insertB(str);
            else if(mwad.matches("geology"))
                chj = db.insertG(str);
            else if(mwad.matches("chemistry"))
                chj = db.insertC(str);
            else if(mwad.matches("physics"))
                chj = db.insertP(str);
            if(chj==false)
                Toast.makeText(question.this, "حدث خطأ ", Toast.LENGTH_LONG).show();
            else {
                Toast.makeText(question.this, "تم حفظ السؤال", Toast.LENGTH_SHORT).show();
            }
            et.setText("");
        }
    }
}
