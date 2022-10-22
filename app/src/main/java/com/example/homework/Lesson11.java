package com.example.homework;

import java.util.Arrays;

public class Lesson11 {
    //The third task
    public static void main(String[] args) {
        int[][] numbers = {{3,1,4}, {6,2,5}, {7,9,8}};

        for (int[] number1D: numbers){
            Arrays.sort(number1D);
            for (int number: number1D){
                System.out.print(number+ " ");
                //1 3 4 2 5 6 7 8 9
            }
        }

        System.out.println();

        for (int [] number1D: numbers){
            for (int number = 0; number < number1D.length; number++){
                System.out.println(number1D[number1D.length-1]-number);
                //432654987
            }
        }
    }
}
