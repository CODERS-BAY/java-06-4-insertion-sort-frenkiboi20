package com.codersbay;

public class Main {

    public static void main(String[] args) {

        int[] unsorted = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};

        unsorted = insertionSort(unsorted);

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + ", ");
        }

    }

    public static int[] insertionSort(int[] zahlen) {

        int[] sorted = new int[zahlen.length];

        for (int i = 0; i < zahlen.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < zahlen.length; j++) {
                if (min > zahlen[j]) {
                    int k = min;
                    min = zahlen[j];
                    zahlen[j] = k;
                }
            }
            sorted[i] = min;
        }
        return sorted;
    }
}