package btvnbai4.bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        // cho ngươi dùng nhâp thông tin
        circle.inputData();
        // hiển thị thông tin
        circle.displayData();
        // hiển thị diện tích
        System.out.println("Chu vi là :"+circle.chuVi());
        System.out.println("Diện tích là :"+circle.dienTich());

    }
}
