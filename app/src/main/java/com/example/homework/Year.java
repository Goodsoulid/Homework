package com.example.homework;

public class Year {

    public static void main(String[] args) {
       Season season = Season.SUMMER;
       System.out.println(season.getDescription());
       Season.SUMMER.seasonOfTheYear(season);

        for (Season seasons : Season.values()) {
            System.out.println("Season - " + seasons + " Temperature " + seasons.averageTemp);

        }
    }
}






