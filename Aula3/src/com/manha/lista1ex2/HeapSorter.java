package com.manha.lista1ex2;

import java.util.Comparator;

public class HeapSorter<T> implements Sorter<T> {

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) heapify(array, length, i, comparator);

        for (int i = length - 1; i > 0; i--) {
            swap(array, 0, i);

            heapify(array, i, 0, comparator);
        }
    }

    void heapify(T[] array, int length, int i, Comparator<T> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && comparator.compare(array[left], array[largest]) > 0) largest = left;

        if (right < length && comparator.compare(array[right], array[largest]) > 0) largest = right;

        if (largest != i) {
            swap(array, i, largest);

            heapify(array, length, largest, comparator);
        }
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
