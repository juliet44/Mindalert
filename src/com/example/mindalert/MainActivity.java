package com.example.mindalert;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint.Join;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText userName,passWord;
	Button login;
	String userValue,passValue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logmain);
		
		userName=(EditText)findViewById(R.id.editText1);
		passWord=(EditText)findViewById(R.id.editText2);
		login=(Button)findViewById(R.id.button1);
		
login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				userValue=userName.getText().toString();
				passValue=passWord.getText().toString();
				if(userValue.contains("admin")&& passValue.contains("admin"))
				{
					//Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
					Intent i=new Intent(MainActivity.this,Logmain.class);
					startActivity(i);
				}else {
					Toast.makeText(getApplicationContext(), "invalid username or password", Toast.LENGTH_LONG).show();
					//JOptionPane.showMessageDialog(null,"invalid login details","login Error",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.logmain, menu);
		return true;
	}

}
