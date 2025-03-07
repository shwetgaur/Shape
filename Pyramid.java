package abstraction;

public class Pyramid extends Shape {
    @Override
    public void calculateShape() {
        // Implementation for calculateShape
    }

    @Override
    public void calculatePerimeter() {
        // Implementation for calculatePerimeter
    }
    private double slantHeight;

    public Pyramid(double base, double height, double slantHeight) {
        super(base, height, slantHeight);
        this.slantHeight = slantHeight;
    }

    @Override
    public double area() {
        double baseArea = D1 * D1;
        double lateralArea = 2 * D1 * Math.sqrt((D1 / 2) * (D1 / 2) + D2 * D2);
        return baseArea + lateralArea;
    }

    @Override
    public double perimeter() {
        return 4 * D1;
    }

    @Override
    public double volume() {
        return (D1 * D1 * D2) / 3;
    }
}