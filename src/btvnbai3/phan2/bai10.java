package btvnbai3.phan2;

public class bai10 {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String lowerCaseString = toLowerCase(inputString);
        String upperCaseString = toUpperCase(inputString);
        System.out.println("Chuỗi ban đầu: " + inputString);
        System.out.println("Chữ thường: " + lowerCaseString);
        System.out.println("Chữ hoa: " + upperCaseString);
    }
    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }
}
