package com.thomas.bgtools;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bg.baseutillib.base.BaseActivity;
import com.bg.baseutillib.tool.NetworkStateReceiver;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private NetworkStateReceiver myNetReceiver;//检查网络
    private Button mRequestHttp;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mRequestHttp = findId(R.id.request_http);
    }

    @Override
    public void initLoad() {
        initNetwork();
    }

    @Override
    public void setListener() {
        mRequestHttp.setOnClickListener(this);
    }

    //网络监测注册广播
    private void initNetwork(){
        myNetReceiver = new NetworkStateReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(myNetReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //移除广播，防止内存泄漏
        unregisterReceiver(myNetReceiver);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.request_http:
                startActivity(RequestActivity.class);
                break;
        }
    }
}
