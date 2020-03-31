package com.sun.billmanager.fragment;


import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseFragment;
import com.sun.billmanager.bean.LevelBean;
import com.sun.billmanager.databinding.FragmentLevelBinding;
import com.sun.billmanager.vm.LevelFragmentViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class LevelFragment extends BaseFragment<FragmentLevelBinding> {

    private LevelFragmentViewModel mVm;

    public static LevelFragment getNewInstance() {
        return new LevelFragment();
    }

    private LevelFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_level;
    }

    @Override
    protected void init() {
        mVm = ViewModelProviders.of(this).get(LevelFragmentViewModel.class);
        mVm.getLevelBeanLiveData().observe(this, mLevelBeanObserver);
    }

    private Observer<LevelBean> mLevelBeanObserver = levelBean -> {

    };
}
