package btvnbai3;

import java.util.Arrays;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,22,12,30,80};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so muon chen");
        int x = sc.nextInt();
        System.out.println("nhap vi tri muon chen ");
        int index = sc.nextInt();
        int[]newArr = new int[arr.length+1];
        for (int i = 0;i < index;i++){
            newArr[i] = arr[i];
        }
        newArr[index] = x;
        for (int i = index + 1;i<arr.length;i++){
            newArr[i] =arr[i-1];
        }
        System.out.println("mang moi sau khi them la :"+ Arrays.toString(newArr));
    }
}
