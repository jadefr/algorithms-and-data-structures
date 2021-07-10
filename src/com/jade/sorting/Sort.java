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
        for (int a : arr) {
            System.out.print(a + " ");
        }
//        Arrays.stream(arr)
//                .asDoubleStream()
//                .forEach(e->System.out.print(e + " "));
    }

    public void mergeSort(int[] arr) {
        int length = arr.length;

        if (length == 1) {
            return;
        }

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

//        System.arraycopy(arr, 0, left, 0, middle);
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;

        int i = 0; // index related to the left array
        int j = 0; // index related to the right array
        int k = 0; // index related to the original array

        while ((i < l) && (j < r)) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // for the case the right array has already ended
        while (i < l) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // for the case the left array has already ended
        while (j < r) {
            arr[k] = right[j];
            j++;
            k++;
        }

//        System.out.println("printing...");
//        for(int a: arr) {
//            System.out.print(a + " ");
//        }
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int swap = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swap;

        return i + 1;
    }

}
