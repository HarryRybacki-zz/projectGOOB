//Declare package
package com.example.projectgoob;
 

//Necessary import libraries
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListAlarmsActivity extends ListActivity {

	static final String[] ALARMS = new String[] {"20:00", "18:00"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 
		// no more this
		// setContentView(R.layout.list_fruit);
 
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_list_alarms,ALARMS));
 
		ListView listView = getListView();
		listView.setTextFilterEnabled(true);
 
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			    // When clicked, show a toast with the TextView text
			    Toast.makeText(getApplicationContext(),
				((TextView) view).getText(), Toast.LENGTH_SHORT).show();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_alarms, menu);
		return true;
	}

}

/**
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_list_alarms, ALARMS));

		ListView listView = getListView();
		listView.setTextFilterEnabled(true);
	
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(getApplicationContext(), 
						((TextView) view).getText(), Toast.LENGTH_SHORT).show();
			}


				
			
		});
**/