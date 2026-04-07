package maths;

public abstract class shape {
    double value;

    public shape(double value) {
        this.value = value;
    }

    public abstract void calculateArea();
}