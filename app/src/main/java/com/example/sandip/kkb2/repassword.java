package com.example.sandip.kkb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class repassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repassword);
    }
    public void reset(View view) {

         //setContentView(R.layout.activity_main);

        Intent i = new Intent(repassword.this , MainActivity.class);
        startActivity(i);
    }
}
