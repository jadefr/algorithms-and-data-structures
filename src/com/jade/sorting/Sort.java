package com.jade.sorting;

public class Sort {

    public void bubbleSort(int[] arr) {
        boolean isSorted = false;
        int current;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    current = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = current;
                    isSorted = false;
                }
            }
        }
        System.out.println("");
        for (int a: arr) {
            System.out.print(a + " ");
        }
//        Arrays.stream(arr)
//                .asDoubleStream()
//                .forEach(e->System.out.print(e + " "));
    }
}
