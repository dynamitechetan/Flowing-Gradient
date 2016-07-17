package com.dynamitechetan.flowinggradient;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


/**
 * Created by DynamiteChetan on 17-07-2016.
 */
public class FlowingGradientClass {

    String age;
    String name;
    int Duration;
    RelativeLayout rl;
    LinearLayout ll;
    ImageView im;
    int alphaint;
    int d;
    AnimationDrawable frameAnimation;
//    = (AnimationDrawable) layout.getBackground();


//    RelativeLayout layout = (RelativeLayout) findViewById(R.id.Layout);
    // Get the background, which has been compiled to an AnimationDrawable object.

    // Start the animation (looped playback by default).
//        frameAnimation.setAlpha(1);




    public FlowingGradientClass setDuration(int time) {
        this.Duration = time;

        return this;
    }
    public FlowingGradientClass onLinearLayout(LinearLayout ll) {
        this.ll = ll;
        return this;
    }

    public FlowingGradientClass onImageView(ImageView im) {
        this.im = im;
        return this;
    }

    public FlowingGradientClass onRelativeLayout(RelativeLayout rl) {
        this.rl = rl;
        return this;
    }
    public FlowingGradientClass start() {

        if(ll!=null){
            ll.setBackgroundResource(d);
        }
        else if(rl!=null){
            rl.setBackgroundResource(d);
        }
        else if(im!=null){
            im.setBackgroundResource(d);
        }
        if(ll!=null){
            frameAnimation = (AnimationDrawable) ll.getBackground();
        }
        else if(rl!=null){
            frameAnimation = (AnimationDrawable) rl.getBackground();
        }
        else if(im!=null){
            frameAnimation = (AnimationDrawable) im.getBackground();
        }
        frameAnimation.setEnterFadeDuration(Duration);
        frameAnimation.setExitFadeDuration(Duration);
        frameAnimation.start();

        return this;
    }
//    public FlowingGradientClass init() {
//
//
//        return this;
//    }

    public FlowingGradientClass setBackgroundResource(int d) {
        this.d = d;


        return this;
    }
    public FlowingGradientClass setAlpha(int alphaint) {
        this.alphaint = alphaint;
        frameAnimation.setAlpha(alphaint);
        return this;
    }




    public FlowingGradientClass setName(String name) {
        this.name = name;
        return this;
    }
    public void displayValue() {
        System.out.println("Name:" + name + "\n\n" + "Age:" + age);
    }
}