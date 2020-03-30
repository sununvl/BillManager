package com.sun.billmanager.vm;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.sun.billmanager.bean.BillItemBean;
import com.sun.billmanager.bean.LevelBean;
import com.sun.billmanager.utils.NetUtils;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class BillFragmentViewModel extends AndroidViewModel {

    public MutableLiveData<List<BillItemBean>> mBillList = new MutableLiveData<>();
    public MutableLiveData<LevelBean> mZeroLevelList = new MutableLiveData<>();

    public BillFragmentViewModel(@NonNull Application application) {
        super(application);
        initBillList();
    }

    private void initBillList() {

    }

    private void initLevel() {
        NetUtils.getInstance().getBillPage(new Observer<LevelBean>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e("sunhy", "---> onSubscribe");
            }

            @Override
            public void onNext(LevelBean bean) {
                Log.e("sunhy", "---> onNext");
                if (1 != bean.getCode()) {
                    mZeroLevelList.postValue(bean);
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.e("sunhy", "---> onError");

            }

            @Override
            public void onComplete() {
                Log.e("sunhy", "---> onComplete");

            }
        });
    }


}
