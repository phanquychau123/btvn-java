package btvnbai3.phan2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String str = sc.nextLine();
        System.out.println("nhap chuoi can chen");
        String strchen = sc.nextLine();
        System.out.println("nhap vi tri can chen");
        int index = scanner.nextInt();
        String chuoisaukhichen = chenchuoi(str,strchen,index);
        System.out.println("chuoi sau khi chen la :"+chuoisaukhichen);
    }
    public  static String chenchuoi(String str,String strchen,int index){
        StringBuffer chenchuoi = new StringBuffer(str);
        return chenchuoi.insert(index,strchen).toString();
    }
}
