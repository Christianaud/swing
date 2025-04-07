import javax.swing.*;
import java.awt.*;

public class JMenuExample {  // Changement du nom de classe pour éviter la confusion avec JMenu
    public static void main(String[] args) {
        // Définissez le frame
        JFrame frame = new JFrame("Menu");

        // Définir le menu principal
        JMenuBar menuBar = new JMenuBar();  // Renommé pour éviter confusion
        JMenu tool = new JMenu("Outils");
        JMenu login = new JMenu("Inscription");
        JMenu help = new JMenu("Aide");

        // Définir le sous-menu pour Fichier
        JMenuItem newItem = new JMenuItem("Nouveau");
        JMenuItem openItem = new JMenuItem("Ouvrir");  
        JMenuItem saveItem = new JMenuItem("Enregistrer");

        // raccorder outils et ses sous-menus
        tool.add(newItem);
        tool.add(openItem); 
        tool.add(saveItem);
        
        // raccorder au frame les menus
        menuBar.add(tool);
        menuBar.add(login);
        menuBar.add(help);
        
        // Configuration du frame
        frame.setJMenuBar(menuBar);  // IMPORTANT: setJMenuBar() au lieu de add()
        frame.setLayout(new BorderLayout());
        
        // Configuration finale du frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}