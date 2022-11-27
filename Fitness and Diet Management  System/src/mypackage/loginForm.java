
package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class loginForm extends JFrame implements ActionListener {
    // initialize button, panel, label, and text field
    private Container login;
    private JButton b1;
    private JLabel title, userLabel, passLabel;
    public JTextField textField1, textField2;

    // calling constructor
    loginForm() {

        setTitle("Fitness and Diet Management System");
        setBounds(300, 90, 500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        login = getContentPane();
        login.setLayout(null);

        title = new JLabel("Fitness and Diet Management System");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(600, 30);
        title.setLocation(120, 30);
        login.add(title);

        userLabel = new JLabel("UserName");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        userLabel.setSize(100, 20);
        userLabel.setLocation(100, 100);
        login.add(userLabel);

        textField1 = new JTextField();
        textField1.setFont(new Font("Arial", Font.PLAIN, 15));
        textField1.setSize(190, 20);
        textField1.setLocation(200, 100);
        login.add(textField1);

        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passLabel.setSize(100, 20);
        passLabel.setLocation(100, 150);
        login.add(passLabel);

        textField2 = new JTextField();
        textField2.setFont(new Font("Arial", Font.PLAIN, 15));
        textField2.setSize(150, 20);
        textField2.setLocation(200, 150);
        login.add(textField2);

        b1 = new JButton("Login");
        b1.setFont(new Font("Arial", Font.PLAIN, 15));
        b1.setSize(100, 20);
        b1.setLocation(150, 450);
        b1.addActionListener(this);
        login.add(b1);

        setVisible(true);
    }

    // define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae) // pass action listener as a parameter
    {
        String userValue = textField1.getText(); // get user entered username from the textField1
        String passValue = textField2.getText(); // get user entered pasword from the textField2

        // check whether the credentials are authentic or not
        if (userValue.equals("shabarisvg13@gmail.com") && passValue.equals("test")) { // if authentic, navigate user to
                                                                                      // a new
            try {
                detailform f = new detailform();
                f.setSize(320, 700); // set size of the frame
                f.setVisible(true); // make form visible to the user
            } catch (Exception e) {
                // handle exception
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } else {
            // show error message
            System.out.println("Please enter valid username and password");
        }
    }
}