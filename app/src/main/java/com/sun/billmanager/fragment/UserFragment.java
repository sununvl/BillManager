package com.sun.billmanager.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sun.billmanager.R;
import com.sun.billmanager.databinding.FragmentUserBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends BaseFragment<FragmentUserBinding> {

    public static UserFragment getNewInstance() {
        return new UserFragment();
    }

    private UserFragment() {
        // Required empty public constructor
    }


    @Override
    int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    void initData() {

    }
}
