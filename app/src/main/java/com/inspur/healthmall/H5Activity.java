package com.inspur.healthmall;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class H5Activity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        loadUrl(launchUrl);
    }
}
