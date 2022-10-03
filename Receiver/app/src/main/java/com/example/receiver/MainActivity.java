package com.example.receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter=new IntentFilter("com.example.broadcastsender");

        BroadcastReceiver broadcastReceiver = new MyMessageReceiver();
        registerReceiver(broadcastReceiver,intentFilter);


    }
}