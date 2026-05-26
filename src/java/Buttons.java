package src.java;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Random;

public class Buttons{
    public static void main(String[] args){
        Random rand = new Random();
        final String[] target = {String.format("%05d", rand.nextInt(100000))};
        JFrame baguette = new JFrame("Buttons");
        baguette.setLayout(new FlowLayout());
        baguette.setSize(290,400);
        baguette.setLocationRelativeTo(null);
        baguette.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField text = new JTextField(20);
        baguette.add(text);
        JButton button = new JButton("1");
        button.setPreferredSize(new Dimension(80,80));
        JButton button2 = new JButton("2");
        button2.setPreferredSize(new Dimension(80,80));
        JButton button3 = new JButton("3");
        button3.setPreferredSize(new Dimension(80,80));
        JButton button4 = new JButton("4");
        button4.setPreferredSize(new Dimension(80,80));
        JButton button5 = new JButton("5");
        button5.setPreferredSize(new Dimension(80,80));
        JButton button6 = new JButton("6");
        button6.setPreferredSize(new Dimension(80,80));
        JButton button7 = new JButton("7");
        button7.setPreferredSize(new Dimension(80,80));
        JButton button8 = new JButton("8");
        button8.setPreferredSize(new Dimension(80,80));
        JButton button9 = new JButton("9");
        button9.setPreferredSize(new Dimension(80,80));
        JButton button10 = new JButton("0");
        button10.setPreferredSize(new Dimension(80,80));
        JButton button11 = new JButton("Clear");
        button11.setPreferredSize(new Dimension(80,80));
        JButton button12 = new JButton("Enter");
        button12.setPreferredSize(new Dimension(80,80));
        baguette.add(button);
        baguette.add(button2);
        baguette.add(button3);
        baguette.add(button4);
        baguette.add(button5);
        baguette.add(button6);
        baguette.add(button7);
        baguette.add(button8);
        baguette.add(button9);
        baguette.add(button10);
        baguette.add(button11);
        baguette.add(button12);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "9");
            }
        });
        button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String existingText = text.getText();
                text.setText(existingText + "0");
            }
        });
        button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.setText("");
            }
        });
        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = text.getText();
                if (input.length() != 5) {
                    text.setText("Enter 5 digits.");
                    return;
                }
                int correctCount = 0;
                for (int i = 0; i < 5; i++) {
                    if (input.charAt(i) == target[0].charAt(i)) {
                        correctCount++;
                    }
                }
                if (correctCount == 5) {
                    text.setText("Correct.");
                    target[0] = String.format("%05d", rand.nextInt(100000));
                } else {
                    text.setText(correctCount+"/5");
                }
            }
        });
        baguette.setVisible(true);
    }
}