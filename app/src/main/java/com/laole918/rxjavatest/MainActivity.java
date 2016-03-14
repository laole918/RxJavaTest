package com.laole918.rxjavatest;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import rx.Observable;
import rx.Subscriber;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById
    Button button;

    @AfterViews
    protected void afterViews() {
        button.setOnClickListener(view -> onClickButton());
    }

    private void onClickButton() {
        Observable.just("Hello, world!")
                .map(s -> s.hashCode())
                .map(i -> String.valueOf(i))
                .subscribe(s -> System.out.println(s), e -> e.printStackTrace(), () -> {
                    System.out.println("完成");
                });
//        Observable.
    }
}
