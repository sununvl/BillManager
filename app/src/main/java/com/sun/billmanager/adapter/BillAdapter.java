package com.sun.billmanager.adapter;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseRvAdapter;
import com.sun.billmanager.base.BaseViewHolder;
import com.sun.billmanager.bean.BillItemBean;
import com.sun.billmanager.databinding.VhFragmentBillRvCardBinding;

import java.util.List;

public class BillAdapter extends BaseRvAdapter<VhFragmentBillRvCardBinding> {

    private static final String TAG = "sunhy";

    private ObservableList<BillItemBean> mData = new ObservableArrayList<>();

    public void updateData(List<BillItemBean> data) {
        mData.clear();
        mData.addAll(data);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.vh_fragment_bill_rv_card;
    }

    @Override
    protected int getCount() {
        return mData.size();
    }

    @Override
    protected void bind(@NonNull BaseViewHolder<VhFragmentBillRvCardBinding> holder, int position) {
        holder.getBinding().setBill(mData.get(position));
    }


}
