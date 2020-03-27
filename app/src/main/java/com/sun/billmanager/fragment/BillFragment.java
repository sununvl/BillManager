package com.sun.billmanager.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.sun.billmanager.R;
import com.sun.billmanager.utils.NetUtils;

import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class BillFragment extends Fragment {

    private View rootView;

    private XRecyclerView xRecyclerView;

    public BillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_bill, container, false);
        xRecyclerView = rootView.findViewById(R.id.bill_rv);
        new Thread(this::loadData);
        return rootView;
    }

    private void loadData() {


    }
}
