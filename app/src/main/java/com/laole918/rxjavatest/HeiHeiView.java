package com.laole918.rxjavatest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by laole918 on 2016/3/17 0017.
 */
@EViewGroup(R.layout.layout_heihei)
public class HeiHeiView extends LinearLayout {

    @ViewById
    Button button2;

    public HeiHeiView(Context context) {
        this(context, null);
    }

    public HeiHeiView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HeiHeiView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void bindData() {
        button2.setText("嘿嘿我成功了。");
    }
}
