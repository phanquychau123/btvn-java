package btvnbai3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so hang");
        int rows = sc.nextInt();
        System.out.println("nhap so cot");
        int cols = sc.nextInt();
        double[][] arr = new double[rows][cols];
        System.out.println("nhap gia tri cho mang");
        for (int i = 0;i < rows;i++){
            for (int j = 0; j< cols;j++){
                System.out.println("nhap gia tri cho phan tu ["+ i +"]["+j+"]");
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("mang ban vua nhap la :");
        for (int i = 0;i < rows;i++){
            for (int j = 0 ;j < cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("nhap so cot muon tinh tong");
        int columnSum = sc.nextInt();
        double sum = 0;
        for (int i = 0;i < rows;i++){
            sum +=arr[i][columnSum];
        }
        System.out.println("tong cua cot "+columnSum+"la"+sum);
    }
}
