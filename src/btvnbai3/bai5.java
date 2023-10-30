package btvnbai3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang vao day");
        int size = sc.nextInt();
        int[] arrInput = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("nhap gia tri cho phan tu thu" +(i+1)+":");
            arrInput[i] =sc.nextInt();
        }
        int minValue = arrInput[0];
        for (int i = 0; i < size;i++){
            if (minValue > arrInput[i]){
                minValue = arrInput[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la :"+minValue);
    }
}
