package com.example.tic_tacgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class splash_screen extends AppCompatActivity {
LottieAnimationView lottieAnimationView;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }


        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_splash_screen);
        /*
        lottieAnimationView.setAnimation(R.raw.tae_tac);
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);
        */
        getSupportActionBar().hide();
        textView=(TextView) findViewById(R.id.txt);
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.alphs);
        anim .setFillAfter(true);
        textView.startAnimation(anim);

        Timer timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
/* java k andr animation*/