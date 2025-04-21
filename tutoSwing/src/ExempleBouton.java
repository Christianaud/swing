import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExempleBouton {
    public static void main(String[] args) {
        // Créer la fenêtre
        JFrame frame = new JFrame("Exemple JButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new java.awt.FlowLayout());

        // Créer un bouton
        JButton bouton = new JButton("Clique-moi");

        // Ajouter une action quand on clique sur le bouton
        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Tu as cliqué sur le bouton !");
            }
        });

        // Ajouter le bouton à la fenêtre
        frame.add(bouton);
        frame.setVisible(true);
    }
}

