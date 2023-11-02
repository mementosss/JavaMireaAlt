package Study_Java.Task5.z4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedImage extends JPanel implements ActionListener {
    private Timer timer;
    private int frameIndex;
    private ImageIcon[] frames;
    private int frameDelay = 100;

    public AnimatedImage(String[] framePaths) {
        frames = new ImageIcon[framePaths.length];
        for (int i = 0; i < framePaths.length; i++) {
            frames[i] = new ImageIcon(framePaths[i]);
        }

        frameIndex = 0;

        timer = new Timer(frameDelay, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (frameIndex < frames.length - 1) {
            frameIndex++;
        } else {
            frameIndex = 0;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frameIndex < frames.length) {
            ImageIcon currentFrame = frames[frameIndex];
            currentFrame.paintIcon(this, g, 0, 0);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error, not enough data.");
            System.exit(1);
        }

        JFrame frame = new JFrame("Animation");
        AnimatedImage animatedImage = new AnimatedImage(args);
        frame.add(animatedImage);
        frame.setSize(animatedImage.frames[0].getIconWidth(), animatedImage.frames[0].getIconHeight());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}