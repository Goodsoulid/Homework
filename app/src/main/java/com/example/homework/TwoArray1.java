package com.example.homework;

import java.util.Arrays;

public class TwoArray1 {
    //The second task with a three-dimensional array
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                        {1,2,3,4},
                        {4,5}
                },
                {
                        {7}
                }
        };

        for (int[][] a: numbers){
            for (int[] b: a){
                for (int number : b){
                    System.out.print(number + "\t");
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
