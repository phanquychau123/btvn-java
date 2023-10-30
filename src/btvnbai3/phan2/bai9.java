package btvnbai3.phan2;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập chuỗi gốc : ");
        String str = sc.nextLine();
        System.out.print("Hãy nhập chuỗi cần kiểm tra : ");
        String str1 = sc.nextLine();
        if(containsString(str,str1)){
            System.out.println("Chuỗi gốc có chứa chuỗi bạn nhập ");
        }else{
            System.out.println("Chuỗi gốc không chứa chuỗi bạn nhập ");
        }
    }
    public static boolean containsString(String str , String str1){
        return str.contains(str1);
    }
}
