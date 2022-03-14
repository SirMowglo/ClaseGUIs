package MemoriaCartas;

import javax.swing.*;

public class MemoriaGUI {
    private JPanel mainPanel;
    private JPanel panelCartas;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MemoriaGUI");
        frame.setContentPane(new MemoriaGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
