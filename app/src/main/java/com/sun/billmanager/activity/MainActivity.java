package com.sun.billmanager.activity;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;
import com.sun.billmanager.R;
import com.sun.billmanager.adapter.MainViewPagerAdapter;
import com.sun.billmanager.base.BaseActivity;
import com.sun.billmanager.databinding.ActivityMainBinding;
import com.sun.billmanager.fragment.BillFragment;
import com.sun.billmanager.fragment.ChatFragment;
import com.sun.billmanager.fragment.CustomerFragment;
import com.sun.billmanager.fragment.LevelFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(BillFragment.getNewInstance());
        fragmentList.add(LevelFragment.getNewInstance());
        fragmentList.add(CustomerFragment.getNewInstance());
        fragmentList.add(ChatFragment.getNewInstance());

        for (Fragment fragment : fragmentList) {
            getSupportFragmentManager().beginTransaction()
                    .add(fragment, "")
                    .commit();
        }

        mBinding.mainVp.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager(), 4, fragmentList));
        mBinding.mainTab.setupWithViewPager(mBinding.mainVp);
        mBinding.mainTab.removeAllTabs();

        mBinding.mainTab.addTab(mBinding.mainTab.newTab().setIcon(R.drawable.main_bill_selector));
        mBinding.mainTab.addTab(mBinding.mainTab.newTab().setIcon(R.drawable.main_level_selector));
        mBinding.mainTab.addTab(mBinding.mainTab.newTab().setIcon(R.drawable.main_customer_selector));
        mBinding.mainTab.addTab(mBinding.mainTab.newTab().setIcon(R.drawable.main_form_selector));

        mBinding.setController(this);
    }

}
