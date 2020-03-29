package com.sun.billmanager.fragment;


import androidx.fragment.app.Fragment;

import com.sun.billmanager.R;
import com.sun.billmanager.databinding.FragmentClientBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClientFragment extends BaseFragment<FragmentClientBinding> {

    public static ClientFragment getNewInstance() {
        return new ClientFragment();
    }

    private ClientFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_client;
    }

    @Override
    protected void initData() {

    }
}
