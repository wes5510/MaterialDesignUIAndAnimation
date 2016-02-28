package com.example.wes.materialdeisignuiandanimation.ui.SlideView;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.wes.materialdeisignuiandanimation.R;

/**
 * Created by wes on 16. 2. 28.
 */
public class AnimationCollection {
    private Animation animation;

    public Animation getFadeInAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.fade_in);
        return animation;
    }

    public Animation getFadeOutAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.fade_out);
        return animation;
    }

    public Animation getMoveAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.move);
        return animation;
    }

    public Animation getRotateAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.rotate);
        return animation;
    }

    public Animation getSlideDownAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.slide_down);
        return animation;
    }

    public Animation getSlideUpAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.slide_up);
        return animation;
    }

    public Animation getZoominAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.zoom_in);
        return animation;
    }

    public Animation getZoomOutAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.zoom_out);
        return animation;
    }

    public Animation getBounceAnimation(Context context) {
        animation = AnimationUtils.loadAnimation(context,
                R.anim.bounce);
        return animation;
    }
}
