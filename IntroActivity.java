package com.example.projectmusicperformer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity{


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.intro_activity);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable()  {
                                    public void run()
                                    {
                                        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                }
                    , 2000);
        }
    }

