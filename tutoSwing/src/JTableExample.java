import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JTableExample {

    public static void main(String[] args) {
        String[] colonnes = {"Nom", "Type"};
        Object[][] donnees = {
            {"Pikachu", "Électrik"},
            {"Bulbizarre", "Plante/Poison"}
        };
        // Créer le frame
        JFrame frame = new JFrame("Tableau d'exemple");
        
        JTable table = new javax.swing.JTable(donnees, colonnes);
        

        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Salut !");
            }
        });
        frame.add(new JScrollPane(table)); // toujours mettre un JTable dans un JScrollPane
        frame.add(button, "South");
        frame.setVisible(true);
    }
}


