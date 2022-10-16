package com.example.homework;

public class Array2 {
    //The third task
    public static void main(String[] args) {
        int[] creature = new int[15];
        int u;
        u = 0;
        for(int i=0; i<creature.length; i++){
            creature[i] = (int)(Math.random()*100);
        }
        for(int i=0; i<creature.length; i++) {
            if(creature[i]%2==0) {
                u++;
            }
            System.out.print(creature[i]+" ");
        }
        System.out.println();
        System.out.println(u);
    }
}
