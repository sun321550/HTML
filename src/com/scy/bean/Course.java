package com.scy.bean;

public class Course {
    private int c_id;
    private  String c_name;
    private  int t_id;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", t_id=" + t_id +
                '}';
    }
}
