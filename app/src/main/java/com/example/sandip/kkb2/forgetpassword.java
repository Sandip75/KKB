package com.example.sandip.kkb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class forgetpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);
    }

    public void otp(View view) {

        Intent i = new Intent(forgetpassword.this , conformotp.class);
        startActivity(i);
    }
}
