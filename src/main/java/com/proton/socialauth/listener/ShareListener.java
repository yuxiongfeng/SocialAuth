package com.proton.socialauth.listener;


import com.proton.socialauth.PlatformType;

/**
 * 分享回调监听
 * Created by tsy on 16/8/5.
 */
public interface ShareListener {
    void onComplete(PlatformType platform_type);

    void onError(PlatformType platform_type, String err_msg);

    void onCancel(PlatformType platform_type);
}
