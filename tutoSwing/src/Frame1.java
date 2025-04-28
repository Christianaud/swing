import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Frame1 {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Test MVC");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    JPanel panel = new JPanel();
    panel.add(new JLabel("Hello, Swing!"));
    frame.add(panel);

    frame.setVisible(true);

    }
    

    
}
