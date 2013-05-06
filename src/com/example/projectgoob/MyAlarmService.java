package com.example.projectgoob;

// android imports
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.audiofx.BassBoost.Settings;
import android.net.Uri;
import android.os.IBinder;

/**
 * class representing handles the starting and stopping of alarms
 * 
 * @author 	PBR Code
 * @version 1.0
 * @since 	5 May 2013
 */
public class MyAlarmService extends Service {

	/* (non-Javadoc)
	 * @see android.app.Service#onBind(android.content.Intent)
	 * 
	 * returns null after binding action from pending intent
	 * 
	 * @name	onBind
	 * @param	Intent
	 * @return	IBinder
	 */
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}
	/* (non-Javadoc)
	 * @see android.app.Service#onDestroy()
	 * 
	 * calls parents onDestroy function
	 * 
	 * @name	onDestroy
	 * @param	none
	 * @return	void
	 */
	public void onDestroy(){
		super.onDestroy();
	}	

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 * 
	 * when service is called, load the respective intent
	 * 
	 * @name 	onStart
	 * @param	Intent	intent
	 * @param	int		start id
	 * @return	void
	 */
	@SuppressWarnings("deprecation")
	public void onStart(Intent intent, int startId){
		super.onStart(intent, startId);
		Intent alertIntent = new Intent();
		alertIntent.setClass(this, MathActivity.class);
		alertIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
		// launch desired intent
		startActivity(alertIntent);
	}
}
