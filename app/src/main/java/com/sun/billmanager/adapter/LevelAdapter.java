package com.sun.billmanager.adapter;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;

import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseRvAdapter;
import com.sun.billmanager.base.BaseViewHolder;
import com.sun.billmanager.bean.LevelBean;
import com.sun.billmanager.databinding.VhFragmentLevelTvBinding;

public class LevelAdapter extends BaseRvAdapter<VhFragmentLevelTvBinding> {

    private ObservableField<LevelBean> mData = new ObservableField<>();

    @Override
    protected int getLayoutId() {
        return R.layout.vh_fragment_level_tv;
    }

    @Override
    protected int getCount() {
        return 0;
    }

    @Override
    protected void bind(@NonNull BaseViewHolder<VhFragmentLevelTvBinding> holder, int position) {
//        holder.getBinding().setTitle();
    }
}
