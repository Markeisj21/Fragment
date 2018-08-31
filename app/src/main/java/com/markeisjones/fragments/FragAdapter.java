package com.markeisjones.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFreagmentlist = new ArrayList<>();
    private final List<String> mFragmentTitle = new ArrayList<>();



    public FragAdapter(FragmentManager fm) {

        super(fm);
    }
    public void addFragment(Fragment fragment,String title){
        mFreagmentlist.add(fragment);
        mFragmentTitle.add(title);



    }

    @Override
    public Fragment getItem(int position) {
        return mFreagmentlist.get(position);
    }

    @Override
    public int getCount() {
        return mFreagmentlist.size();
    }
}
