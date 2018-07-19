package momen.ask_and_answer;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by AL-Motahida on 01/02/2018.
 */

public class Alarm_Service extends Service {
    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //mediaPlayer = MediaPlayer.create(this, R.raw.noty);
        //mediaPlayer.start();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent1 = new Intent(Alarm_Service.this, subject.class);
        intent1.putExtra("type", "answer");
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent1, 0);
        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("Ask and Answer");
        builder.setContentText("نذكرك بان لديك اسئله تريد معرفه اجاباتها.");
        builder.setContentIntent(pendingIntent);
        builder.setSmallIcon(R.drawable.icon);
        builder.setPriority(Notification.PRIORITY_MAX);
        builder.setVibrate(new long[] {200,200,200,200});
        builder.setSound(defaultSoundUri);
        int color= Color.argb(255,128,94,94);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder.setColor(color);
        }
        Notification noti = builder.build();
        notificationManager.notify(0,noti);
        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
