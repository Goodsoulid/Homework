package com.example.homework;

import java.util.ArrayList;

public class Product2 {
    int id;
    String name;
    int price;

    public Product2(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Shop {
    ArrayList<Product2> arrayList = new ArrayList<Product2>();

    void addProduct(int id, String name, int price) {
        boolean noExsept = false;
        for (Product2 shop : arrayList) {
            if (shop.id == id){
                noExsept = true;
                break;
            }
        }
        if (noExsept == false){
            arrayList.add(new Product2(id, name, price));
        }
    }

    ArrayList<Product2> getList () {
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
