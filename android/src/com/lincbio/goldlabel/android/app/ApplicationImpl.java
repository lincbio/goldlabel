package com.lincbio.goldlabel.android.app;

import android.app.Application;
import android.content.res.Configuration;

public class ApplicationImpl extends Application {

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
	}

}
