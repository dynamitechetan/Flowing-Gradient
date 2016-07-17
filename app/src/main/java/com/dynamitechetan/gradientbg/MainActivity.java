package com.dynamitechetan.gradientbg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Uncomment this to use library in Java
//
//        LinearLayout rl = (LinearLayout) findViewById(R.id.ln);
//        FlowingGradientClass fg = new FlowingGradientClass()
//                .setBackgroundResource(R.drawable.trans)
//                .onLinearLayout(rl)
//                .setTransitionDuration(4000)
//                .start();

    }
}