class Shape {
    double length;
    double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }
}

class Box extends Shape {
    double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getSurfaceArea() {
        double lateralArea = 2 * (length * height + width * height);
        double baseArea = super.getArea();
        return 2 * (lateralArea + baseArea);
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Box box = new Box(5.0, 3.0, 2.0);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Box Surface Area: " + box.getSurfaceArea());
        System.out.println("Box Volume: " + box.getVolume());
    }
}
