package btvnbai7.bt.bai3.bai2;

public abstract class Shape {
   private double width = 0;
   private double height = 0;
   public Shape(){

   }

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public abstract String dienTich();
}
