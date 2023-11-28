package TP2_MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompteurGui extends JFrame {
    private CompteurModel compteurModel = new CompteurModel(0);
    private TextField tf = new TextField(10);

    public CompteurGui(String title) {
        super(title);

        JPanel tfJPanel = new JPanel();
        tf.setText("0");
        tfJPanel.add(tf);
        add("North", tfJPanel);

        JPanel buttonJPanel = new JPanel();

        JButton incJButton = new JButton("Incrementer");
        incJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                compteurModel.incrementer();
                tf.setText(compteurModel.getCompteur() + "");
            }
        });
        buttonJPanel.add(incJButton);

        JButton decJButton = new JButton("Decrementer");
        decJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                compteurModel.decrementer();
                tf.setText(compteurModel.getCompteur() + "");
            }
        });
        buttonJPanel.add(decJButton);

        JButton exitJButton = new JButton("Exit");
        exitJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonJPanel.add(exitJButton);

        add("South", buttonJPanel);
    }

    public static void main(String[] argv) {
        CompteurGui cg = new CompteurGui("Compteur graphique");
        cg.setSize(300, 100);
        cg.setVisible(true);
    }
}
