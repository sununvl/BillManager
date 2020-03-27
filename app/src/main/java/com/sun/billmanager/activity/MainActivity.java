package com.sun.billmanager.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.sun.billmanager.R;
import com.sun.billmanager.adapter.MainViewPagerAdapter;
import com.sun.billmanager.fragment.BillFragment;
import com.sun.billmanager.fragment.ChatFragment;
import com.sun.billmanager.fragment.ClientFragment;
import com.sun.billmanager.fragment.UserFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.main_vp);

        TabLayout tableLayout = findViewById(R.id.main_tab);

        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(new BillFragment());
        fragmentList.add(new ChatFragment());
        fragmentList.add(new ClientFragment());
        fragmentList.add(new UserFragment());

        for (Fragment fragment : fragmentList) {
            getSupportFragmentManager().beginTransaction()
                    .add(fragment, "")
                    .commit();
        }

        pager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager(),4,fragmentList));

        tableLayout.setupWithViewPager(pager);
    }
}
