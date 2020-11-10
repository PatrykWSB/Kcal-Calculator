package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Bases {
    public ArrayList<Day> days;
    public ArrayList<Meal> readyMeals;
    public ArrayList<Product> allProducts;

    public Scanner keyboard = new Scanner(System.in);

    public Product addNewProduct() {
        Product product;
        System.out.println("Podaj nazwe produktu");
        String name = keyboard.nextLine();
        System.out.println("Podaj weglowodany na 100g");
        float carbo = keyboard.nextFloat();
        System.out.println("Podaj białka na 100g");
        float protein = keyboard.nextFloat();
        System.out.println("Podaj tłuszcz na 100g");
        float fat = keyboard.nextFloat();
        System.out.println("Podaj kcal na 100g");
        int kcal = keyboard.nextInt();
        product = new Product(name, carbo, protein, fat, kcal);
        allProducts.add(product);
        return product;
    }

    public void showProducts(){
        for (int i=0; i<allProducts.size(); i++){
            System.out.println(i+1 + ". " + allProducts.get(i).toString());
        }
    }
}
