package com.example.projectgoob;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.audiofx.BassBoost.Settings;
import android.net.Uri;
import android.os.IBinder;

public class MyAlarmService extends Service {
	
	public void onCreate()
	{
		
	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public void onDestroy(){
		super.onDestroy();
	}
	
	
	@SuppressWarnings("deprecation")
	public void onStart(Intent intent, int startId){
		super.onStart(intent, startId);
		Intent alertIntent = new Intent();
		alertIntent.setClass(this, MathActivity.class);
		alertIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
		startActivity(alertIntent);
		
		
		
	}

}
