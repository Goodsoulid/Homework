package com.example.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product {
    private final String name;
    private final int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", cost=" + cost + '}';
    }
}

class Main{

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("морковь", 10000));
        products.add(new Product("яблоко", 12300));
        products.add(new Product("банан", 12200));
        products.add(new Product("треугольник", 10100));

        products.sort(Comparator.comparingLong(Product::getCost));
        System.out.println(products);
        products.sort(Comparator.comparingLong(Product::getCost).reversed());
        System.out.println(products);

    }

}
