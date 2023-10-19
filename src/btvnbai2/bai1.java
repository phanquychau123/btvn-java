package btvnbai2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dau");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhap so cuoi");
        int number2 = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i =number1; i <= number2;i++){
            if (i%2==0){
                count += i;
            }
        }
        System.out.println("tong la" + count);
    }
}
