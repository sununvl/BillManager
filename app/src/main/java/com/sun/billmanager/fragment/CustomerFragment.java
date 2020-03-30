package com.sun.billmanager.fragment;


import androidx.fragment.app.Fragment;

import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseFragment;
import com.sun.billmanager.databinding.FragmentCustomerBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerFragment extends BaseFragment<FragmentCustomerBinding> {

    public static CustomerFragment getNewInstance() {
        return new CustomerFragment();
    }

    private CustomerFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_customer;
    }

    @Override
    protected void init() {

    }
}
