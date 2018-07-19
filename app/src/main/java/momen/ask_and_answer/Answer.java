package momen.ask_and_answer;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Answer extends AppCompatActivity {
    TextView textView;
    EditText editText;
    SQLiteDatabase sqLiteDatabase;
    DB db;
    int poss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        Intent intent = getIntent();
        poss = intent.getIntExtra("pos",-1);
        textView.setText(list_ques.aarr.get(poss).toString());
        sqLiteDatabase = openOrCreateDatabase("education",0,null);
        db = new DB(sqLiteDatabase);
        db.create();
    }
    public void egabaDone(View view)
    {
        Intent intent = getIntent();
        String mwad=intent.getStringExtra("sub");
        if(mwad.matches("arabic")) {
            boolean vb = db.insertegA(textView.getText().toString(), editText.getText().toString());
            if (vb)
                Toast.makeText(Answer.this, "Done", Toast.LENGTH_SHORT).show();
            db.deleteeA(textView.getText().toString());
        }
        else if(mwad.matches("english"))
        {
            boolean vb = db.insertegE(textView.getText().toString(), editText.getText().toString());
            if (vb)
                Toast.makeText(Answer.this, "Done", Toast.LENGTH_SHORT).show();
            db.deleteeE(textView.getText().toString());
        }
        else if(mwad.matches("france"))
        {
            boolean vb = db.insertegF(textView.getText().toString(), editText.getText().toString());
            if (vb)
                Toast.makeText(Answer.this, "Done", Toast.LENGTH_SHORT).show();
            db.deleteeF(textView.getText().toString());
        }
        else if(mwad.matches("biology"))
        {
            boolean vb = db.insertegB(textView.getText().toString(), editText.getText().toString());
            if (vb)
                Toast.makeText(Answer.this, "Done", Toast.LENGTH_SHORT).show();
            db.deleteeB(textView.getText().toString());
        }
        else if(mwad.matches("geology"))
        {
            boolean vb = db.insertegG(textView.getText().toString(), editText.getText().toString());
            if (vb)
                Toast.makeText(Answer.this, "Done", Toast.LENGTH_SHORT).show();
            db.deleteeG(textView.getText().toString());
        }
        else if(mwad.matches("chemistry"))
        {
            boolean vb = db.insertegC(textView.getText().toString(), editText.getText().toString());
            if (vb)
                Toast.makeText(Answer.this, "Done", Toast.LENGTH_SHORT).show();
            db.deleteeC(textView.getText().toString());
        }
        else if(mwad.matches("physics"))
        {
            boolean vb = db.insertegP(textView.getText().toString(), editText.getText().toString());
            if (vb)
                Toast.makeText(Answer.this, "Done", Toast.LENGTH_SHORT).show();
            db.deleteeP(textView.getText().toString());
        }
        editText.setText("");
    }
}
