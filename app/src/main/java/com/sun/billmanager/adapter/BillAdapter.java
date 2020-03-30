package com.sun.billmanager.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.sun.billmanager.CtxProvider;
import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseViewHolder;
import com.sun.billmanager.bean.BillItemBean;
import com.sun.billmanager.databinding.BillRvCardBinding;

import java.util.ArrayList;
import java.util.List;

public class BillAdapter extends XRecyclerView.Adapter<BaseViewHolder<BillRvCardBinding>> {

    private static final String TAG = "sunhy";

    private List<BillItemBean> mData = new ArrayList<>();

    public void updateData(List<BillItemBean> data) {
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaseViewHolder<BillRvCardBinding> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BaseViewHolder<>(
                DataBindingUtil.inflate(
                        LayoutInflater.from(CtxProvider.sCtx)
                        , R.layout.bill_rv_card
                        , parent
                        , false
                ).getRoot()
        );
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<BillRvCardBinding> holder, int position) {
        holder.getBinding().setBill(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
