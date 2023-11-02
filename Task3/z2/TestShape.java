package Study_Java.Task3.z2;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle(10.0, "Red", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        Shape square = new Square(8.0, "Green", true);

        System.out.println(circle);
        System.out.println("S: " + circle.getArea());
        System.out.println("P: " + circle.getPerimeter());

        System.out.println("\n" + rectangle);
        System.out.println("S: " + rectangle.getArea());
        System.out.println("P: " + rectangle.getPerimeter());

        System.out.println("\n" + square);
        System.out.println("S: " + square.getArea());
        System.out.println("P: " + square.getPerimeter());
    }
}
