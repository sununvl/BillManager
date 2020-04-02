package com.sun.billmanager.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import com.sun.billmanager.R;
import com.sun.billmanager.base.BaseActivity;
import com.sun.billmanager.databinding.ActivityAddLevelBinding;

public class AddLevelActivity extends BaseActivity<ActivityAddLevelBinding> {

    public static void start(Context ctx) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(ctx, AddLevelActivity.class));
        ctx.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_add_level;
    }

    @Override
    protected void init() {

    }

}
