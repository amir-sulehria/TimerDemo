package com.amir.timetables;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

/*
Timers are used to delete, execute or repeat a piece of code at specific time interval
There are two ways to use timer
*/


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        //First way using handler and runnable
        final Handler handler = new Handler(); //handler allow us to use some time functions
        //with that handler we've to create some runnable that says here is the code that i want to run i.e.,handler runs the runnable
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us", "A second passed by");
                //now after logging info lets schedule handler by saying hey execute this runnable agin after x amount of time
                handler.postDelayed(this, 10000);
            }
        };

        handler.post(run);
        */

        /*Second and the preferred way to use timer is by using countdown timer
        1st arg is how many milisec u want the thing to run for, 2nd arg is how often u want to check back so if u want every 1 sec do something pass 1000
        onTick method will get called everytime when the countdowninterval has reached
        onFinish method until countdowntimer is finished
        */
        new CountDownTimer(10000, 1000){

            public void onTick(long millisecondsUntilDone){

                Log.i("Seconds Left", String.valueOf(millisecondsUntilDone/1000));

            }

            public void onFinish(){
                Log.i("We're done ", "No more countdown");
            }
        }.start();

    }
}
