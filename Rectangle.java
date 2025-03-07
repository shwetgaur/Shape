package abstraction;
public class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0.0);
    }

    @Override
    public double area() {
        return D1 * D2;
    }

    @Override
    public double perimeter() {
        return 2 * (D1 + D2);
    }

    @Override
    public double volume() {
        return 0.0;
    }
}