package com;

import java.util.ArrayList;

public class Meal {
    private int kcalTotal;
    private int totalWeight;
    private float totalCarbo;
    private float totalProtein;
    private float totalFat;
    private String name;
    private ArrayList<Product> products;

    public Meal(int kcalTotal, int totalWeight, int totalCarbo, int totalProtein, int totalFat, String name){
        this.kcalTotal = kcalTotal;
        this.totalWeight = totalWeight;
        this.totalCarbo = totalCarbo;
        this.totalProtein = totalProtein;
        this.totalFat = totalFat;
        this.name = name;
    }

    public int getKcalTotal() {
        return kcalTotal;
    }

    public void setKcalTotal(int kcalTotal) {
        this.kcalTotal = kcalTotal;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public float getTotalCarbo() {
        return totalCarbo;
    }

    public void setTotalCarbo(float totalCarbo) {
        this.totalCarbo = totalCarbo;
    }

    public float getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(float totalProtein) {
        this.totalProtein = totalProtein;
    }

    public float getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(float totalFat) {
        this.totalFat = totalFat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
