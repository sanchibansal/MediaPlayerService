package com.example.sakshi.mediaplayerservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        //click listener for start bbutton
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent for starting the service
                Intent intent = new Intent (MainActivity.this,MyService.class);
                startService(intent);
            }
        });
        //click listener for stop button
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent for stopping the service
                Intent stopintent = new Intent(MainActivity.this,MyService.class);
                stopService(stopintent);

            }
        });
    }
}
