package com.example.homework;

public class Phone {

    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Call " + name);
    }

    void receiveCall(String name, String number){
        System.out.println("Call " + name + " " + number);
    }

    String getNumber() {
        return number;
    }


    public static void main(String[] args) {
        Phone phone = new Phone("5558585","Samsung",200);
        Phone phone2 = new Phone("8989595","Apple");
        Phone phone3 = new Phone();

        Print.print(phone);
        Print.print(phone2);
        Print.print(phone3);

        phone.receiveCall("Andrey", phone.getNumber());
        phone2.receiveCall("Sergey", phone2.getNumber());
        phone3.receiveCall("Unknown number");

    }

}

class Print{

    static void print(Phone phone){
        System.out.println(phone.number);
        System.out.println(phone.model);
        System.out.println(phone.weight);
    }



}


