import java.awt.*;
import java.awt.event.*;

class Register {
    public static void main(String[] args) {
        Frame f = new Frame("Registration Form");
        Font name_font = new Font("arial", Font.PLAIN, 15);
        Label l_title = new Label("Registration Form");
        Label l_name = new Label("First Name: ");
        Label l_sur = new Label("Last Name: ");
        Label l_gender = new Label("Gender: ");
        Label msg = new Label("Form has been Submitted.");
        TextField t_name = new TextField();
        TextField t_sur = new TextField();
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", true, cbg);
        Checkbox female = new Checkbox("Female", true, cbg);
        Button b = new Button("SUBMIT");
        Dialog d = new Dialog(f, "Alert!");
        l_title.setBounds(30, 40, 200, 30);
        l_title.setFont(new Font("arial", Font.BOLD, 22));
        l_name.setBounds(30, 80, 100, 20);
        l_name.setFont(name_font);
        l_sur.setBounds(30, 110, 100, 20);
        l_sur.setFont(name_font);
        l_gender.setBounds(30, 140, 100, 20);
        l_gender.setFont(name_font);
        t_name.setBounds(150, 80, 200, 20);
        t_sur.setBounds(150, 110, 200, 20);
        male.setBounds(150, 140, 100, 20);
        female.setBounds(260, 140, 100, 20);
        b.setBounds(125, 170, 100, 30);
        b.setBackground(new Color(255, 0, 0));
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                msg.setBounds(20, 40, 200, 20);
                d.add(msg);
                d.setSize(300, 100);
                d.setLayout(null);
                d.setVisible(true);
                d.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent w) {
                        d.setVisible(false);
                    }
                });
            }
        });
        f.add(l_title);
        f.add(l_name);
        f.add(l_sur);
        f.add(l_gender);
        f.add(t_name);
        f.add(t_sur);
        f.add(male);
        f.add(female);
        f.add(b);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
        f.setBackground(new Color(255, 255, 255));
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
    }
}
