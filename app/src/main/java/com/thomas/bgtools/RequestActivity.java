package com.thomas.bgtools;

import android.view.View;

import com.bg.baseutillib.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 网络请求示例
 */
public class RequestActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_request;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);

    }

    @Override
    public void initLoad() {

    }

    @Override
    public void setListener() {

    }

    @OnClick({R.id.bt_getdata, R.id.bt_get, R.id.bt_post, R.id.bt_json, R.id.bt_upload, R.id.bt_download, R.id.bt_my_api, R.id.bt_changeHostApi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_getdata:
                break;
            case R.id.bt_get:
                break;
            case R.id.bt_post:
                break;
            case R.id.bt_json:
                break;
            case R.id.bt_upload:

                break;
            case R.id.bt_download:
                break;
            case R.id.bt_my_api:
                break;
            case R.id.bt_changeHostApi:
                break;
        }
    }
}
