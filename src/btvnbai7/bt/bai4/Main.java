package btvnbai7.bt.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai ba canh tam giac");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap mau cua tam giac");
        String color = sc.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println("Triangle details:");
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

    }
}
