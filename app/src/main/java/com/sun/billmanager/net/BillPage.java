package com.sun.billmanager.net;

import com.sun.billmanager.data.bean.BillItem;

import io.reactivex.Observable;
import retrofit2.http.POST;

public interface BillPage {

    @POST
    Observable<BillItem> getBillList();

}
