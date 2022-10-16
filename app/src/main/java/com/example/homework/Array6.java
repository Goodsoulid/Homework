package com.example.homework;

import java.util.Arrays;

public class Array6 {
    //The seventh task
    public static void main(String[] args) {
        int[] array = new int[] {88,39,22,44,65,1,12,54,67,20,2,9,39};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current =array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
}
