package com.example.wes.materialdeisignuiandanimation.ui.SlideView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wes.materialdeisignuiandanimation.R;


public class AnimationFragmentOne extends AnimationFragment {
    private TextView textView;
    private ImageView imageView;
    private Animation animfadeIn;
    private Animation animZoomIn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_slide_page_one, container, false);
        textView = (TextView) rootView.findViewById(R.id.fragmentSlideOneTextView);
        imageView = (ImageView) rootView.findViewById(R.id.fragmentSlideOneImage);

        setupAnimation(rootView);

        startAnimation();
        return rootView;
    }

    @Override
    public void setupAnimation(View view) {
        animfadeIn = AnimationUtils.loadAnimation(view.getContext(),
                R.anim.fade_in);
        animZoomIn = AnimationUtils.loadAnimation(view.getContext(),
                R.anim.zoom_in);
    }

    @Override
    public void startAnimation() {
        textView.startAnimation(animfadeIn);
        imageView.startAnimation(animZoomIn);
    }
}
