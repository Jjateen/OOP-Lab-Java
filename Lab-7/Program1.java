interface Shape {
    double getArea();
    double getPerimeter();
}

abstract class PartialShape implements Shape {
    @Override
    public double getArea() {
        return 0.0;  // Partial implementation: Returns 0.0
    }

    // The getPerimeter method is not implemented, as it is marked as abstract in the Shape interface.
    
    public void displayInfo() {
        System.out.println("This is a partial implementation of the Shape interface.");
    }
}

class Circle extends PartialShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        circle.displayInfo();
    }
}


