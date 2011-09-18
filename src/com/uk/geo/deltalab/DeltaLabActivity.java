package com.uk.geo.deltalab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.os.Handler;
import android.widget.Button;
import android.widget.ProgressBar;
import android.view.View;
import android.view.View.OnClickListener;
//import android.widget.Toast;



public class DeltaLabActivity extends Activity {
	
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
               
        setContentView(R.layout.main);
        
        
      //** Login Button
        final Button buttLogin = (Button) findViewById(R.id.b_login);
        buttLogin.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	//Intent intent = new Intent(null, DeltaLabLogin.class);
            	//startActivity(intent);
            }
        });
     
        
        //* ProgreeBar
        final ProgressBar pBar = (ProgressBar) findViewById(R.id.pbar_welcome);
        //pBar.setVisibility(0);
        
        
        //** Ping Button
        final Button buttPing = (Button) findViewById(R.id.b_ping);
        buttPing.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	//Intent intent = new Intent(null, DeltaLabLogin.class);
            	//startActivity(intent);
               
            	
            }
        });
        
        
    }; /* onCreate */
    

    
}