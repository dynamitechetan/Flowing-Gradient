package com.dynamitechetan.gradientbg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.dynamitechetan.flowinggradient.FlowingGradientClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout rl = (LinearLayout) findViewById(R.id.ln);
        FlowingGradientClass fg = new FlowingGradientClass()

                .setBackgroundResource(R.drawable.translate)
                .onLinearLayout(rl)
                .setDuration(1000)
                .start();

//        layout.setBackgroundResource(R.drawable.translate);
//        // Get the background, which has been compiled to an AnimationDrawable object.
//        AnimationDrawable frameAnimation = (AnimationDrawable) layout.getBackground();
//
//        // Start the animation (looped playback by default).
////        frameAnimation.setAlpha(1);
//        frameAnimation.setEnterFadeDuration(4000);
//        frameAnimation.setExitFadeDuration(4000);
//        frameAnimation.start();
    }
}