package momen.ask_and_answer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Last extends AppCompatActivity {

    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        Intent intent = getIntent();
        int pos =intent.getIntExtra("pos",-1);
        tv1.setText(Egabat.asks.get(pos).toString());
        tv2.setText(Egabat.answers.get(pos).toString());
    }
}
