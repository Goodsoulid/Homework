package com.example.homework;

public class Car1 {

    private String nameCar;
    private int speed;
    private int price;

    public Car1(String nameCar, int speed, int price) {
        this.nameCar = nameCar;
        this.speed = speed;
        this.price = price;
    }

    public Car1() {
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
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



    void startCar() throws carException1 {
        final int min = 0;
        final int max = 20;
        final int random = min + (int) (Math.random() * ((max - min) + 1));
        if(random % 2 == 0){
           // System.out.println("Car don't started");
            throw new carException1("Car don't started " + random);
        }else  {
            System.out.println("Car started " + random);
        }
    }

    public static void main(String[] args) {
        Car1 audi = new Car1("Audi", 100, 1000);
        Car1 bmw = new Car1("BMW", 200, 2000);
        Car1 lexus = new Car1("Lexus", 300, 3000);
        try {
            audi.startCar();
        } catch (carException1 e) {
            System.out.println(e.getMessage());
        }

        try {
            bmw.startCar();
        } catch (carException1 e) {
            System.out.println(e.getMessage());
        }

        try {
            lexus.startCar();
        } catch (carException1 e) {
            System.out.println(e.getMessage());
        }

    }
}

class carException1 extends Exception {

    private String message;

    carException1(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
