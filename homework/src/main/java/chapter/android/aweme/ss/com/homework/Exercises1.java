package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 *
 * Exercises1: onCreate: called
 * Exercises1: onStart: called
 * Exercises1: onResume: called
 * 向左旋转
 * Exercises1: onPause: called
 * Exercises1: onStop: called
 * Exercises1: onDestroy: called
 * Exercises1: onCreate: called
 * Exercises1: onStart: called
 * Exercises1: onResume: called
 * 向右旋转
 * Exercises1: onPause: called
 * Exercises1: onStop: called
 * Exercises1: onDestroy: called
 * Exercises1: onCreate: called
 * Exercises1: onStart: called
 * Exercises1: onResume: called
 * 退出应用
 * Exercises1: onPause: called
 * Exercises1: onStop: called
 * Exercises1: onDestroy: called
 *
 */
public class Exercises1 extends AppCompatActivity {
    public static final String TAG="Exercises1";
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: called");
    }
}
