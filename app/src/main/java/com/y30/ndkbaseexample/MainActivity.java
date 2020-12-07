package com.y30.ndkbaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity 
{
    private static String TAG = "NDKBaseExample";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		if(!JNIBridge.LoadLibrary(this))
		{
			Log.e(TAG, "onCreate: failed to load jni library");
			return;
		}
		Log.e(TAG, "onCreate: library loaded");

		JNIBridge.JNIDoSomething("I am Java String");
    }
}
