package TP2_MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompteurView extends JFrame {
    private CompteurModel compteurModel;
    private TextField tf = new TextField(10);

    public CompteurView(String title, CompteurModel compteurModel) {
        super(title);
        this.compteurModel = compteurModel;

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
        CompteurModel cpt = new CompteurModel(0);
        CompteurView cv1 = new CompteurView("Vue 1 du compteur", cpt);
        cv1.setSize(300, 100);
        cv1.setVisible(true);

        CompteurView cv2 = new CompteurView("Vue 2 du compteur", cpt);
        cv2.setSize(300, 100);
        cv2.setVisible(true);
    }
}
