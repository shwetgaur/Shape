// Shape.java - Abstract class for shapes
abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods to be implemented by subclasses
    abstract void calculateShape(); 
    abstract void calculatePerimeter(); 
}
