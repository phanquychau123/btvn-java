package btvnbai4.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        double a = input.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = input.nextDouble();
        System.out.print("Nhập giá trị c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Nghiệm 1: " + root1 + ", Nghiệm 2: " + root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1();
            System.out.println("Nghiệm duy nhất: " + root);
        } else {
            System.out.println("Phương trình không có nghiệm");
        }

        input.close();
    }
}
