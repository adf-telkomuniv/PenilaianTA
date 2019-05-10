package com.example.dee.penilaianta;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dee on 7/7/2017.
 */

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
            }
        }, SPLASH_TIME_OUT);

//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//        finish();
    }
}
