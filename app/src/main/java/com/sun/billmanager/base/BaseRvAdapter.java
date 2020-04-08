package com.sun.billmanager.base;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.sun.billmanager.CtxProvider;

public abstract class BaseRvAdapter<T extends ViewDataBinding> extends RecyclerView.Adapter<BaseViewHolder<T>> {

    @NonNull
    @Override
    public BaseViewHolder<T> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BaseViewHolder<>(
                DataBindingUtil.inflate(
                        LayoutInflater.from(CtxProvider.sCtx)
                        , getLayoutId()
                        , parent
                        , false
                ).getRoot()
        );
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<T> holder, int position) {
        bind(holder, position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return getCount();
    }

    protected abstract int getLayoutId();

    protected abstract int getCount();

    protected abstract void bind(@NonNull BaseViewHolder<T> holder, int position);
}
