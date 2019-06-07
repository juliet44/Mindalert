package com.example.mindalert;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Naturally extends Fragment {
	
	
	String [] does={"Stay connected","Get moving","Do things you love","Eat good diet food","Challenge negative thoughts"
	};
		ListView lst;
		
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.naturally, container, false);
			
			lst=(ListView)rootView.findViewById(R.id.listView1);
			 ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(), R.layout.supporttwo,does);
			 
			 lst.setAdapter(adapter);
			 
			 lst.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1, int position,
							long arg3) {
						// TODO Auto-generated method stub
						
						if(position==0){
							
							//Toast.makeText(getApplicationContext(), "its clicked", Toast.LENGTH_LONG).show();
							Intent i =new Intent(getActivity(),Connected.class);
							startActivity(i);
						}
					}

					
					});
			 final View inflaterFinalClass = inflater.inflate(R.layout.connected,null); 
		       return inflaterFinalClass;
			 
			//return rootView;
		       
		       
		       
		}
	
	
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public Naturally() {
			
			
		}

		//@Override
		//public View onCreateView(LayoutInflater inflater, ViewGroup container,
				//Bundle savedInstanceState) {
			//View rootView = inflater.inflate(
					//R.layout.naturally, container, false);
			
			//return rootView;
			
			//final View inflaterFinalClass = inflater.inflate(R.layout.connected, null); 
		     //  return inflaterFinalClass;
		}
	


