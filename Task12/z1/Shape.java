package Study_Java.Task12.z1;

import java.awt.*;

abstract class Shape {
    private Color color;
    private int x;
    private int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw(Graphics g);

    public abstract boolean intersects(Shape other);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX() - radius, getY() - radius, 2 * radius, 2 * radius);
    }

    @Override
    public boolean intersects(Shape other) { //Теорема пифагора(расстояние между точками)
        if (other instanceof Circle) {
            Circle otherCircle = (Circle) other;
            int dx = getX() - otherCircle.getX();
            int dy = getY() - otherCircle.getY();
            int distance = (int) Math.sqrt(dx * dx + dy * dy);
            return distance < (radius + otherCircle.radius);
        } else if (other instanceof Square) {
            Square square = (Square) other;
            int closestX = Math.max(square.getX() - square.getSide() / 2, Math.min(getX(), square.getX() + square.getSide() / 2));
            int closestY = Math.max(square.getY() - square.getSide() / 2, Math.min(getY(), square.getY() + square.getSide() / 2));
            int dx = getX() - closestX;
            int dy = getY() - closestY;
            int distance = (int) Math.sqrt(dx * dx + dy * dy);
            return distance < radius;
        } else {
            return false;
        }
    }

    public int getRadius() {
        return radius;
    }

    public int getCircleWidth() {
        return 2 * radius;
    }

    public int getCircleHeight() {
        return 2 * radius;
    }
}

class Square extends Shape {
    private int side;

    public Square(Color color, int x, int y, int side) {
        super(color, x, y);
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX() - side / 2, getY() - side / 2, side, side);
    }

    @Override
    public boolean intersects(Shape other) {
        if (other instanceof Square) {
            Square otherSquare = (Square) other;
            return Math.abs(getX() - otherSquare.getX()) < (side / 2 + otherSquare.side / 2) &&
                    Math.abs(getY() - otherSquare.getY()) < (side / 2 + otherSquare.side / 2);
        } else if (other instanceof Circle) {
            Circle circle = (Circle) other;
            int closestX = Math.max(getX() - side / 2, Math.min(circle.getX(), getX() + side / 2));
            int closestY = Math.max(getY() - side / 2, Math.min(circle.getY(), getY() + side / 2));
            int dx = circle.getX() - closestX;
            int dy = circle.getY() - closestY;
            int distance = (int) Math.sqrt(dx * dx + dy * dy);
            return distance < circle.getRadius();
        } else {
            return false;
        }
    }

    public int getSquareWidth() {
        return side;
    }
    public int getSquareHeight() {
        return side;
    }
    public int getSide() {
        return side;
    }
}