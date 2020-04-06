package com.sun.billmanager.vm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.sun.billmanager.bean.LevelBean;

import java.util.ArrayList;
import java.util.List;

public class LevelFragmentViewModel extends AndroidViewModel {

    private MutableLiveData<List<LevelBean>> mLevelBean = new MutableLiveData<>();
    public ObservableBoolean mIsNoData = new ObservableBoolean(true);

    public LevelFragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<LevelBean>> getLevelBeanLiveData() {
        return mLevelBean;
    }

    public void addBaseLevel() {
        List<LevelBean> list = mLevelBean.getValue();
        if (list == null) {
            list = new ArrayList<>();
        }
        LevelBean bean = new LevelBean();
        bean.setParent(null);
        bean.setData("ssssss");
        bean.setId(list.size() + 1);
        bean.setExpand(true);
        bean.setChildren(null);
        list.add(bean);
        mLevelBean.postValue(list);
        mIsNoData.set(false);
    }

}
