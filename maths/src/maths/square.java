package maths;

public class square extends shape {

    public square(double value) {
        super(value);
    }

    @Override
    public void calculateArea() {
        double area = value * value;
        System.out.println("Area of Square: " + area);
    }
}