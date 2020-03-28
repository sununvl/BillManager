package com.sun.billmanager.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sun.billmanager.R;
import com.sun.billmanager.databinding.FragmentChatBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends BaseFragment<FragmentChatBinding> {

    public static ChatFragment getNewInstance() {
        return new ChatFragment();
    }

    private ChatFragment() {
        // Required empty public constructor
    }

    @Override
    int getLayoutId() {
        return R.layout.fragment_chat;
    }

    @Override
    void initData() {

    }

}
