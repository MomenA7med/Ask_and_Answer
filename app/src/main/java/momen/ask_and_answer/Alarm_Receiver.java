package momen.ask_and_answer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by AL-Motahida on 01/02/2018.
 */

public class Alarm_Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context,Alarm_Service.class);
        context.startService(intent1);
    }
}
