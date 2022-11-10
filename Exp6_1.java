import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyInfo extends JFrame implements ActionListener {
    Container c;
    JLabel lblName, lblStreet, lblCity, lblPinCode;
    JTextField txtName, txtStreet, txtCity, txtPinCode;
    JButton btnSubmit;
    String strName, strStreet, strCity, strPinCode;

    MyInfo() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        lblName = new JLabel("Name: ");
        txtName = new JTextField(10);
        lblStreet = new JLabel("Street: ");
        txtStreet = new JTextField(10);
        lblCity = new JLabel("City: ");
        txtCity = new JTextField(10);
        lblPinCode = new JLabel("Pincode: ");
        txtPinCode = new JTextField(10);
        btnSubmit = new JButton("MyInfo");
        c.add(lblName);
        c.add(txtName);
        c.add(lblStreet);
        c.add(txtStreet);
        c.add(lblCity);
        c.add(txtCity);
        c.add(lblPinCode);
        c.add(txtPinCode);
        c.add(btnSubmit);
        btnSubmit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSubmit) {
            strName = txtName.getText();
            strStreet = txtStreet.getText();
            strCity = txtCity.getText();
            strPinCode = txtPinCode.getText();
            JOptionPane.showMessageDialog(c, strName + "\n" + strStreet + "\n" + strCity + "\n" + strPinCode);
        }
    }

    public static void main(String z[]) {
        MyInfo frm = new MyInfo();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(300, 500, 350, 200);
        frm.setVisible(true);
    }
}