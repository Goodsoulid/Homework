package com.example.homework;

@FunctionalInterface
public interface Converter<T, N> {

    N convert(Adult t);

    static <T> boolean isNotNull(T t) {
        return t != null;
    }

    default void writeToConsole(T t) {
        System.out.println("Current object - " + t.toString());
    }

    boolean equals(Object obj);
}
