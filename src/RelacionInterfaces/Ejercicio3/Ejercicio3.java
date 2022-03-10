package RelacionInterfaces.Ejercicio3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 {
    private JPanel mainPanel;
    private JTextField textFieldEstatura;
    private JTextField textFieldPeso;
    private JButton calcularButton;
    private JLabel estaturaLabel;
    private JLabel pesoLabel;
    private JLabel resultadoLabel;
    private Ejercicio3_calculo calculo= new Ejercicio3_calculo();
    public Ejercicio3() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoLabel.setText("Su resultado es: " + calculo.calculoIMC(Double.parseDouble(textFieldPeso.getText()),Double.parseDouble(textFieldEstatura.getText())));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio3");
        frame.setContentPane(new Ejercicio3().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
