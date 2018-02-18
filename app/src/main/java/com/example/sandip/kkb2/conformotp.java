package com.example.sandip.kkb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class conformotp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conformotp);
    }

    public void otp(View view) {

        Intent i = new Intent(conformotp.this , repassword.class);
        startActivity(i);
    }
}
