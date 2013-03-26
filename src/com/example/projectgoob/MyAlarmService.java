package com.example.projectgoob;

import android.app.Service;
import android.content.Intent;
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
