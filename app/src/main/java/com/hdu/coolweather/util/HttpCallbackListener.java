package com.hdu.coolweather.util;

/**
 * Created by hdu on 15/4/10.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
