package com.example.homework;

public class CarException {

    private String model;
    private int speed;
    private int price;


    public CarException(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int start() throws Exception {
        int randomNumber = (int) (Math.random() * 20);
        if (randomNumber % 2 == 0) {
//            System.out.println("Engine Start");
            return randomNumber;
        } else {
            throw new Exception();
        }
    }

    public void engineStart() {
        System.out.println("Engine Start");
    }

    public static void main(String[] args) throws Exception {
        CarException car1 = new CarException("Bugatti", 120, 100150);
        CarException car2 = new CarException("Bugatti", 100, 100200);
        try {
            car1.start();
        } catch (Exception e) {
            car1.engineStart();
            car1.start();
        }
        try {
            car2.start();
        } catch (Exception e) {
            car2.engineStart();
            car2.start();
        }
    }
}



