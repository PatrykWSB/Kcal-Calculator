package com;

import java.util.ArrayList;


public class Product {
    private String name;
    private float carbo;
    private float protein;
    private float fat;
    private int kcal;


    public Product(String name, float carbo, float protein, float fat, int kcal) {
        this.name = name;
        this.carbo = carbo;
        this.protein = protein;
        this.fat = fat;
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCarbo() {
        return carbo;
    }

    public void setCarbo(float carbo) {
        this.carbo = carbo;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String toString(){
        return "Name: " + name + " kcal: " + kcal + " carbo: " + carbo + " protein: " + protein + " fat: " + fat;
    }


}
