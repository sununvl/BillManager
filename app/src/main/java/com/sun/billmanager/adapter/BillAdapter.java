package com.sun.billmanager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.sun.billmanager.BaseApplication;
import com.sun.billmanager.R;
import com.sun.billmanager.data.bean.BillItem;
import com.sun.billmanager.databinding.BillRvCardBinding;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;

public class BillAdapter extends XRecyclerView.Adapter<BillAdapter.BillHolder<BillRvCardBinding>> {

    private static final String TAG = "sunhy";

    private List<BillItem> mData = new ArrayList<>();

    private Consumer<List<BillItem>> mConsumer = billItems -> {
        mData.clear();
        mData.addAll(billItems);
        notifyDataSetChanged();
    };

    public Consumer<List<BillItem>> getConsumer() {
        return mConsumer;
    }

    @NonNull
    @Override
    public BillHolder<BillRvCardBinding> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BillHolder<>(
                DataBindingUtil.inflate(
                        LayoutInflater.from(BaseApplication.getCtx())
                        , R.layout.bill_rv_card
                        , parent
                        , false
                ).getRoot()
        );
    }

    @Override
    public void onBindViewHolder(@NonNull BillHolder<BillRvCardBinding> holder, int position) {
        holder.binding.setBill(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class BillHolder<T extends ViewDataBinding> extends XRecyclerView.ViewHolder {

        private T binding;

        BillHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.getBinding(itemView);
        }

    }
}
