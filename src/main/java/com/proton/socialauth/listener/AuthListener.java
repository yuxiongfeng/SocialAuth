package com.proton.socialauth.listener;


import com.proton.socialauth.PlatformType;

import java.util.Map;

/**
 * Created by tsy on 16/8/4.
 */
public interface AuthListener {
    void onComplete(PlatformType platform_type, Map<String, String> map);

    void onError(PlatformType platform_type, String err_msg);

    void onCancel(PlatformType platform_type);
}
