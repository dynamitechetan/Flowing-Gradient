package com.dynamitechetan.flowinggradient;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by DynamiteChetan on 16-07-2016.
 */
public class FlowingGradient extends View {

    public FlowingGradient(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FlowingGradient(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FlowingGradient(Context context) {
        super(context);
        init();
    }

    private void init() {
        setBackgroundResource(R.drawable.translate);
        final AnimationDrawable frameAnimation = (AnimationDrawable) getBackground();
        frameAnimation.setEnterFadeDuration(4000);
        frameAnimation.setExitFadeDuration(4000);
        post(new Runnable(){
            public void run(){
                frameAnimation.start();
            }
        });
    }
}