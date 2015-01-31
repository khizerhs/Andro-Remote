package com.khizer.androremote;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


@SuppressLint("HandlerLeak")
public class MainActivity extends Activity {
	 
	
	int flag=0;
	int flag1=0;
	private TextView mTitle;
	
	 private static final int REQUEST_CONNECT_DEVICE = 1;
	 private static final int REQUEST_ENABLE_BT = 2;
	
	  public static final int MESSAGE_STATE_CHANGE = 1;
	    public static final int MESSAGE_READ = 2;
	    public static final int MESSAGE_WRITE = 3;
	    public static final int MESSAGE_DEVICE_NAME = 4;
	    public static final int MESSAGE_TOAST = 5;
	    
	    public static final String DEVICE_NAME = "device_name";
	    public static final String TOAST = "toast";

	    private String mConnectedDeviceName = null;
	    
	    private BluetoothAdapter mBluetoothAdapter = null;
	    
	    private BluetoothCommandService mCommandService = null;
	    
	    int i=0;
	   	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 
		 setContentView(R.layout.custom_title);
		 super.onCreate(savedInstanceState);
		 
		 mTitle = (TextView) findViewById(R.id.title_left_text);
	     mTitle.setText("Connect Status");
		 mTitle = (TextView) findViewById(R.id.title_right_text);
	     
