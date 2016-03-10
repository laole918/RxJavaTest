package com.laole918.rxjavatest;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById
    Button button;

    @AfterViews
    protected void afterViews() {
        button.setOnClickListener(view -> Log.e("lambda", "lambda"));
        new Thread(() -> {
            Log.e("lambda", "lambda in thread");
        }).start();
    }
}
