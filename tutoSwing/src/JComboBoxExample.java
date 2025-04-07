import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class JComboBoxExample {
    public static void main(String[] args) {

        // Définissez le frame
        JFrame frame = new JFrame("Liste déroulante");

        // donner pour les listes déroulantes
        String[] progs = {"PHP", "Java", "Python", "C++", "Ruby"};

        // Créer une liste déroulante
        JComboBox lDs = new JComboBox(progs);
    
        frame.setLayout(new GridLayout(6, 1));// disposition dans une grille de cellules de taille égale
        frame.add(lDs);

        frame.pack();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
