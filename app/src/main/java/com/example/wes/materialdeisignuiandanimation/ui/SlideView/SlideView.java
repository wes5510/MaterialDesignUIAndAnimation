package com.example.wes.materialdeisignuiandanimation.ui.SlideView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.example.wes.materialdeisignuiandanimation.R;

import java.util.ArrayList;
import java.util.List;

public class SlideView extends FragmentActivity implements ViewPager.OnPageChangeListener {

    private ViewPager pager;
    private SlidePagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_view);

        pager = (ViewPager) findViewById(R.id.pager);
        setupViewPapage(pager);

        pager.setOnPageChangeListener(this);
    }

    private void setupViewPapage(ViewPager viewPager) {
        FragmentManager fm = getSupportFragmentManager();
        pagerAdapter = new SlidePagerAdapter(fm);
        pagerAdapter.addFragment(new SlidePageFragmentOne(), "ONE");
        pagerAdapter.addFragment(new SlidePageFragmentTwo(), "TWO");

        viewPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        SlidePageFragment slidePageFragment = (SlidePageFragment) pagerAdapter.getItem(pager.getCurrentItem());
        slidePageFragment.startAnimation();
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

    private class SlidePagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> fragmentList = new ArrayList<>();

        public SlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
        }


    }


}
