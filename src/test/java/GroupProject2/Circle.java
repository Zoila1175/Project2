package GroupProject2;

// Circle class
public class Circle implements Shape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double calculateArea() {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return Math.PI * diameter;
    }
}
