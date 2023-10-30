package btvnbai3;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi can kiem tra");
        String inputString = sc.nextLine();
        String checkString ="";
        for (int i =0 ;i < inputString.length();i++){
            if (checkString.contains(String.valueOf(inputString.charAt(i)))){
                continue;
            }
            int count = 0;
            for (int j = 0;j < inputString.length(); j++){
                if (inputString.charAt(i)==inputString.charAt(j)){
                    count++;
                }
            }
            if (count > 1){
                System.out.printf("ki tu %c dc lap lai %d lan",inputString.charAt(i),count);
                System.out.println();
            }
        }
    }
}
