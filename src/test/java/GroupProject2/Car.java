package GroupProject2;

public class Car {

    protected double carPrice;
    protected String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}
class Sedan extends GroupProject2.Car {
    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
}

class Truck extends GroupProject2.Car {
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.9; // 10% discount
        } else {
            return carPrice * 0.8; // 20% discount
        }
    }
}


