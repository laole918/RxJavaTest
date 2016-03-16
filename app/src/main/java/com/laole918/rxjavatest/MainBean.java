package com.laole918.rxjavatest;

import android.util.Log;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.ViewById;

/**
 * Created by laole918 on 2016/3/16 0016.
 */
@EBean
public class MainBean {

    @ViewById
    Button button;

    @AfterViews
    protected void afterViews() {
        Log.e("MainBean", "我是Bean，我的AfterView执行完了！");
    }

    public void onCreate() {
        if(button == null) {
            Log.e("MainBean", "卧槽，Button是NULL啊！！！！");
        }
    }
}
