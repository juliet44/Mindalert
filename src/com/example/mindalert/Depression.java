package com.example.mindalert;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Depression extends Activity {
	

	String[] pageone={"Definition","Types","Childhood","Teenage","Men","Women"};
	
	ListView lst;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depression);
		
		lst=(ListView) findViewById(R.id.listView1);
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,R.layout.support,pageone);
		
		lst.setAdapter(adapter);
		
		lst.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				
				if (position==0) {
					
					Toast.makeText(getApplicationContext(), "its clicked", Toast.LENGTH_LONG).show();
					Intent i=new Intent(Depression.this,Definition.class);
					startActivity(i);
					
				}
				
				if (position==1) {
					
					Toast.makeText(getApplicationContext(), "its clicked", Toast.LENGTH_LONG).show();
					Intent i=new Intent(Depression.this,Types.class);
					startActivity(i);
					
				}
				
				if (position==2) {
					
					Toast.makeText(getApplicationContext(), "its clicked", Toast.LENGTH_LONG).show();
					Intent i=new Intent(Depression.this,Childhood.class);
					startActivity(i);
					
				}
				
				if (position==3) {
					
					Toast.makeText(getApplicationContext(), "its clicked", Toast.LENGTH_LONG).show();
					Intent i=new Intent(Depression.this,Teenage.class);
					startActivity(i);
					
				}
				
				if(position==4){
					
					Toast.makeText(getApplicationContext(), "its clicked", Toast.LENGTH_LONG).show();
					Intent i=new Intent(Depression.this,Men.class);
					startActivity(i);
					
				}
				
				if(position==5){
					
					Toast.makeText(getApplicationContext(), "its clicked", Toast.LENGTH_LONG).show();
					Intent i=new Intent(Depression.this,Women.class);
					startActivity(i);
					
				}
				
			}

		
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.depression, menu);
		return true;
	}

}
