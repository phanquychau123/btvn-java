package btvnbai3.phan2;

import java.util.Arrays;

public class bai4 {
    public static void main(String[] args) {
        String str = "phanquychau";
        String[] arr = tachString(str);
        System.out.println(Arrays.toString(arr));
    }
    public static String [] tachString(String str){
        String[]arr = str.split("");
        return arr;
    }
}
