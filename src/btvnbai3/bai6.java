package btvnbai3;

import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang");
        int rows = sc.nextInt();
        System.out.println("nhap so cot");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0;i < rows;i++){
            for (int j = 0;j < cols;j++){
                System.out.println("nhap phan tu gia tri :["+i+"]["+j+"] ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang ban vua nhap la");
        for (int i = 0; i < rows; i++){
            for (int j = 0;j < cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int maxValue = arr[0][0];
        int maxRows = 0;
        int maxCols = 0;
        for (int i = 0;i < rows;i++){
            for (int j = 0; j < cols;j++){
                if (arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    maxRows = i;
                    maxCols = j;
                }
            }
        }
        System.out.println("gia tri lon nhat trong mang la :" +maxValue );
        System.out.println("vi tri cua no la:["+ maxRows +"]["+maxCols+"]");
    }
}
