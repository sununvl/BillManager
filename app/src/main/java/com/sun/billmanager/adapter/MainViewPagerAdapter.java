package com.sun.billmanager.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mList = new ArrayList<>();

    private List<String> mTitleList = new ArrayList<>();

    public MainViewPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Fragment> list) {
        super(fm, behavior);

        mList.clear();
        mList.addAll(list);

        mTitleList.add("账单");
        mTitleList.add("分类");
        mTitleList.add("客户");
        mTitleList.add("统计");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        if (mList.get(position).getView() != null) {
            container.addView(mList.get(position).getView());
        }
        return mList.get(position);
    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return mTitleList.get(position);
//    }
}
