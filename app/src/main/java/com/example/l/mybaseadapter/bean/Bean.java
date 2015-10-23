package com.example.l.mybaseadapter.bean;

/**
 * Created by ldp on 2015/8/7.
 */
public class Bean {
    private String title;
    private String phone;
    private String desc;
    private String time;
    private int type;
    public String getTitle() {
        return title;
    }

    public Bean(String title, String phone, String desc, String time,int type) {
        this.title = title;
        this.phone = phone;
        this.desc = desc;
        this.time = time;
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
