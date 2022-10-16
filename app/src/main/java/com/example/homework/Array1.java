package com.example.homework;

public class Array1 {
    //The second task
    public static void main(String[] args) {
        int[] quantity = new int[50];
        for(int i=0,e=1; i<quantity.length; e=e+2,i++){
            quantity[i] = e;
            System.out.print(quantity[i]+ " ");
        }
        for(int i=quantity.length-1; i>=0; i--) {
            System.out.print(quantity[i]+" ");
        }
    }
}
