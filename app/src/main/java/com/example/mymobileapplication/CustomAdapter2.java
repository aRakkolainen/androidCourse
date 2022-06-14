package com.example.mymobileapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

    public class CustomAdapter2 extends BaseAdapter {
        LayoutInflater mInFlater;
        ArrayList<String> methods;
        Context context;
        public CustomAdapter2(Context c, ArrayList<String> m) {
            context = c;
            methods = m;
            mInFlater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return methods.size();
        }

        @Override
        public Object getItem(int i) {
            return methods.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = view;
            if (v == null) {
                v = mInFlater.inflate(R.layout.method_list, null);
            }
            TextView methodInfo = (TextView) v.findViewById(R.id.methodTextView);
            try {
                methodInfo.setText(methods.get(i));
            } catch (NullPointerException e) {
                System.out.println("You didn't give a value");
            }
            return v;
        }
    }
