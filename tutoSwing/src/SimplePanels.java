import javax.swing.*;
import java.awt.*;

public class SimplePanels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple simple avec JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(3, 1)); // 3 zones verticales

        // 🔹 1. FlowLayout : composants alignés à la suite
        JPanel panelFlow = new JPanel(new FlowLayout());
        panelFlow.add(new JButton("Bouton 1"));
        panelFlow.add(new JButton("Bouton 2"));

        // 🔹 2. GridLayout : grille 2 lignes, 2 colonnes
        JPanel panelGrid = new JPanel(new GridLayout(2, 2));
        panelGrid.add(new JLabel("Nom :"));
        panelGrid.add(new JTextField(8));
        panelGrid.add(new JLabel("Âge :"));
        panelGrid.add(new JTextField(4));

        // 🔹 3. BorderLayout : zones Nord, Sud, Centre
        JPanel panelBorder = new JPanel(new BorderLayout());
        panelBorder.add(new JLabel("Haut"), BorderLayout.NORTH);
        panelBorder.add(new JLabel("Bas"), BorderLayout.SOUTH);
        panelBorder.add(new JButton("Centre"), BorderLayout.CENTER);

        // Ajouter les 3 panels dans la fenêtre
        frame.add(panelFlow);
        frame.add(panelGrid);
        frame.add(panelBorder);

        frame.setVisible(true);
    }
}

