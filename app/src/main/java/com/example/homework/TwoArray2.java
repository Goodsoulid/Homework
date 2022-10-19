package com.example.homework;

public class TwoArray2 {
    //The fourth task
    public static void main(String[] args) {
        int[][][] a = new int[3][3][3];
        int max, min;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}


