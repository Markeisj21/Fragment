package com.markeisjones.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SectionIndexer;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    private FragAdapter  mSectionAdapter;
    private ViewPager mViewpagr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: Started.");

        mSectionAdapter = new FragAdapter(getSupportFragmentManager());
        mViewpagr = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewpagr);

    }

    private void setupViewPager(ViewPager viewPager){
        FragAdapter adapter = new FragAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(),"Frag Home");
        adapter.addFragment(new Fragment1(),"Frag 1");
        adapter.addFragment(new Fragment2(),"Frag 2");
        viewPager.setAdapter(adapter);


    }
    public void setViewPager  (int fragNum){
        mViewpagr.setCurrentItem(fragNum);


    }
}
