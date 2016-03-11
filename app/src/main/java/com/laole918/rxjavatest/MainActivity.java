package com.laole918.rxjavatest;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

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

//        Observable.from(folders)
//                .flatMap((Func1) (folder) -> { Observable.from(file.listFiles()) })
//                .filter((Func1) (file) -> { file.getName().endsWith(".png") })
//                .map((Func1) (file) -> { getBitmapFromFile(file) })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe((Action1) (bitmap) -> { imageCollectorView.addImage(bitmap) });
    }

//    public class LiftAllTransformer implements Observable.Transformer<Integer, String> {
//        @Override
//        public Observable<String> call(Observable<Integer> observable) {
//            return observable
////                    .lift()
//                    .lift2()
//                    .lift3()
//                    .lift4();
//        }
//    }
}
