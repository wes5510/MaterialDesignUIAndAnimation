package com.example.wes.materialdeisignuiandanimation.ui.TabLayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wes.materialdeisignuiandanimation.R;

public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPaper);
        setupViewPpage(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPpage(ViewPager viewPager) {
        ViewPaperAdapter viewPaperAdapter = new ViewPaperAdapter(getSupportFragmentManager());
        viewPaperAdapter.addFragment(new PaperFragmentOne(), "ONE");
        viewPaperAdapter.addFragment(new PaperFragmentTwo(), "TWO");
        viewPaperAdapter.addFragment(new PaperFragmentThree(), "THREE");

        viewPager.setAdapter(viewPaperAdapter);
    }
}
