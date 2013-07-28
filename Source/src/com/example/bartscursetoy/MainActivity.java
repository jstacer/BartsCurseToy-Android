package com.example.bartscursetoy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	MediaPlayer mp_1;
	MediaPlayer mp_2;
	MediaPlayer mp_3;
	MediaPlayer mp_4;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
    	try{
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        Button b1 = (Button)findViewById(R.id.button1);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        Button b4 = (Button)findViewById(R.id.button4);
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        
        mp_1 = MediaPlayer.create(this, R.raw.altshutup);
    	mp_2 = MediaPlayer.create(this, R.raw.altkissmybutt);
    	mp_3 = MediaPlayer.create(this, R.raw.altgotohell);
    	mp_4 = MediaPlayer.create(this, R.raw.altnevergettired);
    	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
        
    } //end onCreate

	@Override
	public void onClick(View v) {
		int targetId = v.getId();
		
		if (targetId == R.id.button1){
			try{
			mp_1.start();
			}catch(Exception e){
	    		e.printStackTrace();
	    	}
		}
		if (targetId == R.id.button2){
			try{
			mp_2.start();
			}catch(Exception e){
	    		e.printStackTrace();
	    	}
		}	
		if (targetId == R.id.button3){	
			try{
			mp_3.start();
			}catch(Exception e){
	    		e.printStackTrace();
	    	}
		}
		if (targetId == R.id.button4){
			try{
			mp_4.start();
			}catch(Exception e){
	    		e.printStackTrace();
	    	}
		}
		
	} //end onClick()

} //end class MainActivity
