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


public class AnimationFragmentTwo extends AnimationFragment {
    private TextView textView;
    private ImageView imageView;
    private Animation animMove;
    private Animation animRotate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_slide_page_two, container, false);

        textView = (TextView) rootView.findViewById(R.id.fragmentSlideTwoTextView);
        imageView = (ImageView) rootView.findViewById(R.id.fragmentSlideTwoImage);

        setupAnimation(rootView);
        return rootView;
    }

    @Override
    public void setupAnimation(View view) {
        AnimationCollection ac = new AnimationCollection();

        animMove = ac.getMoveAnimation(view.getContext());
        animRotate = ac.getRotateAnimation(view.getContext());
    }

    @Override
    public void startAnimation() {
        textView.startAnimation(animMove);
        imageView.startAnimation(animRotate);
    }
}
