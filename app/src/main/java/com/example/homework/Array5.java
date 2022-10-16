package com.example.homework;

import java.util.Arrays;

public class Array5 {
    //The sixth task
    public static void main(String[] args) {
        int [] massive = {21,71,55,20,29,5,7,10,19,18,23,70};

        boolean isSorted = false;
        int caf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < massive.length-1; i++) {
                if(massive[i] > massive[i+1]){
                    isSorted = false;

                    caf = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = caf;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
