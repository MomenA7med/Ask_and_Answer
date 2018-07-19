package momen.ask_and_answer;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void exit(View view)
    {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(Main.this,R.style.AlertDialogStyle);
        } else {
            builder = new AlertDialog.Builder(Main.this);
        }
        builder.setTitle("خروج")
                .setMessage("هل حقا تريد الخروج من البرنامج ؟")
                .setPositiveButton(" نعم ", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton(" لا ", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
    public void subjAs(View view)
    {
        Intent i = new Intent(Main.this,subject.class);
        i.putExtra("type","ask");
        startActivity(i);
    }
    public void subjAn(View view)
    {
        Intent i = new Intent(Main.this,subject.class);
        i.putExtra("type","answer");
        startActivity(i);
    }
    public void about(View view)
    {
        Intent i = new Intent(Main.this,About.class);
        startActivity(i);
    }
    public void egabat(View view)
    {
        Intent i = new Intent(Main.this,subject.class);
        i.putExtra("type","egabat");
        startActivity(i);
    }
    public void remin(View view)
    {
        Intent i = new Intent(Main.this,subject.class);
        i.putExtra("type","remin");
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(Main.this, R.style.AlertDialogStyle);
        } else {
            builder = new AlertDialog.Builder(Main.this);
        }
        builder.setTitle("خروج")
                .setMessage("هل حقا تريد الخروج من البرنامج ؟")
                .setPositiveButton(" نعم ", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton(" لا ", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
