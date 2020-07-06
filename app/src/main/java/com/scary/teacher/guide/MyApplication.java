package com.scary.teacher.guide;

import android.app.Application;

import com.flurry.android.FlurryAgent;
import com.ljvpbsdiwc.adx.service.AdsExchange;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AdsExchange.init(this, "5ee635c335810c06f487c066");
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "D8DVHVHWG5CFS5GXGDNK");
    }
}
