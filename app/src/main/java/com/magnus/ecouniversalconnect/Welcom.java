package com.magnus.ecouniversalconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Welcom extends AppCompatActivity {
    Thread myThread;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

        myThread = new Thread(){
            @Override
            public  void run () {

                try {
                    sleep(6000);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {

                    Intent mainActivity = new Intent(Welcom. this ,MainActivity.class);

                    mainActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK / Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(mainActivity);
                }
            }
        };
        myThread.start();
    }
}
