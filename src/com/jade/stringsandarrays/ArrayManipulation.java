package com.jade.stringsandarrays;

public class ArrayManipulation {

    /**
     * given an array, of size m * n, print its elements in a spiral order
     */
    public void printSpiral(int[][] matrix, int m, int n) {
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        int dir = 0;

        while ((top <= bottom) && (left <= right)) {
            if (dir == 0) {
                for (int i = left; i <= right; i ++) {
                    System.out.print(" " + matrix[top][i]);
                }
                top++;
            }
            if (dir == 1) {
                for (int i = top; i <= bottom; i ++) {
                    System.out.print(" " + matrix[i][right]);
                }
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i --) {
                    System.out.print(" " + matrix[bottom][i]);
                }
                bottom--;
            }
            if (dir == 3) {
                for (int i = bottom; i >= top; i --) {
                    System.out.print(" " + matrix[i][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
    }
}
