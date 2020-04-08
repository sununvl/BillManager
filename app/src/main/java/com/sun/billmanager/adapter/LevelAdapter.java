package com.sun.billmanager.adapter;

import android.util.Log;

import androidx.annotation.NonNull;

import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseRvAdapter;
import com.sun.billmanager.base.BaseViewHolder;
import com.sun.billmanager.bean.LevelBean;
import com.sun.billmanager.databinding.VhFragmentLevelTvBinding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LevelAdapter extends BaseRvAdapter<VhFragmentLevelTvBinding> {

    private static final String TAG = LevelAdapter.class.getSimpleName();

    private Map<Integer, LevelBean> mData = new HashMap<>();

    public void updateData(List<LevelBean> list) {
        sortList(list);
        notifyDataSetChanged();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.vh_fragment_level_tv;
    }

    @Override
    protected int getCount() {
        return mData.size();
    }

    @Override
    protected void bind(@NonNull BaseViewHolder<VhFragmentLevelTvBinding> holder, int position) {
        try {

            for (int i = 0; i < position; i++) {

            }
            holder.getBinding().setTitle(Objects.requireNonNull(mData.get(position)).getData());
        } catch (NullPointerException e) {
            Log.e(TAG, " level adapter data null ", e);
        }
    }

    private void sortList(List<LevelBean> list) {
        for (LevelBean levelBean : list) {
            if (levelBean.getLevel() == 0) {
                LevelBean.BASE_LEVEL_ID = Math.max(LevelBean.BASE_LEVEL_ID, levelBean.getLevel());
            }
            mData.put(levelBean.getId(), levelBean);
        }
    }

}
