package com.example.a21listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<SocialNet> list = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        SocialNet s1 = new SocialNet(R.drawable.facebook,"Facebok","Dhoka");
        SocialNet s2 = new SocialNet(R.drawable.twitter,"Twitter","Complaints");
        SocialNet s3 = new SocialNet(R.drawable.youtube,"Youtube","Study");
        SocialNet s4 = new SocialNet(R.drawable.insta,"Instagram","barbadi");
        SocialNet s5 = new SocialNet(R.drawable.pinterest,"Pinterest","pics");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        MyAdapter adapter = new MyAdapter(this);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<SocialNet>{

        public MyAdapter(Context context) {
            super(context, R.layout.mylist,list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.mylist,parent,false);
            TextView t1,t2;
            ImageView img;
            t1 = view.findViewById(R.id.title);
            t2 = view.findViewById(R.id.subtitle);
            img = view.findViewById(R.id.imageView);
            SocialNet data = list.get(position);
            t1.setText(data.getTitle());
            t2.setText(data.getSubTitle());
            img.setImageResource(data.getImg());

            return view;
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}



