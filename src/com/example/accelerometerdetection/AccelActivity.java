package com.example.accelerometerdetection;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AccelActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accel);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accel, menu);
		return true;
	}

}
