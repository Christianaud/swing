import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.*;

public class JBoutonExemple {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Bouton");// fenetre pour contenir d'autres composants

        JLabel label = new JLabel("Je suis un label");//créer une étiquette pour une texte
        label.setBounds(10, 10, 100, 350);
        

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 180, 20);

        // Définir les boutons
        JButton btn1 = new JButton("Bouton 1");
        btn1.setBounds(90, 120, 100, 40);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    textArea.setText("Bienvenu ICI");
            }
        });

        frame.add(label);
        frame.add(btn1);
        frame.add(textArea);
        frame.setSize(300, 300);   // taille 
        frame.setTitle("Mini-application"); // titre
        frame.setVisible(true); // apparaitre
        frame.setResizable(true); // modifier sa taille
        frame.setLocation(140, 70);// position sur écran

        



    }
}
