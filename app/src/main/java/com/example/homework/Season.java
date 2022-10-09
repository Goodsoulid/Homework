package com.example.homework;

enum Season {
    SPRING(10), SUMMER(25){
        @Override
        String getDescription() {
            return "Warm season, Summer is one of the four seasons, " +
                    "between spring and autumn, " +
                    "characterized by the highest ambient temperature. " +
                    "On the summer solstice, " +
                    "the days are the longest and the nights are the shortest.";
        }
    },
    AUTUMN(15), WINTER(-10);


    int averageTemp;

    Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    String getDescription() {
        return "Cold season";
    }

    void seasonOfTheYear(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("I love SUMMER");
                break;
            case AUTUMN:
                System.out.println("I love AUTUMM");
                break;
            case WINTER:
                System.out.println("I love WINTER");
                break;
            case SPRING:
                System.out.println("I love SPRING");
                break;
        }
    }


}



