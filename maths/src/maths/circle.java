package maths;

public class circle extends shape {

    public circle(double value) {
        super(value);
    }

    @Override
    public void calculateArea() {
        double area = 3.14 * value * value;
        System.out.println("Area of Circle: " + area);
    }
}