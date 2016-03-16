package com.laole918.rxjavatest;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import rx.Observable;
import rx.Subscriber;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById
    Button button;

    @Bean
    MainBean main;

    @AfterViews
    protected void afterViews() {
        Log.e("MainActivity", "我是Activity，我的AfterView执行完了！");
        main.onCreate();
        button.setOnClickListener(view -> onClickButton());
    }

    private void onClickButton() {
//        Observable.fr
        Observable.just("Hello, world!")
                .map(String::hashCode)
                .map(String::valueOf)
                .subscribe(System.out::println, Throwable::printStackTrace, () -> {
                    System.out.println("完成");
                });
//        Observable.
    }
}
