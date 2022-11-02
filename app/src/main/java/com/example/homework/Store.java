package com.example.homework;

public class Store {

    private int product = 0;
    public synchronized void get(){
        while (product<1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("The buyer bought 1 product");
        System.out.println("Total goods in stock " + product);
        notify();
    }
    public synchronized void put(){
        while (product>=3){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("The manufacturer added 1 product");
        System.out.println("Goods in stock " + product);
        notify();
    }
}

class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
        System.out.println("The product filled in completely");
    }
}

class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get();
        }
        System.out.println("I took everything");
    }
}
