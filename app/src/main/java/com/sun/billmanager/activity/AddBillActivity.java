package com.sun.billmanager.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import com.sun.billmanager.R;
import com.sun.billmanager.databinding.ActivityAddBillBinding;

public class AddBillActivity extends BaseActivity<ActivityAddBillBinding> {

    public static void start(Context ctx) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(ctx, AddBillActivity.class));
        ctx.startActivity(intent);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_add_bill;
    }
}
