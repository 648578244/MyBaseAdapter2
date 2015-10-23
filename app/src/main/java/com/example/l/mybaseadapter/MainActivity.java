package com.example.l.mybaseadapter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.l.mybaseadapter.adapter.MyAdapter;
import com.example.l.mybaseadapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.id_listview);
        listView.setAdapter(new MyAdapter(this,getDatas()));
    }
    public List<Bean> getDatas() {
        List<Bean> datas = new ArrayList<Bean>();
        for (int i= 0;i<5;i++){
            Bean bean = new Bean("1111","2222","3333","4444",0);
            datas.add(bean);
        }
        for (int i= 0;i<5;i++){
            Bean bean = new Bean("6666","7777","8888","9999",1);
            datas.add(bean);
        }
        return datas;
    }
}
