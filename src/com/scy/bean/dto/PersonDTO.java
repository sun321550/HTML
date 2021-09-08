package com.scy.bean.dto;

public class PersonDTO {
    private int gender;
    private double avgScore;

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "gender=" + gender +
                ", avgScore=" + avgScore +
                '}';
    }
}
