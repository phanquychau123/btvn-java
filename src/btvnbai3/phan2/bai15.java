package btvnbai3.phan2;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        // Khai báo biến cân nặng và chiều cao
        double weightInKilograms = 70.0; // Đổi giá trị này thành cân nặng thực tế của bạn
        double heightInMeters = 1.75; // Đổi giá trị này thành chiều cao thực tế của bạn

        // Tính chỉ số BMI
        double bmi = calculateBMI(weightInKilograms, heightInMeters);

        // In kết quả
        System.out.println("Cân nặng (kg): " + weightInKilograms);
        System.out.println("Chiều cao (m): " + heightInMeters);
        System.out.println("Chỉ số BMI: " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        // Tính BMI bằng cân nặng (kg) / (chiều cao (m) ^ 2)
        return weight / (height * height);

    }
}
