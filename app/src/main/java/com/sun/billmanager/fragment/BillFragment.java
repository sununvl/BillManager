package com.sun.billmanager.fragment;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.sun.billmanager.BaseApplication;
import com.sun.billmanager.R;
import com.sun.billmanager.adapter.BillAdapter;
import com.sun.billmanager.data.DataPublisher;
import com.sun.billmanager.databinding.FragmentBillBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class BillFragment extends BaseFragment<FragmentBillBinding> {

    public static BillFragment getNewInstance() {
        return new BillFragment();
    }

    private BillFragment() {
    }

    @Override
    int getLayoutId() {
        return R.layout.fragment_bill;
    }

    @Override
    void initData() {
        BillAdapter billAdapter = new BillAdapter();
        addDisposable(DataPublisher.getInstance().subBillList(billAdapter.getConsumer()));
        mViewBinding.billRv.setLayoutManager(new LinearLayoutManager(BaseApplication.getCtx()));
        mViewBinding.billRv.setAdapter(billAdapter);
    }

}
