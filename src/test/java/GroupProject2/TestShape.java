package GroupProject2;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Square square = new Square(5.5, 5.5);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}

