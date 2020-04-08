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
        bean.setParentId(-1);
        bean.setParent(null);
        bean.setData("id - > " + LevelBean.BASE_LEVEL_ID);
        bean.setId(++LevelBean.BASE_LEVEL_ID);
        bean.setExpand(false);
        bean.setChildren(null);
        list.add(bean);
        mLevelBean.postValue(list);
        mIsNoData.set(false);
    }

    public void addCommonLevel(LevelBean parent) {
        List<LevelBean> list = mLevelBean.getValue();
        if (list == null) {
            return;
        }
        int index = list.indexOf(parent);
        if (index == -1) {
            return;
        }
        parent = list.get(index);

        LevelBean bean = new LevelBean();
        bean.setParent(null);
        bean.setData("ssssss");
        bean.setId(list.size() + 1);
        bean.setParent(parent);
        bean.setExpand(false);
        bean.setChildren(null);

        parent.addChildren(bean);

    }

}
