package com.example.projectgoob;

// android imports
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

/**
 * class representing the main view for the app
 * 
 * Acts as the entry point to the application. From here users
 * can view current time and select to add or edit alarms.
 * 
 * @author 	PBR Code
 * @version 1.0
 * @since 	5 May 2013
 *
 */
public class MainActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 * 
	 * android class constructor function used for setting up app views correctly
	 * 
	 * @name 	onCreate
	 * @param	Bundle 
	 * @return	void
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   
    }

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 * 
	 * android menu constructor used for setting up app menus correctly
	 * 
	 * @name	onCreateOptionsMenu
	 * @param	Menu
	 * @return	boolean
	 */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
	/**
	 * onClick response to user selecting 'add or edit alarm' button
	 * 
	 * Loads the add or edit alarm view
	 * 
	 * @name	addAlarm
	 * @param 	View - android view object
	 * @return	void
	 */
    public void addAlarm(View v){
    	Intent intent = new Intent(this, AddAlarmActivity.class);
    	startActivity(intent);
    }
}
