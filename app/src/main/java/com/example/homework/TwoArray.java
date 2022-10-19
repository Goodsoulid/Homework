package com.example.homework;

public class TwoArray {
    //The first task on two-dimensional arrays
    public static void main (String[] args){
        int[][] a=new int[4][5];
//        int max,min;
        for (int i=0;i < a.length;i++){
            for (int j=0;j < a[i].length;j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i=0;i < a.length;i++){
            for (int j=0;j < a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
