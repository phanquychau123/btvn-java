package btvnbai3.phan2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi thu 1:");
        String str1 = sc.nextLine();
        System.out.println("nhap chuoi thu 2:");
        String str2 = sc.nextLine();
        String noichuoi = noichuoi(str1,str2);
        System.out.println("chuoi sau khi gop la :" + noichuoi);
    }
    public static String noichuoi(String str1,String str2){
        return str1.concat(str2);
    }
}
