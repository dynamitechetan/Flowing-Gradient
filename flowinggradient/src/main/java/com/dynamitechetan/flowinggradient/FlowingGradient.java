package com.dynamitechetan.flowinggradient;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by DynamiteChetan on 16-07-2016.
 */
public class FlowingGradient extends View {

    int duration;
    int draw;
    public FlowingGradient(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FlowingGradient(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = getContext().obtainStyledAttributes(attrs,R.styleable.gradient,0, 0);

        draw = a.getResourceId(R.styleable.gradient_transition_drawable, R.drawable.translate);
        duration = a.getInt(R.styleable.gradient_duration,75);
        init();
    }

    public FlowingGradient(Context context) {
        super(context);
        init();
    }

    private void init() {
        setBackgroundResource(draw);
        final AnimationDrawable frameAnimation = (AnimationDrawable) getBackground();
        frameAnimation.setEnterFadeDuration(duration);
        frameAnimation.setExitFadeDuration(duration);
        post(new Runnable(){
            public void run(){
                frameAnimation.start();
            }
        });
    }
}