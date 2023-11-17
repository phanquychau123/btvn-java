package btvnbai9.bt.bai3;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("nhap so luong cac tu");
        int numberOfWorld = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfWorld; i++) {
            System.out.println("nhap chu " + (i + 1));
            stack.push(sc.nextLine());
        }
        System.out.println("chuoi la" + stack);
        System.out.println("chuoi sau khi dao nguoc la");
        for (int i = 0; i < numberOfWorld; i++) {
            System.out.println(stack.pop() + " ");

        }
    }
}
