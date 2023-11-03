package btvnbai4.bai3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        // Thực hiện thuật toán sắp xếp chọn cho một mảng 100,000 số ngẫu nhiên
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + elapsedTime + " ms");
    }

    // Phương thức sắp xếp chọn (selection sort)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
