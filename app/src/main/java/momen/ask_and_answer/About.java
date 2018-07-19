package momen.ask_and_answer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }

    public void face(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/momen.ahmed.7370013"));
        startActivity(intent);
    }
}