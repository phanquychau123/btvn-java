package btvnbai3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc ma tran vuong");
        int n = sc.nextInt();
        double[][]arr = new double[n][n];
        System.out.println("nhap gia tri cho ma tran");
        for (int i = 0;i < n;i++){
            for (int j = 0; j < n;j++){
                System.out.println("nhap gia tri cho cac phan tu["+n+"]["+n+"]");
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("ma tran ban vua nhap la");
        for (int i = 0; i < n;i++){
            for (int j = 0; j < n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        double duongcheoSum = 0;
        for (int i = 0;i < n;i++){
            duongcheoSum += arr[i][i];
        }
        System.out.println("tong cua duong cheo chinh la" + duongcheoSum);
    }
}
