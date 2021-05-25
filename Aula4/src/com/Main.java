package com;

import java.util.AbstractMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List.of(7,20,3,4,5,10,10)
                .stream()
                .filter(integer -> integer > 10)
                .findFirst()
                .ifPresentOrElse(
                        integer -> System.out.println(integer * 2),
                        () -> System.out.println("Não achei")
                );

        var max = List.of(7, 20, 3, 4, 5, 10, 50, 90, 30, 12)
                .stream()
                .map(integer -> new AbstractMap.SimpleEntry<>(integer, integer * 2 / ((integer - 1) / 2)))
                .max(Map.Entry.comparingByValue());

        System.out.println(max.get().getKey());
    }
}
