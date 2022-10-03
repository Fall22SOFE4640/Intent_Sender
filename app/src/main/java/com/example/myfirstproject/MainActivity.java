package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGreetings(View view) {
        EditText nameInput = findViewById(R.id.editTxtName);


        TextView txtMessage = findViewById(R.id.txtView1);
        txtMessage.setText("Hello " + nameInput.getText().toString());
    }
    //TODO finish task 1
}