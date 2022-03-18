package MemoriaCartas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

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
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private Memoria game;
    private ArrayList<JButton> listaBotones;

    //MAIN
    public static void main(String[] args) {
        JFrame frame = new JFrame("MemoriaGUI");
        frame.setContentPane(new MemoriaGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public MemoriaGUI(){
        game = new Memoria();
        listaBotones = new ArrayList<JButton>();
        listaBotones.add(button1);
        listaBotones.add(button2);
        listaBotones.add(button3);
        listaBotones.add(button4);
        listaBotones.add(button5);
        listaBotones.add(button6);
        listaBotones.add(button7);
        listaBotones.add(button8);
        listaBotones.add(button9);
        listaBotones.add(button10);
        listaBotones.add(button11);
        listaBotones.add(button12);

        Collections.shuffle(listaBotones);

        for(int i =0; i< listaBotones.size(); i++)
        {
            listaBotones.get(i).setIcon(game.getMazoUsadas().get(i).getImgback());
        }

        //BOTON 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button1)).esGirada()) {
                    button1.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button1)).getImg());
                }else{
                    button1.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button1)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button1)).tglEsGirada();
            }
        });
        //BOTON 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button2)).esGirada()) {
                    button2.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button2)).getImg());
                }else{
                    button2.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button2)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button2)).tglEsGirada();
            }
        });
        //BOTON 3
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button3)).esGirada()) {
                    button3.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button3)).getImg());
                }else{
                    button3.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button3)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button3)).tglEsGirada();
            }
        });
        //BOTON 4
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button4)).esGirada()) {
                    button4.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button4)).getImg());
                }else{
                    button4.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button4)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button4)).tglEsGirada();
            }
        });
        //BOTON 5
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button5)).esGirada()) {
                    button5.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button5)).getImg());
                }else{
                    button5.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button5)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button5)).tglEsGirada();
            }
        });
        //BOTON 6
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button6)).esGirada()) {
                    button6.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button6)).getImg());
                }else{
                    button6.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button6)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button6)).tglEsGirada();
            }
        });
        //BOTON 7
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button7)).esGirada()) {
                    button7.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button7)).getImg());
                }else{
                    button7.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button7)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button7)).tglEsGirada();
            }
        });
        //BOTON 8
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button8)).esGirada()) {
                    button8.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button8)).getImg());
                }else{
                    button8.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button8)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button8)).tglEsGirada();
            }
        });
        //BOTON 9
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button9)).esGirada()) {
                    button9.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button9)).getImg());
                }else{
                    button9.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button9)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button9)).tglEsGirada();
            }
        });
        //BOTON 10
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button10)).esGirada()) {
                    button10.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button10)).getImg());
                }else{
                    button10.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button10)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button10)).tglEsGirada();
            }
        });
        //BOTON 11
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button11)).esGirada()) {
                    button11.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button11)).getImg());
                }else{
                    button11.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button11)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button11)).tglEsGirada();
            }
        });
        //BOTON 12
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(game.getMazoUsadas().get(listaBotones.indexOf(button12)).esGirada()) {
                    button12.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button12)).getImg());
                }else{
                    button12.setIcon(game.getMazoUsadas().get(listaBotones.indexOf(button12)).getImgback());
                }
                game.getMazoUsadas().get(listaBotones.indexOf(button12)).tglEsGirada();
            }
        });
    }
}
