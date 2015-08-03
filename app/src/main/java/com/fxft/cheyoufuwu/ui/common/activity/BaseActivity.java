package com.fxft.cheyoufuwu.ui.common.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 基础的activity，带有监测应用网络连接的功能
 * Created by ChenDJ on 2015/8/3.<br>
 */
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * 注册网络状态监听
     */
    private BroadcastReceiver connectionReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComponent(savedInstanceState);
        initEvent();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        connectionReceiver = new AppNetWorkConnectionReceiver();
        registerReceiver(connectionReceiver, intentFilter);
    }

    private class AppNetWorkConnectionReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectMgr = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
            NetworkInfo mobNetInfo = connectMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            NetworkInfo wifiNetInfo = connectMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if (!mobNetInfo.isConnected() && !wifiNetInfo.isConnected()) {
                //未连接
                onNetWorkReConnected();
            } else {
                //已连接
                onNetWorkConnectFail();
            }
        }
    }

    protected abstract void initComponent(Bundle savedInstanceState);

    protected abstract void initEvent();

    protected abstract void pause();

    protected abstract void resume();

    protected abstract void destory();

    protected abstract void onNetWorkReConnected();

    protected abstract void onNetWorkConnectFail();

    @Override
    protected void onResume() {
        resume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        pause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(connectionReceiver);
        destory();
        super.onDestroy();
    }
}
