package com.sun.billmanager.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.sun.billmanager.R;
import com.sun.billmanager.adapter.MainViewPagerAdapter;
import com.sun.billmanager.databinding.ActivityMainBinding;
import com.sun.billmanager.fragment.BillFragment;
import com.sun.billmanager.fragment.ChatFragment;
import com.sun.billmanager.fragment.ClientFragment;
import com.sun.billmanager.fragment.UserFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(BillFragment.getNewInstance());
        fragmentList.add(ChatFragment.getNewInstance());
        fragmentList.add(ClientFragment.getNewInstance());
        fragmentList.add(UserFragment.getNewInstance());

        for (Fragment fragment : fragmentList) {
            getSupportFragmentManager().beginTransaction()
                    .add(fragment, "")
                    .commit();
        }

        mBinding.mainVp.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager(), 4, fragmentList));

        mBinding.mainTab.setupWithViewPager(mBinding.mainVp);

        mBinding.setController(this);
    }


    public Context getContext() {
        return this;
    }
}
