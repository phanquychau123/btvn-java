package btvnbai7.bt.bai3.bai2;

public class Square extends Shape implements Colorable{
  public Square(){

  }
    @Override
    public String howToColor() {
        return "color ...";
    }

    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return "Square{}";
    }

    @Override
    public String dienTich() {
        return "Square" +getWidth()*getHeight();
    }
}
