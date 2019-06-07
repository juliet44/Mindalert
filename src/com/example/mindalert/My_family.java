package com.example.mindalert;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class My_family extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_family);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.myfamily, menu);
		return true;
	}


}
