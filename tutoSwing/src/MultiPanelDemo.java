import javax.swing.*;
import java.awt.*;

public class MultiPanelDemo {
    public static void main(String[] args) {
        // Créer la fenêtre principale
        JFrame frame = new JFrame("Exemple avec plusieurs JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout()); // Layout général de la fenêtre

        // 🔹 Panel 1 : FlowLayout (comme display: flex;)
        JPanel panelFlow = new JPanel();
        panelFlow.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelFlow.setBackground(Color.LIGHT_GRAY);
        panelFlow.add(new JLabel("Nom :"));
        panelFlow.add(new JTextField(10));
        panelFlow.add(new JButton("Envoyer"));

        // 🔹 Panel 2 : GridLayout (comme display: grid;)
        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2, 2)); // 2 lignes, 2 colonnes
        panelGrid.setBackground(new Color(220, 240, 255));
        panelGrid.add(new JLabel("Email :"));
        panelGrid.add(new JTextField(10));
        panelGrid.add(new JLabel("Mot de passe :"));
        panelGrid.add(new JPasswordField(10));

        // 🔹 Panel 3 : BorderLayout (mise en page avec zones)
        JPanel panelBorder = new JPanel();
        panelBorder.setLayout(new BorderLayout());
        panelBorder.setBackground(new Color(200, 255, 200));
        panelBorder.add(new JButton("Nord"), BorderLayout.NORTH);
        panelBorder.add(new JButton("Sud"), BorderLayout.SOUTH);
        panelBorder.add(new JButton("Est"), BorderLayout.EAST);
        panelBorder.add(new JButton("Ouest"), BorderLayout.WEST);
        panelBorder.add(new JButton("Centre"), BorderLayout.CENTER);

        // Ajout des panneaux à la fenêtre principale
        frame.add(panelFlow, BorderLayout.NORTH);
        frame.add(panelGrid, BorderLayout.CENTER);
        frame.add(panelBorder, BorderLayout.SOUTH);

        // Afficher la fenêtre
        frame.setVisible(true);
    }
}

