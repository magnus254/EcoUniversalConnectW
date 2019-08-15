package com.magnus.ecouniversalconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {
    private Button btLogin;
    private Button btBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Button btLogin =(Button)findViewById(R.id.bt_loginNext_id);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(getApplicationContext(),Reporting.class);
                startActivity(loginIntent);
            }
        });
        Button btBack = (Button)findViewById(R.id.bt_logInHome_id);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(bIntent);

            }
        });
    }


}
