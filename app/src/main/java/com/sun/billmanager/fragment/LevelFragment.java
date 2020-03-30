package com.sun.billmanager.fragment;


import androidx.fragment.app.Fragment;

import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseFragment;
import com.sun.billmanager.databinding.FragmentLevelBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class LevelFragment extends BaseFragment<FragmentLevelBinding> {

    public static LevelFragment getNewInstance() {
        return new LevelFragment();
    }

    private LevelFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_level;
    }

    @Override
    protected void init() {

    }
}
