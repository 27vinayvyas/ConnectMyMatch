package com.example.vinay.connectmymatch;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vinay.connectmymatch.Tab1;
import com.example.vinay.connectmymatch.Tab2;

public class PageAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;

    public PageAdapter(FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs=noOfTabs;
    }


    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0: return new Tab1();
            case 1: return new Tab2();
        }

        return null;
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
