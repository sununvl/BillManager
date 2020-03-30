package com.sun.billmanager.net;

import com.sun.billmanager.bean.LevelBean;

import io.reactivex.Observable;
import retrofit2.http.POST;

public interface BillPage {

    @POST("/getDegree")
    Observable<LevelBean> getBillList();
}
