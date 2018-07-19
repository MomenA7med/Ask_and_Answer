package momen.ask_and_answer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Reminder extends AppCompatActivity {
    TimePicker timePicker;
    AlarmManager alarmManager;
    TextView textView;
    Calendar calendar,calendar2,calendar3,calendar4,calendar5,calendar6,calendar7;
    Intent intent,getIn;
    PendingIntent pendingIntent,pendingIntent2,pendingIntent3,pendingIntent4,pendingIntent5,pendingIntent6,pendingIntent7;
    Spinner spinner;
    String sbj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminder);
        getIn = getIntent();
        sbj = getIn.getStringExtra("sub");
        spinner = (Spinner) findViewById(R.id.spinner);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        calendar = Calendar.getInstance();
        calendar2 = Calendar.getInstance();
        calendar3 = Calendar.getInstance();
        calendar4= Calendar.getInstance();
        calendar5 = Calendar.getInstance();
        calendar6 = Calendar.getInstance();
        calendar7 = Calendar.getInstance();
    }
    public void alarmOn (View view)
    {
        if(sbj.matches("ar")) {
            if (String.valueOf(spinner.getSelectedItem()).matches("السبت"))
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاحد"))
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاثنين"))
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("التلاثاء"))
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاربعاء"))
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الخميس"))
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الجمعه"))
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            calendar.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
            calendar.set(Calendar.MINUTE, timePicker.getCurrentMinute());
            calendar.set(Calendar.SECOND, 0);
            int Hour_a = timePicker.getCurrentHour();
            int Minute_a = timePicker.getCurrentMinute();
            String Hour_S = String.valueOf(Hour_a);
            String Min_S = String.valueOf(Minute_a);
            String day = String.valueOf(spinner.getSelectedItem());
            if (Hour_a > 12)
                Hour_S = String.valueOf(Hour_a - 12);
            if (Hour_a == 0)
                Hour_a = 12;
            if (Hour_a < 10)
                Hour_S = "0" + String.valueOf(Hour_a);
            if (Minute_a < 10)
                Min_S = "0" + String.valueOf(Minute_a);
            Toast.makeText(Reminder.this, "سيتم التنبيه يوم " + day + " الساعه " + Hour_S + ":" + Min_S, Toast.LENGTH_SHORT).show();
            intent = new Intent(Reminder.this, Alarm_Receiver.class);
            //intent.putExtra("value",1);
            pendingIntent = PendingIntent.getBroadcast(Reminder.this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
            //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        }
        else if(sbj.matches("en")) {
            if (String.valueOf(spinner.getSelectedItem()).matches("السبت"))
                calendar2.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاحد"))
                calendar2.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاثنين"))
                calendar2.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("التلاثاء"))
                calendar2.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاربعاء"))
                calendar2.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الخميس"))
                calendar2.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الجمعه"))
                calendar2.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            calendar2.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
            calendar2.set(Calendar.MINUTE, timePicker.getCurrentMinute());
            calendar2.set(Calendar.SECOND, 0);
            int Hour_a = timePicker.getCurrentHour();
            int Minute_a = timePicker.getCurrentMinute();
            String Hour_S = String.valueOf(Hour_a);
            String Min_S = String.valueOf(Minute_a);
            String day = String.valueOf(spinner.getSelectedItem());
            if (Hour_a > 12)
                Hour_S = String.valueOf(Hour_a - 12);
            if (Hour_a == 0)
                Hour_a = 12;
            if (Hour_a < 10)
                Hour_S = "0" + String.valueOf(Hour_a);
            if (Minute_a < 10)
                Min_S = "0" + String.valueOf(Minute_a);
            Toast.makeText(Reminder.this, "سيتم التنبيه يوم " + day + " الساعه " + Hour_S + ":" + Min_S, Toast.LENGTH_SHORT).show();
            intent = new Intent(Reminder.this, Alarm_Receiver.class);
            //intent.putExtra("value",1);
            pendingIntent2 = PendingIntent.getBroadcast(Reminder.this, 2, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), pendingIntent2);
            //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        }
        else if(sbj.matches("bi")) {
            if (String.valueOf(spinner.getSelectedItem()).matches("السبت"))
                calendar3.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاحد"))
                calendar3.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاثنين"))
                calendar3.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("التلاثاء"))
                calendar3.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاربعاء"))
                calendar3.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الخميس"))
                calendar3.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الجمعه"))
                calendar3.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            calendar3.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
            calendar3.set(Calendar.MINUTE, timePicker.getCurrentMinute());
            calendar3.set(Calendar.SECOND, 0);
            int Hour_a = timePicker.getCurrentHour();
            int Minute_a = timePicker.getCurrentMinute();
            String Hour_S = String.valueOf(Hour_a);
            String Min_S = String.valueOf(Minute_a);
            String day = String.valueOf(spinner.getSelectedItem());
            if (Hour_a > 12)
                Hour_S = String.valueOf(Hour_a - 12);
            if (Hour_a == 0)
                Hour_a = 12;
            if (Hour_a < 10)
                Hour_S = "0" + String.valueOf(Hour_a);
            if (Minute_a < 10)
                Min_S = "0" + String.valueOf(Minute_a);
            Toast.makeText(Reminder.this, "سيتم التنبيه يوم " + day + " الساعه " + Hour_S + ":" + Min_S, Toast.LENGTH_SHORT).show();
            intent = new Intent(Reminder.this, Alarm_Receiver.class);
            //intent.putExtra("value",1);
            pendingIntent3 = PendingIntent.getBroadcast(Reminder.this, 3, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(), pendingIntent3);
            //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        }
        else if(sbj.matches("ge")) {
            if (String.valueOf(spinner.getSelectedItem()).matches("السبت"))
                calendar4.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاحد"))
                calendar4.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاثنين"))
                calendar4.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("التلاثاء"))
                calendar4.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاربعاء"))
                calendar4.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الخميس"))
                calendar4.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الجمعه"))
                calendar4.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            calendar4.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
            calendar4.set(Calendar.MINUTE, timePicker.getCurrentMinute());
            calendar4.set(Calendar.SECOND, 0);
            int Hour_a = timePicker.getCurrentHour();
            int Minute_a = timePicker.getCurrentMinute();
            String Hour_S = String.valueOf(Hour_a);
            String Min_S = String.valueOf(Minute_a);
            String day = String.valueOf(spinner.getSelectedItem());
            if (Hour_a > 12)
                Hour_S = String.valueOf(Hour_a - 12);
            if (Hour_a == 0)
                Hour_a = 12;
            if (Hour_a < 10)
                Hour_S = "0" + String.valueOf(Hour_a);
            if (Minute_a < 10)
                Min_S = "0" + String.valueOf(Minute_a);
            Toast.makeText(Reminder.this, "سيتم التنبيه يوم " + day + " الساعه " + Hour_S + ":" + Min_S, Toast.LENGTH_SHORT).show();
            intent = new Intent(Reminder.this, Alarm_Receiver.class);
            //intent.putExtra("value",1);
            pendingIntent4 = PendingIntent.getBroadcast(Reminder.this, 4, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar4.getTimeInMillis(), pendingIntent4);
            //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        }
        else if(sbj.matches("fr")) {
            if (String.valueOf(spinner.getSelectedItem()).matches("السبت"))
                calendar5.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاحد"))
                calendar5.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاثنين"))
                calendar5.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("التلاثاء"))
                calendar5.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاربعاء"))
                calendar5.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الخميس"))
                calendar5.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الجمعه"))
                calendar5.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            calendar5.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
            calendar5.set(Calendar.MINUTE, timePicker.getCurrentMinute());
            calendar5.set(Calendar.SECOND, 0);
            int Hour_a = timePicker.getCurrentHour();
            int Minute_a = timePicker.getCurrentMinute();
            String Hour_S = String.valueOf(Hour_a);
            String Min_S = String.valueOf(Minute_a);
            String day = String.valueOf(spinner.getSelectedItem());
            if (Hour_a > 12)
                Hour_S = String.valueOf(Hour_a - 12);
            if (Hour_a == 0)
                Hour_a = 12;
            if (Hour_a < 10)
                Hour_S = "0" + String.valueOf(Hour_a);
            if (Minute_a < 10)
                Min_S = "0" + String.valueOf(Minute_a);
            Toast.makeText(Reminder.this, "سيتم التنبيه يوم " + day + " الساعه " + Hour_S + ":" + Min_S, Toast.LENGTH_SHORT).show();
            intent = new Intent(Reminder.this, Alarm_Receiver.class);
            //intent.putExtra("value",1);
            pendingIntent5 = PendingIntent.getBroadcast(Reminder.this, 5, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar5.getTimeInMillis(), pendingIntent5);
            //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        }
        else if(sbj.matches("ch")) {
            if (String.valueOf(spinner.getSelectedItem()).matches("السبت"))
                calendar6.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاحد"))
                calendar6.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاثنين"))
                calendar6.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("التلاثاء"))
                calendar6.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاربعاء"))
                calendar6.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الخميس"))
                calendar6.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الجمعه"))
                calendar6.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            calendar6.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
            calendar6.set(Calendar.MINUTE, timePicker.getCurrentMinute());
            calendar6.set(Calendar.SECOND, 0);
            int Hour_a = timePicker.getCurrentHour();
            int Minute_a = timePicker.getCurrentMinute();
            String Hour_S = String.valueOf(Hour_a);
            String Min_S = String.valueOf(Minute_a);
            String day = String.valueOf(spinner.getSelectedItem());
            if (Hour_a > 12)
                Hour_S = String.valueOf(Hour_a - 12);
            if (Hour_a == 0)
                Hour_a = 12;
            if (Hour_a < 10)
                Hour_S = "0" + String.valueOf(Hour_a);
            if (Minute_a < 10)
                Min_S = "0" + String.valueOf(Minute_a);
            Toast.makeText(Reminder.this, "سيتم التنبيه يوم " + day + " الساعه " + Hour_S + ":" + Min_S, Toast.LENGTH_SHORT).show();
            intent = new Intent(Reminder.this, Alarm_Receiver.class);
            //intent.putExtra("value",1);
            pendingIntent6 = PendingIntent.getBroadcast(Reminder.this, 6, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar6.getTimeInMillis(), pendingIntent6);
            //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        }
        else if(sbj.matches("ph")) {
            if (String.valueOf(spinner.getSelectedItem()).matches("السبت"))
                calendar7.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاحد"))
                calendar7.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاثنين"))
                calendar7.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("التلاثاء"))
                calendar7.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الاربعاء"))
                calendar7.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الخميس"))
                calendar7.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
            else if (String.valueOf(spinner.getSelectedItem()).matches("الجمعه"))
                calendar7.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            calendar7.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
            calendar7.set(Calendar.MINUTE, timePicker.getCurrentMinute());
            calendar7.set(Calendar.SECOND, 0);
            int Hour_a = timePicker.getCurrentHour();
            int Minute_a = timePicker.getCurrentMinute();
            String Hour_S = String.valueOf(Hour_a);
            String Min_S = String.valueOf(Minute_a);
            String day = String.valueOf(spinner.getSelectedItem());
            if (Hour_a > 12)
                Hour_S = String.valueOf(Hour_a - 12);
            if (Hour_a == 0)
                Hour_a = 12;
            if (Hour_a < 10)
                Hour_S = "0" + String.valueOf(Hour_a);
            if (Minute_a < 10)
                Min_S = "0" + String.valueOf(Minute_a);
            Toast.makeText(Reminder.this, "سيتم التنبيه يوم " + day + " الساعه " + Hour_S + ":" + Min_S, Toast.LENGTH_SHORT).show();
            intent = new Intent(Reminder.this, Alarm_Receiver.class);
            //intent.putExtra("value",1);
            pendingIntent7 = PendingIntent.getBroadcast(Reminder.this, 7, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar7.getTimeInMillis(), pendingIntent7);
            //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        }
    }
    public void A_Off(View view)
    {
        intent = new Intent(Reminder.this,Alarm_Receiver.class);
        intent.putExtra("value",0);
        pendingIntent = PendingIntent.getBroadcast(Reminder.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.cancel(pendingIntent);
        Toast.makeText(Reminder.this,"تم ايقاق التنبيه",Toast.LENGTH_SHORT).show();
    }
}
