package Pruebas;

import javax.swing.*;

public class Pruebas {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pruebas");
        frame.setContentPane(new Pruebas().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
