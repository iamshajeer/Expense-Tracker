package com.droidev.util.expensetracker.utils;

import android.util.Log;

/**
 * Created by shajeer on 4/1/16.
 */
public class LogUtils {

    public static void LOGD(String tag, String message) {
        Log.d(tag, message);
    }

    public static void LOGE(String tag, String message) {
        Log.e(tag, message);
    }

    public static void LOGI(String tag, String message) {
        Log.i(tag, message);
    }
}
