//define package
package com.example.projectgoob;

// android imports
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

// controls logic for the main view of the application
public class MainActivity extends Activity {

    // upon creation, loads previous state and layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    // calls the AddAlarmActivity class
    public void addAlarm(View v){
    	Intent intent = new Intent(this, AddAlarmActivity.class);
    	startActivity(intent);
    }
}
