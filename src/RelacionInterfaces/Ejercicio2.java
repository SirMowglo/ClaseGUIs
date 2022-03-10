package RelacionInterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 {
    private JPanel mainPanel;
    private JButton unoButton;
    private JButton dosButton;
    private JLabel clicks1Label;
    private JLabel clicks2Label;
    private JButton clearButton;

    int contador1 =0;
    int contador2 =0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio2");
        frame.setContentPane(new Ejercicio2().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio2() {
        unoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador1++;
                clicks1Label.setText(contador1 +" clicks");
            }
        });
        dosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador2++;
                clicks2Label.setText(contador2 +" clicks");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador1=0;
                contador2=0;
                clicks1Label.setText(contador1 +" clicks");
                clicks2Label.setText(contador2 +" clicks");
            }
        });


    }
}
