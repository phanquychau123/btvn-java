package btvnbai3;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc mang 1");
        int size1 = sc.nextInt();
        System.out.println("nhap kich thuoc mang 2");
        int size2 = sc.nextInt();
        int [] arr1 = new int[size1];
        int [] arr2 = new int[size2];
        for (int i = 0;i < size1; i++){
            System.out.println("nhap gia tri thu" +(i+1)+": cua mang 1");
             arr1 [i] = sc.nextInt();
        }
        for (int i = 0;i < size2; i++){
            System.out.println("nhap gia tri thu"+(i+1)+": cua mang 2");
            arr2[i] = sc.nextInt();
        }
        int [] arr3 = new int[size1 +size2];
        for (int i = 0;i < size1; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < size2;i++){
            arr3[size1 + i] = arr2[i];
        }
        System.out.println("mang sau khi gop la");
        for (int i = 0;i < size1 + size2;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
