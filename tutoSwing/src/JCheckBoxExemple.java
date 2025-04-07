import javax.swing.*;
import java.awt.*;

public class JCheckBoxExemple 
{
    public static void main(String[] args) 
    {
        // Définissez le frame
        JFrame frame = new JFrame("Check box");

        JLabel label = new JLabel("Je suis un JLabel", JLabel.CENTER);
        frame.add(label);

        // Définissez le panel
        JPanel panel = new JPanel();

        // Créer des cases à cocher    
        JCheckBox checkBox1 = new JCheckBox("developpeur junior", true);
        JCheckBox checkBox2 = new JCheckBox("data-scientist");
        JCheckBox checkBox3 = new JCheckBox("architecte logiciel", true);

        // Ajouter les cases à cocher au frame
        panel.add(checkBox1); 
        panel.add(checkBox2);
        panel.add(checkBox3);

        // Ajouter label et panel au frame
        frame.setLayout(new GridLayout(2, 1));// disposition dans une grille de cellules de taille égale 
        frame.add(label);
        frame.add(panel);

        frame.pack();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
