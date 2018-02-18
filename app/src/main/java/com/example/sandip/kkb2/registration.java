package com.example.sandip.kkb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void regi(View view) {
        Intent i = new Intent(registration.this , MainActivity.class);
        startActivity(i);
    }
}
