import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

class Buttons {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel q1 = new JLabel();
        q1.setText("Select a Color");
        q1.setBounds(20, 10, 200, 30);
        JButton b1 = new JButton("Red");
        JButton b2 = new JButton("Blue");
        JButton b3 = new JButton("Green");
        JButton b4 = new JButton("Yellow");
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();
        JLabel l4 = new JLabel();
        b1.setBounds(20, 60, 100, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l1.setText("Red");
                l1.setVisible(true);
            }
        });
        b2.setBounds(130, 60, 110, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l2.setText("Blue");
                l2.setVisible(true);
            }
        });
        b3.setBounds(250, 60, 140, 30);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setVisible(false);
                l2.setVisible(false);
                l4.setVisible(false);
                l3.setText("Green");
                l3.setVisible(true);
            }
        });
        b4.setBounds(400, 60, 130, 30);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setText("Yellow");
                l4.setVisible(true);
            }
        });
        l1.setBounds(20, 150, 300, 30);
        l2.setBounds(20, 150, 300, 30);
        l3.setBounds(20, 150, 300, 30);
        l4.setBounds(20, 150, 300, 30);
        f.add(q1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.setSize(560, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
