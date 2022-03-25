package Chess;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class ChessGUI extends JPanel{
    private JPanel mainPanel;
    private JButton a8;
    private JButton b8;
    private JButton a1;
    private JButton b1;
    private JButton c1;
    private JButton d1;
    private JButton e1;
    private JButton f1;
    private JButton g1;
    private JButton h1;
    private JButton a2;
    private JButton b2;
    private JButton c2;
    private JButton d2;
    private JButton e2;
    private JButton f2;
    private JButton g2;
    private JButton h2;
    private JButton a3;
    private JButton b3;
    private JButton c3;
    private JButton d3;
    private JButton e3;
    private JButton f3;
    private JButton g3;
    private JButton h3;
    private JButton a4;
    private JButton b4;
    private JButton c4;
    private JButton d4;
    private JButton e4;
    private JButton f4;
    private JButton g4;
    private JButton h4;
    private JButton a5;
    private JButton b5;
    private JButton c5;
    private JButton d5;
    private JButton e5;
    private JButton f5;
    private JButton g5;
    private JButton h5;
    private JButton a6;
    private JButton b6;
    private JButton c6;
    private JButton d6;
    private JButton e6;
    private JButton f6;
    private JButton g6;
    private JButton h6;
    private JButton a7;
    private JButton b7;
    private JButton c7;
    private JButton d7;
    private JButton e7;
    private JButton f7;
    private JButton g7;
    private JButton h7;
    private JButton c8;
    private JButton d8;
    private JButton e8;
    private JButton f8;
    private JButton g8;
    private JButton h8;
    private ArrayList<JButton> casillaButtons;

    public ChessGUI(){
        // Casillas
        casillaButtons = new ArrayList<JButton>();
        Collections.addAll(casillaButtons,            // Añado todos los botones a la casilla
                a1,b1,c1,d1,e1,f1,g1,h1,
                a2,b2,c2,d2,e2,f2,g2,h2,
                a3,b3,c3,d3,e3,f3,g3,h3,
                a4,b4,c4,d4,e4,f4,g4,h4,
                a5,b5,c5,d5,e5,f5,g5,h5,
                a6,b6,c6,d6,e6,f6,g6,h6,
                a7,b7,c7,d7,e7,f7,g7,h7,
                a8,b8,c8,d8,e8,f8,g8,h8);

        Color blackColor = Color.BLACK;
        Color whiteColor = Color.WHITE;

        for (int i = 1; i <= casillaButtons.size(); i++) {
            casillaButtons.get(i-1).setBorderPainted(false);
            casillaButtons.get(i-1).setOpaque(true);
            casillaButtons.get(i-1).setContentAreaFilled(true);
            if (i % 2 == 0) { // Adding color based on the odd and even initially.
                casillaButtons.get(i-1).setBackground(blackColor);
            } else {
                casillaButtons.get(i-1).setBackground(whiteColor);
            }
            add(casillaButtons.get(i-1));

            if (i % 8 == 0) { // swapping the color when adding the next row
                Color temp = blackColor;
                blackColor = whiteColor;
                whiteColor = temp;
            }

        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess (quesito para los que no sepan ingles)");
        frame.setContentPane(new ChessGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
}
