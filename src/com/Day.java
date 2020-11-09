package com;
import java.util.ArrayList;
import java.util.Date;

public class Day {
    private int bodyWeight;
    private int totalDailyKcal;
    private Date date;
    private ArrayList<Meal> dayMeals;

    public Day(int bodyWeight, int totalDailyKcal, Date date){
        this.bodyWeight = bodyWeight;
        this.totalDailyKcal = totalDailyKcal;
        this.date = date;
    }

    public int getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(int bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public int getTotalDailyKcal() {
        return totalDailyKcal;
    }

    public void setTotalDailyKcal(int totalDailyKcal) {
        this.totalDailyKcal = totalDailyKcal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
