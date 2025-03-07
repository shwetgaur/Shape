package abstraction;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0.0, 0.0);
    }

    @Override
    public double area() {
        return Math.PI * D1 * D1;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * D1;
    }

    @Override
    public double volume() {
        return 0.0;
    }
}