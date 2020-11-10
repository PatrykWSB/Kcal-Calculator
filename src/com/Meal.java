package com;

import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Scanner;

public class Meal {
    private int kcalTotal;
    private float totalCarbo;
    private float totalProtein;
    private float totalFat;
    private String name;
    private ArrayList<Product> products;
    public Scanner keyboard = new Scanner(System.in);
    public int intSwitch = 0;

    public Meal(int kcalTotal, int totalCarbo, int totalProtein, int totalFat, String name){
        this.kcalTotal = kcalTotal;
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

    public String toString(){
        return "Name: " + name + " meal kcal: " + kcalTotal + " meal carbo" + totalCarbo + " meal protein " + totalProtein +" meal fat" + totalFat;
    }

    public void showProducts(){
        for (int i=0; i<products.size(); i++){
            System.out.println(i+1 + ". " + products.get(i).toString());
        }
    }

    public void addProduct(Bases base){
        Product product;
        System.out.println("0. nowy produkt");
        base.showProducts();
        intSwitch = keyboard.nextInt();
        if (intSwitch == 0){
            product = base.addNewProduct();
            products.add(product);
            System.out.println("Podaj wage produktu (w gramach");
            intSwitch = keyboard.nextInt();
            kcalTotal += product.getKcal()*intSwitch/100;
            totalCarbo += product.getCarbo()*intSwitch/100;
            totalProtein += product.getProtein()*intSwitch/100;
            totalFat += product.getFat()*intSwitch/100;
        }
        else {
            product = base.allProducts.get(intSwitch-1);
            products.add(product);
            System.out.println("Podaj wage produktu (w gramach");
            intSwitch = keyboard.nextInt();
            kcalTotal += product.getKcal()*intSwitch/100;
            totalCarbo += product.getCarbo()*intSwitch/100;
            totalProtein += product.getProtein()*intSwitch/100;
            totalFat += product.getFat()*intSwitch/100;
        }
    }

    public void deleteProduct(){
        System.out.println("Który element usunąć? (aby wrócić wpisz 0");
        showProducts();
        intSwitch = keyboard.nextInt();
        if (intSwitch > 0) {
            kcalTotal -= products.get(intSwitch).getKcal()*intSwitch/100;
            totalCarbo -= products.get(intSwitch-1).getCarbo()*intSwitch/100;
            totalProtein -= products.get(intSwitch).getProtein()*intSwitch/100;
            totalFat -= products.get(intSwitch).getFat()*intSwitch/100;
            products.remove(intSwitch-1);
        }
    }
}
