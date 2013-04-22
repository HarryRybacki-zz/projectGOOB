// package
package com.example.projectgoob;

// java imports
import java.util.Calendar;

// android imports
import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TimePicker;

// activity for setting, adding, and implementing a new alarm
public class AddAlarmActivity extends Activity {
	
	TimePicker tp;

        // set layout for the activity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_alarm);
	}

        // set menu
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_alarm, menu);
		return true;
	}
	
	// complete the actvity
	public void finish(View v)
	{
		finish();
	}
	
	// add the alarm to the OS's pending intents
	public void saveAlarm(View v)
	{
		tp = (TimePicker) findViewById(R.id.timepicker);
		// create alarm intent 
		Intent alarmIntent = new Intent(AddAlarmActivity.this, MyAlarmService.class);
		// create pending alarm intent to link to service (what does the waiting)
		PendingIntent pendingAlarmIntent = PendingIntent.getService(AddAlarmActivity.this, 
				0, alarmIntent, 0);
		// create Alarm manager to let android system know about the alarm
		AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
		// create calendar using android system to set user's alarm
		Calendar AlarmCal = Calendar.getInstance();
		// set milliseconds to current milliseconds
		AlarmCal.setTimeInMillis(System.currentTimeMillis());
		// set alarmCal's hour and minute to user selections
		AlarmCal.set(Calendar.HOUR_OF_DAY, tp.getCurrentHour());
		AlarmCal.set(Calendar.MINUTE, tp.getCurrentMinute());
		AlarmCal.set(Calendar.SECOND, 0);

		// tell the alarm manager when to run the service
		// RTC_WAKEUP wakes up device if it is asleep when alarm is triggered
		alarmManager.set(AlarmManager.RTC_WAKEUP,
		AlarmCal.getTimeInMillis(), 
		pendingAlarmIntent);
		new AlertDialog.Builder(AddAlarmActivity.this).setMessage("Alarm Set for: "+tp.getCurrentHour()+":"+tp.getCurrentMinute())
		.setPositiveButton("OK",new DialogInterface.OnClickListener(){

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// @TODO Auto-generated method stub

			} 
        // load the time picker onto the sreen
	}).create().show();
		finish();
	}
}
