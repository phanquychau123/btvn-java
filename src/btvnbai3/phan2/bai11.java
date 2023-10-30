package btvnbai3.phan2;

public class bai11 {
    public static void main(String[] args) {
        String inputString = "   xin chao toi ten la chau   ";
        String trimmedString = removeWhitespace(inputString);
        System.out.println("Chuỗi ban đầu: \"" + inputString + "\"");
        System.out.println("Chuỗi sau khi loại bỏ khoảng trắng: \"" + trimmedString + "\"");
    }

    public static String removeWhitespace(String input) {
        return input.trim();
    }
}
