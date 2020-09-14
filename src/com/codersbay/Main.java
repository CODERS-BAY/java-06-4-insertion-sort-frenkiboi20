package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] unsorted = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};

        unsorted = insertionSort(unsorted);

        System.out.println(Arrays.toString(unsorted));

    }

    public static int[] insertionSort(int[] array) {

        for (int startOfUnsorted = 1; startOfUnsorted < array.length; startOfUnsorted++) {

            int nextUnsortedElement = array[startOfUnsorted];
            int greatestElementIndex = startOfUnsorted - 1;

            while ((greatestElementIndex > -1) && (array[greatestElementIndex] > nextUnsortedElement)) {

                array[greatestElementIndex + 1] = array[greatestElementIndex];
                greatestElementIndex--;

            }

            array[greatestElementIndex + 1] = nextUnsortedElement;
        }
        return array;
    }
}