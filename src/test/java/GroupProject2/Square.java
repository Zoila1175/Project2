package GroupProject2;

// Square class
public class Square implements Shape {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
