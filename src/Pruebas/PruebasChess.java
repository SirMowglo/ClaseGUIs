package Pruebas;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PruebasChess extends JFrame{
    private JPanel mainPanel;
    private ArrayList<JButton> amigo;
    public static final int squareCount = 64;




    public static void main(String[] args) {
        JFrame frame = new JFrame("PruebasChess");
        frame.setContentPane(new PruebasChess().mainPanel);
        frame.setLayout(new GridLayout(8, 8));
        frame.setSize(650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PruebasChess() {
        amigo = new ArrayList<JButton>();
        // Color of chess board this you can change accordingly like red or white
        Color blackColor = Color.BLACK;
        Color whiteColor = Color.WHITE;


        for (int i = 1; i <= squareCount; i++) {

            amigo.add(new JButton());
            if (i % 2 == 0) { // Adding color based on the odd and even initially.

                amigo.get(i-1).setBackground(blackColor);
            } else {

                amigo.get(i-1).setBackground(whiteColor);
            }
            add(amigo.get(i-1));

            if (i % 8 == 0) { // swapping the color when adding the next row

                Color temp = blackColor;
                blackColor = whiteColor;
                whiteColor = temp;
            }

        }
    }


}
