package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {

    public User[] users;
    public ListView listUsers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_tiktok_main);

        users = new User[] {
                new User(1, "赵", "zhao", 5.1f),
                new User(1, "钱", "qian", 4.9f),
                new User(1, "孙", "sun", 4.7f),
                new User(1, "李", "li", 4.1f),
                new User(1, "周", "zhou", 3.8f),
                new User(1, "吴", "wu", 3.2f),
                new User(1, "郑", "zhen", 2.9f),
                new User(1, "王", "wang", 1.0f),
                new User(1, "赵", "zhao", 5.1f),
                new User(1, "钱", "qian", 4.9f),
                new User(1, "孙", "sun", 4.7f),
                new User(1, "李", "li", 4.1f),
                new User(1, "周", "zhou", 3.8f),
                new User(1, "吴", "wu", 3.2f),
                new User(1, "郑", "zhen", 2.9f),
                new User(1, "王", "wang", 1.0f),
        };

        listUsers = findViewById(R.id.listUsers);
        ListAdapter adapterT = new MyAdapter();
        listUsers.setAdapter(adapterT);

    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return users.length;
        }

        @Override
        public Object getItem(int position) {
            return users[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflaterT = LayoutInflater.from(getBaseContext());
            View view = layoutInflaterT.inflate(R.layout.im_list_item, null);
            if (convertView == null)
            {
                convertView = view;
                Log.d("ListView", "getView: " + position);
            }

            CircleImageView iv_avatar = convertView.findViewById(R.id.iv_avatar);
            ImageView robot_notice = convertView.findViewById(R.id.robot_notice);
            TextView tv_title = convertView.findViewById(R.id.tv_title);
            TextView tv_description = convertView.findViewById(R.id.tv_description);
            TextView tv_time = convertView.findViewById(R.id.tv_time);

            User userT = users[position];

            tv_title.setText(userT.name);
            tv_description.setText(userT.description);
            tv_time.setText(String.valueOf(userT.time));

            return convertView;
        }
    }

}
