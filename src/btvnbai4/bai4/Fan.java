package btvnbai4.bai4;

public class Fan {
    // Hằng số tốc độ quạt
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Các trường của lớp Fan
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Phương thức khởi tạo không tham số
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    // Getter và Setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString
    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + " - fan is on";
        } else {
            return "Color: " + color + ", Radius: " + radius + " - fan is off";
        }
    }
}
