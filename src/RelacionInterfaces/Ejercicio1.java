package RelacionInterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {
    private JPanel mainPanel;
    private JButton uwuButton;
    private JButton owoButton;
    private JLabel txtLabel;

    public Ejercicio1() {
        //Accion boton uwu
        uwuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLabel.setText(uwuButton.getText());
            }
        });
        //Accion boton owo
        owoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLabel.setText(owoButton.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio1");
        frame.setContentPane(new Ejercicio1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
