package com.manha.lista2ex1;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class RunSorters {
    public static void main(String[] args) throws ClassNotFoundException, IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Integer[] numbers = { 20, 30, 10, 40, 15, 60, 90, 70, 25 };
        String[] strings = { "rodrigo", "josias", "lucas", "antonio", "zacarias", "fabio" };
        Sorter sorter = SorterFactory.getInstance();

        sorter.sort(numbers, Comparator.naturalOrder());
        sorter.sort(strings, Comparator.naturalOrder());
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));

        // benchmark

        BubbleSorter<Integer> bubbleSorter = new BubbleSorter<>();
        benchMark(bubbleSorter);

        QuickSorter<Integer> quickSorter = new QuickSorter<>();
        benchMark(quickSorter);

        HeapSorter<Integer> heapSorter = new HeapSorter<>();
        benchMark(heapSorter);
    }

    private static void benchMark(Sorter<Integer> sorter) {
        Random random = new Random();
        Integer[] benchMarkNumbers = random.ints(10000, 0, 5000).boxed().toArray(Integer[]::new);

        Time time = new Time();
        time.start();
        sorter.sort(benchMarkNumbers, Comparator.naturalOrder());
        time.end();
        System.out.println(time.elapsedTime());
    }
}
