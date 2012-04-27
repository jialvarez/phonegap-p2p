package com.chariotsolutions.nfc.demo.p2p;

import org.apache.cordova.*;
import android.os.Bundle;

public class P2PDemo extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
