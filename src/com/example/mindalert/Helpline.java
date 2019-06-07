package com.example.mindalert;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Helpline extends Activity {
	
	EditText edTo,edmMsg;
	Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
        
        edTo=(EditText)findViewById(R.id.editText1);
        edmMsg=(EditText)findViewById(R.id.editText2);
        
        send=(Button)findViewById(R.id.button1);
        
        send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				sendsms(edTo.getText()+"", edmMsg.getText()+"");
				//sendsms(140+"","100#no"
				
			}
		});
     
            	
      
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.helpline, menu);
        return true;
    }
    //smsclass
    public void sendsms(String phoneno,String msg){


        String SENT="message sent";
        String DELIVERED="message delivered";
        PendingIntent sentPI=PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(DELIVERED), 0);
        PendingIntent deliveredPI=PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(DELIVERED), 0);
        registerReceiver(new BroadcastReceiver() {

            @Override
            public void onReceive(Context arg0, Intent arg1) {
                // TODO Auto-generated method stub
                switch (getResultCode()) {
                    case Activity.RESULT_OK:
                        Toast.makeText(getApplicationContext(), "Donation sent", Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        Toast.makeText(getApplicationContext(), "Generic Failure", Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_NO_SERVICE:
                        Toast.makeText(getApplicationContext(), "No Service", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        }, new IntentFilter(SENT));

        registerReceiver(new BroadcastReceiver() {

            @Override
            public void onReceive(Context arg0, Intent arg1) {
                // TODO Auto-generated method stub
                switch (getResultCode()) {
                    case Activity.RESULT_OK:
                        Toast.makeText(getApplicationContext(), "Your message request has been Delivered", Toast.LENGTH_SHORT).show();
                        
                        break;

                    case Activity.RESULT_CANCELED:
                        Toast.makeText(getApplicationContext(), "Donation not delivered", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        }, new IntentFilter(DELIVERED));

        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage(phoneno, null, msg, sentPI, deliveredPI);
    }
    


    
    
}
