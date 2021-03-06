package com.sun.billmanager.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetUtils {

    private Retrofit retrofit;

    private static final NetUtils ourInstance = new NetUtils();

    public static NetUtils getInstance() {
        return ourInstance;
    }

    private NetUtils() {
        retrofit = new Retrofit.Builder()
                .client(new OkHttpClient().newBuilder()
                        .readTimeout(5, TimeUnit.SECONDS)
                        .writeTimeout(5, TimeUnit.SECONDS)
                        .connectTimeout(5, TimeUnit.SECONDS)
                        .retryOnConnectionFailure(false)
                        .build())
                .baseUrl(Constant.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    public void getBillPage() {
//        retrofit.create(BillPage.class)
//                .getBillList()
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(o);
    }
}
