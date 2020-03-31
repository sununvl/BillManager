package com.sun.billmanager.vm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.sun.billmanager.bean.LevelBean;

public class LevelFragmentViewModel extends AndroidViewModel {

    private MutableLiveData<LevelBean> mLevelBean = new MutableLiveData<>();

    public LevelFragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<LevelBean> getLevelBeanLiveData() {
        return mLevelBean;
    }

}
