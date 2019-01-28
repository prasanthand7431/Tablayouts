package com.vrikshatech.www.tablayoutusingfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pager extends FragmentStatePagerAdapter {

    int tabcount;
    public pager(FragmentManager fm,int tabcount) {
        super(fm);
        this.tabcount=tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FirstFragment firstFragment=new FirstFragment();
                return firstFragment;
            case 1:
                SecondFragment secondFragment=new SecondFragment();
                return secondFragment;
            case 2:
                ThirdFragment thirdFragment=new ThirdFragment();
                return thirdFragment;
                default:return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
