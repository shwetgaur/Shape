package abstraction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit of measurement (e.g., cm, m, inch): ");
        String unit = scanner.nextLine();

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.area() + " " + unit + "²");
        System.out.println("Perimeter of the rectangle: " + rectangle.perimeter() + " " + unit);
        
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.area() + " " + unit + "²");
        System.out.println("Perimeter of the circle: " + circle.perimeter() + " " + unit);


        System.out.println("Enter the side of the cube: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);

        System.out.println("Area of the cube: " + cube.area() + " " + unit + "²");
        System.out.println("Perimeter of the cube: " + cube.perimeter() + " " + unit);
        System.out.println("Volume of the cube: " + cube.volume() + " " + unit + "³");





        scanner.close();
    }
}