import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class uwuGUI extends JFrame{
    private JPanel mainPanel;
    private JButton uwuButton;
    private JButton owoButton;
    private JLabel etiqueta;

    public uwuGUI() {
        uwuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!etiqueta.getText().equals("uwu")){
                    etiqueta.setText("uwu");
                }
            }
        });
        owoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!etiqueta.getText().equals("owo")){
                    etiqueta.setText("owo");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("uwuGUI");
        frame.setContentPane(new uwuGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
