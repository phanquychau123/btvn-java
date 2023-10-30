package btvnbai3.phan2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi cna kiem tra");
    String str = sc.nextLine();
    if (str.isEmpty()){
        System.out.println("chuoi ban nhap la chuoi rong");
    }else {
        System.out.println("chuoi ban nhap ko phai chuoi rong");
    }
    }
}
