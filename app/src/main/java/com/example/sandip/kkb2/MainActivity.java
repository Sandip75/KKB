package com.example.sandip.kkb2;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                setContentView(R.layout.activity_main);
            }
        }.start();
    }


    public void login(View view) {
        Intent i = new Intent(MainActivity.this , home_screen.class);
        startActivity(i);
    }
    public  void forgotpassword(View view){
        Intent i = new Intent(MainActivity.this ,forgetpassword.class );
        startActivity(i);

      /*FragmentManager fragmentManager = getSupportFragmentManager();
      fragmentManager.beginTransaction().replace(R.id.iv , new forgot_password()).commit();*/
    }

    public void signup(View view) {
        Intent i = new Intent(MainActivity.this ,registration.class );
        startActivity(i);

    }
}
