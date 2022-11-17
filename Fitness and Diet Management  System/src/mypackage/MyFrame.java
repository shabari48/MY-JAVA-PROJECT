package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JLabel res;
    private JLabel ag;
    private JTextArea tag;
    private JLabel wg;
    private JTextArea wag;

    public MyFrame() {
        setTitle("Fitness and Diet Management System");
        setBounds(300, 90, 500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Fitness and Diet Management System");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(600, 30);
        title.setLocation(120, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        add = new JLabel("Age");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 25);
        add.setLocation(100, 250);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(190, 25);
        tadd.setLocation(200, 250);
        tadd.setLineWrap(true);
        c.add(tadd);

        ag = new JLabel("Height(in metre)");
        ag.setFont(new Font("Arial", Font.PLAIN, 20));
        ag.setSize(150, 25);
        ag.setLocation(100, 300);
        c.add(ag);

        tag = new JTextArea();
        tag.setFont(new Font("Arial", Font.PLAIN, 15));
        tag.setSize(190, 25);
        tag.setLocation(250, 300);
        tag.setLineWrap(true);
        c.add(tag);

        wg = new JLabel("Weight(in kgs)");
        wg.setFont(new Font("Arial", Font.PLAIN, 20));
        wg.setSize(150, 25);
        wg.setLocation(100, 350);
        c.add(wg);

        wag = new JTextArea();
        wag.setFont(new Font("Arial", Font.PLAIN, 15));
        wag.setSize(190, 25);
        wag.setLocation(250, 350);
        wag.setLineWrap(true);
        c.add(wag);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data = "Name : "
                        + tname.getText() + "\n"
                        + "Mobile : "
                        + tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";

                String data2 = "Age : " + tadd.getText() + "\n";
                String data3 = "Height : " + tag.getText() + "\n";
                String data4 = "Weight : " + wag.getText() + "\n";
                try {
                    FileOutputStream fos = new FileOutputStream(tname.getText() + ".txt");
                    fos.write((data + data1 + data2 + data3 + data4).getBytes());
                } catch (Exception f) {
                    System.out.println("File not found");
                }
                res.setText("Registration Successfully..");
            }
        }
    }
}
