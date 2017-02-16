package com.example.zzzz.myapp42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        String [] names = {"Name1","Name2","Name3","Name4","Name5","Name6","Name7"};
        String [] phoneNumber = {"PhoneNumber1","PhoneNumber2","PhoneNumber3","PhoneNumber4","PhoneNumber5","PhoneNumber6","PhoneNumber7"};

        Adapter adapter = new Adapter(names,phoneNumber);
        listView.setAdapter(adapter);

    }

    class Adapter extends BaseAdapter {

        String [] na;
        String [] ph;

        Adapter(String[] names, String[] phoneNumber){
            na = names;
            ph = phoneNumber;
        }



        @Override
        public int getCount() {
            return 7;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View View, ViewGroup parent) {

            View v = LayoutInflater.from(MainActivity.this).inflate(R.layout.adapter,null);

            TextView txt1 = (TextView) v.findViewById(R.id.txt1);
            txt1.setText(na[i]);

            TextView txt2 = (TextView) v.findViewById(R.id.txt2);
            txt2.setText(ph[i]);
            return v;
        }
    }
}