	     mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	     if (mBluetoothAdapter == null) {
	            Toast.makeText(this, "Bluetooth is not available", Toast.LENGTH_LONG).show();
	            finish();
	            return;
	        }
		 Button l=(Button) findViewById(R.id.button1);
		 Button r=(Button) findViewById(R.id.button2);
		EditText txt=(EditText) findViewById(R.id.editText1);
		 
		 
		 l.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(flag==1 && flag1==1){
				mCommandService.write(BluetoothCommandService.VOL_DOWN);
			}
				else
					Toast.makeText(MainActivity.this,"Connect to any device", Toast.LENGTH_SHORT).show();
				}
		});
		 r.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(flag==1 && flag1==1){
				mCommandService.write(BluetoothCommandService.VOL_UP);
				
				}
				else {
					Toast.makeText(MainActivity.this,"Connect to any device", Toast.LENGTH_SHORT).show();
				}
				}
		});
		
		 TextWatcher myTextWatcher = new TextWatcher() {
			    @Override
			    public void afterTextChanged(Editable s) {
			    }

			    @Override
			    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			    }

			    @Override
			    public void onTextChanged(CharSequence s, int start, int before, int count) {
			    	String text=s.toString();
			    	Log.d("TEST",text);
			    	Log.d("start",String.valueOf(start));
			    	Log.d("before",String.valueOf(before));
			    	Log.d("count",String.valueOf(count));
			    	String st;
			    	if(text.length()<1){
			    	st=text.substring(text.length());
			    	Log.d("Substing",st);
			    	}
			    	else{
			    		st=text.substring(text.length()-1);
			    		Log.d("SSM",st);
			    	}
			       if(before<count )
			       {
			       if(st.equals("A"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_A);
			       }
			       if(st.equals("B")){
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_B);
			       }
			       if(st.equals("C"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_C);
			       }
			       if(st.equals("D"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_D);
			       }
			       if(st.equals("E"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_E);
			       }
			       if(st.equals("F"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_F);
			       }
			       if(st.equals("G"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_G);
			       }
			       if(st.equals("H"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_H);
			       }
			       if(st.equals("I"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_I);
			       }
			       if(st.equals("J"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_J);
			       }
			       if(st.equals("K"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_K);
			       }
			       if(st.equals("L"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_L);
			       }
			       if(st.equals("M"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_M);
			       }
			       if(st.equals("N"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_N);
			       }
			       if(st.equals("O"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_O);
			       }
			       if(st.equals("P"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_P);
			       }
			       if(st.equals("Q"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_Q);
			       }
			       if(st.equals("R"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_R);
			       }
			       if(st.equals("S"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_S);
			       }
			       if(st.equals("T"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_T);
			       }
			       if(st.equals("U"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_U);
			       }
			       if(st.equals("V"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_V);
			       }
			       if(st.equals("W"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_W);
			       }
			       if(st.equals("X"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_X);
			       }
			       if(st.equals("Y"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_Y);
			       }
			       if(st.equals("Z"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_Z);
			       }
			       if(st.equals("a"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_AL);
			       }
			       if(st.equals("b")){
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_BL);
			       }
			       if(st.equals("c"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_CL);
			       }
			       if(st.equals("d"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_DL);
			       }
			       if(st.equals("e"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_EL);
			       }
			       
			       if(st.equals("f"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_FL);
			       }
			       if(st.equals("g"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_GL);
			       }
			       if(st.equals("h"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_HL);
			       }
			       if(st.equals("i"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_IL);
			       }
			       if(st.equals("j"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_JL);
			       }
			       if(st.equals("k"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_KL);
			       }
			       if(st.equals("l"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_LL);
			       }
			       if(st.equals("m"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_ML);
			       }
			       if(st.equals("n"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_NL);
			       }
			       if(st.equals("o"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_OL);
			       }
			       if(st.equals("p"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_PL);
			       }
			       if(st.equals("q"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_QL);
			       }
			       if(st.equals("r"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_RL);
			       }
			       if(st.equals("s"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_SL);
			       }
			       if(st.equals("t"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_TL);
			       }
			       if(st.equals("u"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_UL);
			       }
			       if(st.equals("v"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_VL);
			       }
			       if(st.equals("w"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_WL);
			       }
			       if(st.equals("x"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_XL);
			       }
			       if(st.equals("y"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_YL);
			       }
			       if(st.equals("z"))
			       {
			    	   Log.d("HEY",st);
			    	   mCommandService.write(BluetoothCommandService.KEY_ZL);
			       }
			       if(st.equals(" ")){
		    		   Log.d("HEY","Space");
		    		   mCommandService.write(BluetoothCommandService.KEY_SPC);
		    	   }
			       
			       }
			       else if(before>count)
			       {  Log.d("HEY","BackSpace");
			    	   mCommandService.write(BluetoothCommandService.KEY_BS);
			       }
			       if(before==0 && start!=0)
			       {
			    	   if(st.equals("\n")){
			    	   Log.d("HEY","Enter");
			    	   mCommandService.write(BluetoothCommandService.KEY_RET);
			    	   }
			    	  
			       }
			    }
			};
			txt.addTextChangedListener(myTextWatcher);

	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
		// If BT is not on, request that it be enabled.
        // setupCommand() will then be called during onActivityResult
		if (!mBluetoothAdapter.isEnabled()) {
			Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
			startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
		}
		// otherwise set up the command service
		else {
			if (mCommandService==null)
				setupCommand();
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		
		// Performing this check in onResume() covers the case in which BT was
        // not enabled during onStart(), so we were paused to enable it...
        // onResume() will be called when ACTION_REQUEST_ENABLE activity returns.
		if (mCommandService != null) {
			if (mCommandService.getState() == BluetoothCommandService.STATE_NONE) {
				mCommandService.start();
			}
		}
	}

	private void setupCommand() {
		// Initialize the BluetoothChatService to perform bluetooth connections
        mCommandService = new BluetoothCommandService(this, mHandler);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		if (mCommandService != null)
			mCommandService.stop();
	}
	
	private void ensureDiscoverable() {
        if (mBluetoothAdapter.getScanMode() !=
            BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
            Intent discoverableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
            startActivity(discoverableIntent);
        }
    }
	
	// The Handler that gets information back from the BluetoothChatService
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
            case MESSAGE_STATE_CHANGE:
                switch (msg.arg1) {
                case BluetoothCommandService.STATE_CONNECTED:
                    mTitle.setText(R.string.title_connected_to);
                    mTitle.append(mConnectedDeviceName);
                    break;
                case BluetoothCommandService.STATE_CONNECTING:
                    mTitle.setText(R.string.title_connecting);
                    break;
                case BluetoothCommandService.STATE_LISTEN:
                case BluetoothCommandService.STATE_NONE:
                	mTitle = (TextView) findViewById(R.id.title_right_text);
                	mTitle.setText(R.string.title_not_connected);
                    break;
                }
                break;
            case MESSAGE_DEVICE_NAME:
                // save the connected device's name
                mConnectedDeviceName = msg.getData().getString(DEVICE_NAME);
                Toast.makeText(getApplicationContext(), "Connected to "
                               + mConnectedDeviceName, Toast.LENGTH_SHORT).show();
                break;
            case MESSAGE_TOAST:
                Toast.makeText(getApplicationContext(), msg.getData().getString(TOAST),
                               Toast.LENGTH_SHORT).show();
                break;
            }
        }
    };
	
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
        case REQUEST_CONNECT_DEVICE:
            // When DeviceListActivity returns with a device to connect
            if (resultCode == Activity.RESULT_OK) {
                // Get the device MAC address
                String address = data.getExtras()
                                     .getString(DeviceListActivity.EXTRA_DEVICE_ADDRESS);
                // Get the BLuetoothDevice object
                BluetoothDevice device = mBluetoothAdapter.getRemoteDevice(address);
                // Attempt to connect to the device
                mCommandService.connect(device);
            }
            break;
        case REQUEST_ENABLE_BT:
            // When the request to enable Bluetooth returns
            if (resultCode == Activity.RESULT_OK) {
                // Bluetooth is now enabled, so set up a chat session
                setupCommand();
            } else {
                // User did not enable Bluetooth or an error occured
                Toast.makeText(this, R.string.bt_not_enabled_leaving, Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		 flag1=1;
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
       
        return true;
        
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.scan:
        	flag=1;
            // Launch the DeviceListActivity to see devices and do scan
        	Intent serverIntent = new Intent(this, DeviceListActivity.class);
            startActivityForResult(serverIntent, REQUEST_CONNECT_DEVICE);
            return true;
        case R.id.discoverable:
            // Ensure this device is discoverable by others
            ensureDiscoverable();
            return true;
        }
        return false;
    }
}
