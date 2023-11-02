package Study_Java.Task3.z1;

abstract class Shape {
    public abstract double calculateS();
    public abstract double calculateP();
}

class Krug extends Shape {
    private double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateS() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculateP() {
        return 2 * 3.14 * radius;
    }
}
class Pryamougolnik extends Shape {
    private double length;
    private double width;

    public Pryamougolnik(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateS() {
        return length * width;
    }

    @Override
    public double calculateP() {
        return 2 * (length + width);
    }
}