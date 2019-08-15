package com.magnus.ecouniversalconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccount extends AppCompatActivity {
    private Button btcreat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        Button btcreat = (Button)findViewById(R.id.bt_createAc_finish_id);
        btcreat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent creatIntent = new Intent(getApplicationContext(),Reporting.class);
                startActivity(creatIntent);
            }
        });
    }
}
