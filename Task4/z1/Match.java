package Study_Java.Task4.z1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Match extends JFrame {

    private JButton buttonMilan = new JButton("AC Milan");
    private JButton buttonMadrid = new JButton("Real Madrid");
    private JLabel labelResult = new JLabel("Result: 0 X 0");
    private JLabel labelScorer = new JLabel("Last scorer: N/A");
    private JLabel labelWinner = new JLabel("Winner: DRAW");
    private int milanScore = 0;
    private int madridScore = 0;

    public Match() {
        super("FootballMatchMilanVsMadrid");
        this.setBounds(500, 500, 600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        ButtonGroup group = new ButtonGroup();
        group.add(buttonMilan);
        group.add(buttonMadrid);
        buttonMilan.addActionListener(new Button1EventListener());
        topPanel.add(buttonMilan);
        buttonMadrid.addActionListener(new Button2EventListener());
        topPanel.add(buttonMadrid);
        container.add(topPanel, BorderLayout.NORTH);
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2,2));
        centerPanel.add(labelResult);
        centerPanel.add(labelScorer);
        centerPanel.add(labelWinner);
        container.add(centerPanel, BorderLayout.CENTER);
    }

    private void updateResult(String lastScorer){
        labelResult.setText("Result: " + milanScore + " X " + madridScore);
        labelScorer.setText("Last scorer: " + lastScorer);
        if (milanScore > madridScore) {
            labelWinner.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            labelWinner.setText("Winner: Real Madrid");
        } else {
            labelWinner.setText("Winner: DRAW");
        }
    }

    class Button1EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            milanScore++;
            updateResult("AC Milan");
        }
    }

    class Button2EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            madridScore++;
            updateResult("Real Madrid");
        }
    }
}