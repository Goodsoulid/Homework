package com.example.homework;

public class Array4 {
    //The fifth task
    public static void main(String[] args) {
        int[] sol = new int[12];
        int max=0,g=0;
        for(int i=0; i<sol.length; i++){
            sol[i]=(int)(Math.random()*16);
            System.out.print(sol[i]+" ");
        }
        for(int i=0; i<sol.length; i++) {
            if(sol[i]>=max) {
                max = sol[i];
                g = i;
            }
        }
        System.out.println("\nThe maximum element of the array is "+sol[g]);
        System.out.println("Index of its last occurrence - "+g);
    }
}
