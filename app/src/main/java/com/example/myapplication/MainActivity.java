package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;
    private Class<?> SecondActivity;

    //TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button) findViewById(R.id.send_button_id);
        send_text = (EditText) findViewById(R.id.send_text_id);
        //receiver_msg = (TextView) findViewById(R.id.received_value_id);

        //String str;
        send_button.setOnClickListener( this::onClick);


    }
    private void onClick(View view){
        String str = send_text.getText().toString();
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_key" , str );
        startActivity(intent);
}
}