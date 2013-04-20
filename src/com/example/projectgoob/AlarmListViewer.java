package com.example.projectgoob;

import java.util.ArrayList;
import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AlarmListViewer extends Activity {

	AlarmList myList;
	ArrayList<AlarmTime> myTimes;
	ArrayAdapter<AlarmTime> adapter;
	AlarmTime[] viewTimes;
	Intent theIntent;
	Bundle myBundle;
	AlarmTime myTime;
	int hour;
	int minute;
	ListView listview;
	long time;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alarm_list_view);
		myTimes = new ArrayList<AlarmTime>();
		//create linkage for list view
				listview = (ListView)findViewById(R.id.listview);
			    //create a AlarmTime array for adapter and list view use
				//viewTimes =(AlarmTime[]) myTimes.toArray();
				adapter = new ArrayAdapter<AlarmTime>(this, R.layout.list_element, myTimes);
						
				listview = (ListView) findViewById(R.id.listview);
				listview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alarm_list_viewer, menu);
		return true;
	}
	
	public void startAlarm()
	{

	}
	public void onStart()
	{
		super.onStart();
		//get intent from add alarm activity
		 theIntent = getIntent();
		//get time set in milliseconds
		time = theIntent.getLongExtra("SET_TIME", 0);
		//create bundle for intent info
		 myBundle = new Bundle();
		//get bundled list from intent
		myBundle = theIntent.getExtras();
		//set myList equal to bundled list
		myList =myBundle.getBundle("LIST").getParcelable("ALARM_LIST");
		minute = myBundle.getInt("MIN");
		hour = myBundle.getInt("HOUR");
		myTime = new AlarmTime(hour,minute);
		if(myTimes.isEmpty())
		{
		myTimes.add(myTime);
		}
		else if(myTimes.get(0).compareTo(myTime)==1)
		{
			myTimes.add(myTime);
			adapter.add(myTime);
		}
		
		
	}
	
	public void onStop()
	{
		super.onStop();
	}

}
