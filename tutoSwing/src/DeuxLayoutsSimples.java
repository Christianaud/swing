import javax.swing.*;
import java.awt.*;

public class DeuxLayoutsSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow vs Grid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2, 1)); // 2 lignes : un panel Flow, un panel Grid

        // Panel 1 : FlowLayout (boutons alignés)
        JPanel panelFlow = new JPanel(new FlowLayout());
        panelFlow.add(new JButton("Bouton 1"));
        panelFlow.add(new JButton("Bouton 2"));

        // Panel 2 : GridLayout (boutons en grille 1 ligne x 2 colonnes)
        JPanel panelGrid = new JPanel(new GridLayout(2, 1));
        panelGrid.add(new JButton("Bouton A"));
        panelGrid.add(new JButton("Bouton B"));

        // Ajouter les deux panels à la fenêtre
        frame.add(panelFlow);
        frame.add(panelGrid);

        frame.setVisible(true);
    }
}

