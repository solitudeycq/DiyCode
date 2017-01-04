package com.solitudeycq.diycode.utils;

import android.util.Log;

/**
 * Created by solitudeycq on 2017/1/4.
 */

public class LogControl {
    private static boolean usable = true;
    public static void setUSable(boolean u){
        usable = u;
    }
    public static void e(String tag,String content){
        if(usable){
            Log.e(tag, content);
        }
    }
    public static void e(String tag,int content){
        if(usable){
            Log.e(tag, String.valueOf(content));
        }
    }
    public static void d(String tag,String content){
        if(usable){
            Log.d(tag, content);
        }
    }
    public static void d(String tag,int content){
        if(usable){
            Log.d(tag, String.valueOf(content));
        }
    }
    public static void w(String tag,String content){
        if(usable){
            Log.w(tag, content);
        }
    }
    public static void w(String tag,int content){
        if(usable){
            Log.w(tag, String.valueOf(content));
        }
    }
    public static void i(String tag,String content){
        if(usable){
            Log.i(tag, content);
        }
    }
    public static void i(String tag,int content){
        if(usable){
            Log.i(tag, String.valueOf(content));
        }
    }
    public static void out(String str){
        if(usable){
            System.out.println(str);
        }
    }
}
