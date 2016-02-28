package com.example.wes.materialdeisignuiandanimation.ui.SlideView;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by wes on 16. 2. 27.
 */
public abstract class AnimationFragment extends Fragment {

    abstract void setupAnimation(View view);

    abstract void startAnimation();
}
