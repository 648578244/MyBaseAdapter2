package com.example.l.mybaseadapter.utils;

/**
 * Created by ldp on 2015/8/7.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;

public abstract class CommonAdatper<T> extends BaseAdapter {
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;
    private int mLayoutId;
    private int[] mLayoutIds;

    public CommonAdatper(Context context, List<T> datas, int layoutId) {
        this.mContext = context;
        this.mDatas = datas;
        mInflater = LayoutInflater.from(context);
        this.mLayoutId = layoutId;

    }

    public CommonAdatper(Context context, List<T> datas, int[] layoutIds) {
        this.mContext = context;
        this.mDatas = datas;
        mInflater = LayoutInflater.from(context);
        this.mLayoutIds = layoutIds;

    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return setItemViewType(mDatas, position);
    }

    @Override
    public int getViewTypeCount() {
        return mLayoutIds.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        switch (getItemViewType(position)) {
            case 0:
                holder = ViewHolder.get(mContext, convertView, parent, mLayoutIds[0], position);
                convertView1(holder, getItem(position));
                break;
            case 1:
                holder = ViewHolder.get(mContext, convertView, parent, mLayoutIds[1], position);
                convertView2(holder, getItem(position));
                break;
        }


        return holder.getConvertView();
    }
    protected abstract void convertView1(ViewHolder holder, T t);
    protected abstract void convertView2(ViewHolder holder, T t);

    protected abstract int setItemViewType(List<T> mDatas, int position);
}
