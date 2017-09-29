package com.bg.baseutillib.interfaceutil;

/**
 * Created by pc on 2017/9/18.
 * 权限申请接口
 */

public interface PermissionsResultListener {

    void onPermissionGranted();

    void onPermissionDenied();
}
