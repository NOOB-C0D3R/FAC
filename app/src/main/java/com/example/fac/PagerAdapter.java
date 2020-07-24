package com.example.fac;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numTab;
    public PagerAdapter(FragmentManager fm, int numTab)
    {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numTab = numTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Test tab1 = new Test();
                return tab1;
            case 1:
                Prevention tab2 = new Prevention();
                return tab2;
            case 2:
                LiveUpdate tab3 = new LiveUpdate();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numTab;
    }
}
