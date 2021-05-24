package com.manha.lista2ex1;

import java.util.Comparator;

public interface Sorter <T> {
    void sort(T[] array, Comparator<T> comparator);
}
