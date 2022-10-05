package com.example.homework;

public class Transport {
    public void beep(){
        System.out.println("С дорогииии!!!");
    }

    public void drive(){
        System.out.println("Вау я еду");
    }

    public static void main(String[] args) {
        Transport bicycle = new Transport();
        TransportVehicle car = new TransportVehicle();
        TransportVehicle tractor = new TransportVehicle();
        car.startEngine();
        tractor.startEngine();
        bicycle.drive();

    }
}

class TransportVehicle extends Transport {
    public void startEngine(){
        System.out.println("Мотор завелся");
    }
}















