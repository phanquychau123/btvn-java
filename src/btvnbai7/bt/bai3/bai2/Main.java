package btvnbai7.bt.bai3.bai2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(10,7);
        shapes[1] = new Triangle(2,2);
        for(Shape shape : shapes){
            System.out.print(shape.dienTich());
            if(shape instanceof Square){
                Square colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }
        }
    }
}
