import javax.swing.*;
public class SimpleGUI {
    public static void main(String[] args) {
         // Create a new window (JFrame)
    JFrame frame = new JFrame("My First GUI");
    frame.setSize(300, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null); // absolute positioning

    frame.setVisible(true);
    }
}