import javax.swing.*;
import java.awt.*;

public class TresSimplePanels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple très simple");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1)); // 3 lignes

        // Panel 1 : FlowLayout (boutons côte à côte)
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JButton("Flow1"));
        panel1.add(new JButton("Flow2"));

        // Panel 2 : GridLayout (grille 2x2 ici)
        JPanel panel2 = new JPanel(new GridLayout(2, 2));
        panel2.add(new JButton("GridOne"));
        panel2.add(new JButton("GridTwo"));

        // Panel 3 : BorderLayout (un seul bouton au centre)
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(new JButton("BorderOne"), BorderLayout.LINE_END);
        panel3.add(new JButton("BorderTwo"), BorderLayout.LINE_START);

        // Ajouter les panels dans la fenêtre
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setVisible(true);
    }
}

