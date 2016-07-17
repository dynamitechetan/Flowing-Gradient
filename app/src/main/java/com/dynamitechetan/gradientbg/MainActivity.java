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
                .setDuration(4000)
                .start();

    }
}