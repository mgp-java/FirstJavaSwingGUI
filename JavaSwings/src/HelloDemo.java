import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends JFrame{
    private javax.swing.JPanel JPanel;
    private JTextField textName;
    private JButton buttonclk;

    public HelloDemo() {
        buttonclk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(buttonclk,textName.getText()+" Hello");
            }
        });
    }

    public static void main(String[] args) {
HelloDemo h = new HelloDemo();
h.setContentPane(h.JPanel);
h.setTitle("Hello");
//h.setBounds(200,200,200,200);
h.setSize(300,400);
    h.setVisible(true);
    h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
}
