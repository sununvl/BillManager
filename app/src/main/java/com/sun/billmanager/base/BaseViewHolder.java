package com.sun.billmanager.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

public class BaseViewHolder<T extends ViewDataBinding> extends XRecyclerView.ViewHolder {

    private T binding;

    BaseViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = DataBindingUtil.getBinding(itemView);
    }

    public T getBinding() {
        return binding;
    }
}
