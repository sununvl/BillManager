package com.sun.billmanager.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    int getLayoutId() {
        return R.layout.fragment_client;
    }

    @Override
    void initData() {

    }
}
