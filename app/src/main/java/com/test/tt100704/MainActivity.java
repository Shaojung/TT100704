package com.test.tt100704;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Map<String, Object>> mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        mylist = new ArrayList<>();
        Map m1 = new HashMap();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img", R.drawable.c1);
        mylist.add(m1);

        Map m2 = new HashMap();
        m2.put("city", "台中");
        m2.put("code", "04");
        m1.put("img", R.drawable.c2);
        mylist.add(m2);

        Map m3 = new HashMap();
        m3.put("city", "台南");
        m3.put("code", "06");
        m1.put("img", R.drawable.c3);
        mylist.add(m3);

        SimpleAdapter adapter = new SimpleAdapter(
                MainActivity.this,
                mylist,
                R.layout.myitem,
                new String[] {"city", "code", "img"},
                new int[] {R.id.textView, R.id.textView2, R.id.imageView}

        );

        lv.setAdapter(adapter);

    }
}
