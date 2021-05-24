package com.manha.lista1ex2;

import java.util.Comparator;

public class QuickSorter<T> implements Sorter<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        quickSort(array, 0, array.length - 1, comparator);
    }

    private void quickSort(T[] array, int begin, int end, Comparator<T> comparator) {
        if(end > begin) {
            int indexPivot = divide(array, begin, end, comparator);
            quickSort(array, begin, indexPivot - 1, comparator);
            quickSort(array, indexPivot + 1, end, comparator);
        }
    }

    private int divide(T[] array, int begin, int end, Comparator<T> comparator) {
        int left, right = end;
        T pivot = array[begin];
        left = begin + 1;

        while(left <= right) {
            while(left <= right && comparator.compare(array[left], pivot) <= 0) {
                left++;
            }

            while(right >= left && comparator.compare(array[right], pivot) > 0) {
                right--;
            }

            if(left < right) {
                swap(array, right, left);
                left++;
                right--;
            }
        }

        swap(array, begin, right);
        return right;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
