package com.example.homework;

import java.util.ArrayList;

public class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Shop {
    ArrayList<Product> arrayList = new ArrayList<Product>();

    void addProduct(int id, String name, int price) {
        boolean noExsept = false;
        for (Product shop : arrayList) {
            if (shop.id == id){
                noExsept = true;
                break;
            }
        }
        if (noExsept == false){
            arrayList.add(new Product(id, name, price));
        }
    }

    ArrayList<Product> getList () {
        return arrayList;
    }
}

class Print {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(10,"Apple", 10);
        shop.addProduct(10,"Potato", 12);
        shop.addProduct(8,"Orange", 15);
        System.out.println(shop.arrayList);



    }
}
