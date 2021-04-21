package com.company;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        reverse(new int[]{6, 4, 2, 6, 4, 2, 7, 9, 3, 1, 3, 4, 5, 8});
    }

    public static void reverse(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
