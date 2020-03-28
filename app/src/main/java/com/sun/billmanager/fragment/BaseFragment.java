package com.sun.billmanager.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BaseFragment<T extends ViewDataBinding> extends Fragment {

    private CompositeDisposable mDisposableList = new CompositeDisposable();

    T mViewBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewBinding = DataBindingUtil.inflate(inflater,getLayoutId(),container,false);
        initData();
        return mViewBinding.getRoot();
    }

    abstract int getLayoutId();

    abstract void initData();

    void addDisposable(Disposable d) {
        mDisposableList.add(d);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mDisposableList.dispose();
        mDisposableList.clear();
    }
}
