package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_chatroom, null);
        setContentView(view);
        int count = getViewCount(view);
        Log.d("ViewCount", "[" + count + "]");
        //ViewCount [7]
    }

    public static int getViewCount(View view) {

        int count = 0;
        boolean isSameType = view instanceof ViewGroup;
        if (isSameType) {
            ViewGroup viewGroup = (ViewGroup)view;
            int numItem = viewGroup.getChildCount();
            if (numItem > 0) {
                for (int i=0;i<numItem;i++) {
                    count += getViewCount(viewGroup.getChildAt(i));
                }
                count += numItem;
            }
        }

        return count;
    }
}
