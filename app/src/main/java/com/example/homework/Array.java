package com.example.homework;

public class Array {
    //The first task
    public static void main(String[] args) {
        int[] mas1 = new int[9];
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i + " ");
            if (i == 20) {
                System.out.println();
            }
        }
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }
}
