package btvnbai7.bt.bai3.bai4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Blue", 5.0, 4.0);
        Circle circle = new Circle("Red", 3.0);

        rectangle.display();
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());

        circle.display();
        System.out.println("Diện tích hình tròn: " + circle.getArea());
    }
}
