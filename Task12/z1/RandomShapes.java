package Study_Java.Task12.z1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JPanel {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;
    private static final int NUM_SHAPES = 20;

    private final Random random = new Random();

    private final Shape[] shapes = new Shape[NUM_SHAPES];

    public RandomShapes() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        generateRandomShapes();
    }

    private boolean isOverlap(Shape newShape, Shape[] existingShapes, int numExistingShapes) {
        for (int i = 0; i < numExistingShapes; i++) {
            if (newShape.intersects(existingShapes[i])) {
                return true;
            }
        }
        return false;
    }


    private void generateRandomShapes() {
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(
                    random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256)
            );

            int shapeType = random.nextInt(2);
            int x, y;
            Shape newShape;

            do {
                x = random.nextInt(WIDTH - 100) + 50;
                y = random.nextInt(HEIGHT - 100) + 50;
                if (shapeType == 0) {
                    int radius = random.nextInt(50) + 20;
                    newShape = new Circle(randomColor, x, y, radius);
                } else {
                    int side = random.nextInt(50) + 20;
                    newShape = new Square(randomColor, x, y, side);
                }
            } while (isOverlap(newShape, shapes, i));
            shapes[i] = newShape;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}