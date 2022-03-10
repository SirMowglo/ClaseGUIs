import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JPanel mainPanel;
    private JButton unoButton;
    private JButton dosButton;
    private JButton tresButton;
    private JButton sumButton;
    private JButton cuatroButton;
    private JButton cincoButton;
    private JButton seisButton;
    private JButton subtractButton;
    private JButton sieteButton;
    private JButton ochoButton;
    private JButton nueveButton;
    private JButton multButton;
    private JButton divButton;
    private JButton ceroButton;
    private JButton equalButton;
    private JButton cButton;
    private JLabel resultLabel;

    double num1=0;
    double num2=0;
    double operation;

    public CalculatorGUI() {

        unoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = (num1*10) + 1;
            }
        });
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setContentPane(new CalculatorGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
