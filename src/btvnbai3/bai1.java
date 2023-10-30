package btvnbai3;

import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 11, 10};
        int max = 0;
        int secondMax = 0;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondMax);
    }
}