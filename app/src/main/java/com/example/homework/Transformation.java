package com.example.homework;

public class Transformation {
    public static void main(String[] args) {
        Adult adult = new Adult("Caesar", 22, 175);

        Converter<Kid, Adult> converter = x -> new Adult(x.name, x.age, x.height);

        Adult adult1 = converter.convert(adult);

        System.out.println("An adult has the following parameters: name - " + adult1.name + ", age - " + adult1.age + ", weight - " + adult1.height);
    }
}

