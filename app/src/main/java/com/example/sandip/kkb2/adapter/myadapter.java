package com.example.sandip.kkb2.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sandip.kkb2.R;

import java.util.ArrayList;

import mypojo.pojo;

/**
 * Created by sandip on 12-02-2018.
 */

public class myadapter extends BaseAdapter {
    Activity a;
    int res;
    ArrayList<pojo> al;
    public myadapter(Activity a, int res, ArrayList<pojo> al){
    this.a = a;
    this.res = res;
    this.al = al;
    }
    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(a).inflate(res,viewGroup,false);
        TextView tv1 = v.findViewById(R.id.textView2);
        TextView tv2 = v.findViewById(R.id.textView3);
        Button b = v.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        pojo p = al.get(i);
        tv1.setText(p.getText1());
        tv2.setText(p.getText2());
        return v;
    }
}
