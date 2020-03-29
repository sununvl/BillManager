package com.sun.billmanager.data;

import com.sun.billmanager.data.bean.BillItem;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

public class DataPublisher {

    private static final DataPublisher instance = new DataPublisher();

    private BehaviorSubject<List<BillItem>> mBillListPublisher = BehaviorSubject.create();

    public static DataPublisher getInstance() {
        if (instance == null) {
            throw new RuntimeException();
        }
        return instance;
    }

    public Disposable subBillList(Consumer<List<BillItem>> o) {
        return mBillListPublisher.observeOn(AndroidSchedulers.mainThread()).subscribe(o);
    }

    private int temp = 3;


}
