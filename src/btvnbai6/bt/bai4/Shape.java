package btvnbai6.bt.bai4;

public class Shape {
    private String color;

    public Shape() {
        color = "red"; // Default color
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }
}
