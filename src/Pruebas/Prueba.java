package Pruebas;

import javax.swing.*;
import java.awt.*;

public class Prueba  extends JPanel {
    public static final int squareCount = 64;
    private JPanel mainPanel = new JPanel(new GridLayout(8,8));
    private JButton chessButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PruebasChess");
        frame.setContentPane(new Prueba().mainPanel);
        frame.setLayout(new GridLayout(8, 8));
        frame.setSize(650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Prueba() {
        // Color of chess board this you can change accordingly like red or white
        Color blackColor = Color.BLACK;
        Color whiteColor = Color.WHITE;

        for (int i = 1; i <= squareCount; i++) {

            if (i % 2 == 0) { // Adding color based on the odd and even initially.

                chessButton = new JButton("jb"+i);
                chessButton.setBackground(blackColor);
                add(chessButton);
            } else {

                chessButton = new JButton("jb"+i);
                chessButton.setBackground(whiteColor);
                add(chessButton);
            }

            if (i % 8 == 0) { // swapping the color when adding the next row

                Color temp = blackColor;
                blackColor = whiteColor;
                whiteColor = temp;
            }

        }
    }
}
