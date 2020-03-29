package com.sun.billmanager.fragment;


import androidx.fragment.app.Fragment;

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
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected void initData() {

    }
}
