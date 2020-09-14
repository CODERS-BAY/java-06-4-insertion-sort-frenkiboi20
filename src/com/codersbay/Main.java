package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] unsorted = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};

        unsorted = insertionSort(unsorted);

        System.out.println(Arrays.toString(unsorted));

    }

    public static int[] insertionSort(int array[]) {

        for (int j = 1; j < array.length; j++) {

            int key = array[j];
            int i = j - 1;

            while ((i > -1) && (array[i] > key)) {

                array[i + 1] = array[i];
                i--;

            }

            array[i + 1] = key;
        }
        return array;
    }
}