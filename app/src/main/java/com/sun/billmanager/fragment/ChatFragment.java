package com.sun.billmanager.fragment;


import androidx.fragment.app.Fragment;

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
    protected int getLayoutId() {
        return R.layout.fragment_chat;
    }

    @Override
    protected void initData() {

    }

}
