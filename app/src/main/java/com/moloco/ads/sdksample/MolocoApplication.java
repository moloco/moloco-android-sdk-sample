package com.moloco.ads.sdksample;

import android.app.Application;

import com.moloco.ads.context.MolocoEntryPoint;

public class MolocoApplication extends Application {
    
    private MolocoEntryPoint molocoEntryPoint;

    @Override
    public void onCreate() {
        super.onCreate();
        molocoEntryPoint = MolocoEntryPoint.newInstance(this);
        molocoEntryPoint.init(getString(R.string.auth_key));
    }

}
