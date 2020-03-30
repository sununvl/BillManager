package com.sun.billmanager.fragment;


import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.sun.billmanager.CtxProvider;
import com.sun.billmanager.R;
import com.sun.billmanager.adapter.BillAdapter;
import com.sun.billmanager.base.BaseFragment;
import com.sun.billmanager.databinding.FragmentBillBinding;
import com.sun.billmanager.databinding.FragmentBillBindingImpl;
import com.sun.billmanager.vm.BillFragmentViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class BillFragment extends BaseFragment<FragmentBillBinding> {

    private BillFragmentViewModel mVm;

    public static BillFragment getNewInstance() {
        return new BillFragment();
    }

    private BillFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_bill;
    }

    @Override
    protected void init() {
        mVm = ViewModelProviders.of(this).get(BillFragmentViewModel.class);
        BillAdapter billAdapter = new BillAdapter();

        mViewBinding.billRv.setLayoutManager(new LinearLayoutManager(CtxProvider.sCtx));
        mViewBinding.billRv.setAdapter(billAdapter);
    }

}
