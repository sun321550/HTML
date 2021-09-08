package com.scy.bean;

public class Score {
    private  int  s_id;
    private  int  c_id;
    private  String  s_score;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getS_score() {
        return s_score;
    }

    public void setS_score(String s_score) {
        this.s_score = s_score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "s_id=" + s_id +
                ", c_id=" + c_id +
                ", s_score='" + s_score + '\'' +
                '}';
    }
}
