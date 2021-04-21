package com.company;

public class MinMaxInAnArray {
    public static void main(String[] args) {
        System.out.println(minElement(new int[]{4, 6, 7, 8, 9, 1, 6}));
        System.out.println(maxElement(new int[]{4, 6, 7, 8, 9, 1, 6}));
    }

    public static int minElement(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    public static int maxElement(int[] arr) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }
}
