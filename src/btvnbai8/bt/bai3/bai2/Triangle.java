package btvnbai8.bt.bai3.bai2;

public class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    public String dienTich() {
        return "Triangle" + getWidth()*getHeight()/2;
    }
}
