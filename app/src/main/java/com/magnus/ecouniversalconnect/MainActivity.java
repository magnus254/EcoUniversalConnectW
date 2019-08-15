package com.magnus.ecouniversalconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btCreatAccount;
    private  Button btLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button creatAccount = (Button)findViewById(R.id.bt_creatAccont_id);
       creatAccount.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(getApplicationContext(),CreateAccount.class);
               startActivity(intent);
           }
       });
       final Button logIn = (Button)findViewById(R.id.bt_logIn_id);
       logIn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(getApplicationContext(),LogIn.class);
               startActivity(intent);

           }
       });
}
}
