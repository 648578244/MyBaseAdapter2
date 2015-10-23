package com.example.l.mybaseadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.l.mybaseadapter.R;
import com.example.l.mybaseadapter.bean.Bean;
import com.example.l.mybaseadapter.utils.CommonAdatper;
import com.example.l.mybaseadapter.utils.ViewHolder;

import java.util.List;

/**
 * Created by ldp on 2015/8/7.
 */
public class MyAdapter extends CommonAdatper<Bean> {

    public MyAdapter(Context context, List<Bean> datas) {
        super(context, datas, createLayout());


    }

    private static int[] createLayout() {
        int[] layoutIds = {R.layout.item_listview, R.layout.item_listview};
        return layoutIds;
    }


//    @Override
//    protected void convert(ViewHolder holder, Bean bean) {
////        ((TextView)holder.getView(R.id.id_phone)).setTag(bean.getPhone());
////        ((TextView)holder.getView(R.id.id_desc)).setTag(bean.getDesc());
////        ((TextView)holder.getView(R.id.id_time)).setTag(bean.getTime());
////        ((TextView)holder.getView(R.id.id_title)).setTag(bean.getTitle());
//        holder.setText(R.id.id_title, bean.getTitle()).setText(R.id.id_phone, bean.getPhone());
//    }

    @Override
    protected void convertView1(ViewHolder holder, Bean bean) {
        holder.setText(R.id.id_title, bean.getTitle()).setText(R.id.id_phone, bean.getPhone());
    }

    @Override
    protected void convertView2(ViewHolder holder, Bean bean) {
        holder.setText(R.id.id_title, bean.getTitle()).setText(R.id.id_phone, bean.getPhone());
    }

    @Override
    protected int setItemViewType(List<Bean> mDatas, int position) {
        return mDatas.get(position).getType();
    }


}
