package com.example.wes.materialdeisignuiandanimation.ui.TabLayout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wes.materialdeisignuiandanimation.R;

public class PaperFragmentThree extends android.support.v4.app.Fragment {

    public PaperFragmentThree() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_paper_three, container, false);
    }

}
