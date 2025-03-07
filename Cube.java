package abstraction;

public class Cube extends Shape {
    public Cube(double side) {
        super(side, 0.0, 0.0);
    }

    @Override
    public double area() {
        return 6 * D1 * D1;
    }

    @Override
    public double perimeter() {
        return 12 * D1;
    }


    @Override
    public double volume() {
        return D1 * D1 * D1;
    }

}
