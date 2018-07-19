package momen.ask_and_answer;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class subject extends AppCompatActivity {
    String s;
    AlarmManager alarmManager;
    PendingIntent pendingIntent;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject);
        Intent i=getIntent();
        s =i.getStringExtra("type");
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancelAll();
    }

    public void quesArab(View view) {
        if (s.matches("ask")) {
            Intent i = new Intent(subject.this, question.class);
            i.putExtra("sub", "arabic");
            startActivity(i);
        } else if (s.matches("answer")) {
            Intent i = new Intent(subject.this, list_ques.class);
            i.putExtra("sub", "arabic");
            startActivity(i);
        }        else if(s.matches("egabat"))
        {
            Intent i = new Intent(subject.this, Egabat.class);
            i.putExtra("sub", "arabic");
            startActivity(i);
        }
        else if(s.matches("remin"))
        {
            Intent i = new Intent(subject.this, Reminder.class);
            i.putExtra("sub", "ar");
            startActivity(i);
        }
    }
    public void quesEng(View view)
    {
        if(s.matches("ask")) {
            Intent i = new Intent(subject.this, question.class);
            i.putExtra("sub","english");
            startActivity(i);
        }
        else if(s.matches("answer"))
        {
            Intent i = new Intent(subject.this, list_ques.class);
            i.putExtra("sub","english");
            startActivity(i);
        }
        else if(s.matches("egabat"))
        {
            Intent i = new Intent(subject.this, Egabat.class);
            i.putExtra("sub", "english");
            startActivity(i);
        }
        else if(s.matches("remin"))
        {
            Intent i = new Intent(subject.this, Reminder.class);
            i.putExtra("sub", "en");
            startActivity(i);
        }
    }
    public void quesBio(View view)
    {
        if(s.matches("ask")) {
            Intent i = new Intent(subject.this, question.class);
            i.putExtra("sub","biology");
            startActivity(i);
        }
        else if(s.matches("answer"))
        {
            Intent i = new Intent(subject.this, list_ques.class);
            i.putExtra("sub","biology");
            startActivity(i);
        }
        else if(s.matches("egabat"))
        {
            Intent i = new Intent(subject.this, Egabat.class);
            i.putExtra("sub", "biology");
            startActivity(i);
        }
        else if(s.matches("remin"))
        {
            Intent i = new Intent(subject.this, Reminder.class);
            i.putExtra("sub", "bi");
            startActivity(i);
        }
    }
    public void quesGeo(View view) {
        if (s.matches("ask")) {
            Intent i = new Intent(subject.this, question.class);
            i.putExtra("sub", "geology");
            startActivity(i);
        } else if (s.matches("answer")) {
            Intent i = new Intent(subject.this, list_ques.class);
            i.putExtra("sub", "geology");
            startActivity(i);
        }
        else if(s.matches("egabat"))
        {
            Intent i = new Intent(subject.this, Egabat.class);
            i.putExtra("sub", "geology");
            startActivity(i);
        }
        else if(s.matches("remin"))
        {
            Intent i = new Intent(subject.this, Reminder.class);
            i.putExtra("sub", "ge");
            startActivity(i);
        }
    }
    public void quesFran(View view) {
        if (s.matches("ask")) {
            Intent i = new Intent(subject.this, question.class);
            i.putExtra("sub", "france");
            startActivity(i);
        } else if (s.matches("answer")) {
            Intent i = new Intent(subject.this, list_ques.class);
            i.putExtra("sub", "france");
            startActivity(i);
        }
        else if(s.matches("egabat"))
        {
            Intent i = new Intent(subject.this, Egabat.class);
            i.putExtra("sub", "france");
            startActivity(i);
        }
        else if(s.matches("remin"))
        {
            Intent i = new Intent(subject.this, Reminder.class);
            i.putExtra("sub", "fr");
            startActivity(i);
        }

    }
    public void quesChm(View view) {
        if (s.matches("ask")) {
            Intent i = new Intent(subject.this, question.class);
            i.putExtra("sub", "chemistry");
            startActivity(i);
        } else if (s.matches("answer")) {
            Intent i = new Intent(subject.this, list_ques.class);
            i.putExtra("sub", "chemistry");
            startActivity(i);
        }
        else if(s.matches("egabat"))
        {
            Intent i = new Intent(subject.this, Egabat.class);
            i.putExtra("sub", "chemistry");
            startActivity(i);
        }
        else if(s.matches("remin"))
        {
            Intent i = new Intent(subject.this, Reminder.class);
            i.putExtra("sub", "ch");
            startActivity(i);
        }
    }
    public void quesPhys(View view) {
        if (s.matches("ask")) {

            Intent i = new Intent(subject.this, question.class);
            i.putExtra("sub", "physics");
            startActivity(i);
        } else if (s.matches("answer")) {
            Intent i = new Intent(subject.this, list_ques.class);
            i.putExtra("sub", "physics");
            startActivity(i);
        }
        else if(s.matches("egabat"))
        {
            Intent i = new Intent(subject.this, Egabat.class);
            i.putExtra("sub", "physics");
            startActivity(i);
        }
        else if(s.matches("remin"))
        {
            Intent i = new Intent(subject.this, Reminder.class);
            i.putExtra("sub", "ph");
            startActivity(i);
        }
    }
}
