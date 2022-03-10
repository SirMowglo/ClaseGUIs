package RelacionInterfaces.Ejercicio5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio5 {
    private HashMap<String,String> map = new HashMap<String, String>();
    private JComboBox palabrasComboBox;
    private JPanel mainPanel;
    private JLabel traduccionLabel;
    private JLabel textLabel;


    public Ejercicio5() {
        map.put("Gato", "Pussy");
        map.put("Programacion", "Programação");
        map.put("Tortilla de patata","Tortilha de batata");
        map.put("CR7", "Suuuuuuuuuuuuuu");

        palabrasComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traduccionLabel.setText(map.get(palabrasComboBox.getSelectedItem()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio5");
        frame.setContentPane(new Ejercicio5().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
