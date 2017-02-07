package com.example.aditya.viewpager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_PAGES = 4;
    ViewPager viewPager;
    private PagerAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        mPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), NUM_PAGES);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        viewPager.setAdapter(mPagerAdapter);
        indicator.setViewPager(viewPager);

    }

}

