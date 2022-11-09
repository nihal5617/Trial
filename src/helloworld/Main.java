package helloworld;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox depts;

    JTextArea adr, screen;

    JCheckBox terms;
    JButton submit;
    JLabel msg;

    Main() {
        super.setTitle("Registration Form");
        super.setSize(700, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        // name label
        label1 = new JLabel("Name");
        label1.setBounds(40, 30, 100, 20);
        c.add(label1);
        // name inputbox
        t1 = new JTextField();
        t1.setBounds(120, 30, 150, 20);
        c.add(t1);
        // sapid label
        label2 = new JLabel("SAP Id");
        label2.setBounds(40, 80, 100, 20);
        c.add(label2);
        // sapid inputbox
        t2 = new JTextField();
        t2.setBounds(120, 80, 150, 20);

        c.add(t2);

        // gender label
        label3 = new JLabel("Gender");
        label3.setBounds(40, 130, 100, 20);
        c.add(label3);
        // radiobutton
        male = new JRadioButton("Male");
        male.setBounds(120, 130, 90, 20);
        female = new JRadioButton("Female");
        female.setBounds(210, 130, 100, 20);
        c.add(male);
        c.add(female);
        // to select only one radio button
        ButtonGroup btn = new ButtonGroup();
        btn.add(male);
        btn.add(female);
        // to select department
        label4 = new JLabel("Department");
        label4.setBounds(40, 180, 100, 20);
        c.add(label4);
        // list of departments
        String dept[] = {"Computer", "I.T", "EXTC", "ELEX", "Mechanical", "Chemical", "A I-ML", "DS",
            "IOT & Cyber Security"};
        depts = new JComboBox(dept);
        depts.setBounds(120, 180, 150, 20);
        c.add(depts);

        // to input address
        label5 = new JLabel("Address");
        label5.setBounds(40, 230, 100, 20);
        c.add(label5);
        // text area
        adr = new JTextArea();
        adr.setBounds(120, 230, 150, 70);
        c.add(adr);
        // checkbox
        terms = new JCheckBox("Save and Proceed");
        terms.setBounds(40, 330, 170, 25);
        c.add(terms);
        // submit button
        submit = new JButton("Submit");
        submit.setBounds(40, 380, 170, 25);
        c.add(submit);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitactionPerformed(evt);
            }
        });
        // display of form details screen = new JTextArea();
        screen.setBounds(350, 30, 300, 375);
        screen.setBorder(new EmptyBorder(100, 60, 10, 10));
        c.add(screen);
        // message
        msg = new JLabel("");
        msg.setBounds(40, 430, 170, 25);
        c.add(msg);
    }

    public void submitactionPerformed(ActionEvent e) {
        if (terms.isSelected()) {
            msg.setText("Registartion Successful !!");
            String name = t1.getText();
            String sapid = t2.getText();
            String gender = "Male";
            if (female.isSelected()) {
                gender = "Female";
            }
            String dept = (String) depts.getSelectedItem();
            String address = adr.getText();
            screen.setText("Name - " + name + "\n" + "SAP Id -" + sapid + "\n" + "Gender - " + gender + "\n"
                    + "Department - " + dept + "\n" + "Address - " + address
                    + "\n");
        } else {
            msg.setText("Kindly Save and Procced !!");
            screen.setText(" ");

        }
    }
    


    public static void main(String args[]) throws Exception {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
//        MyFrame frame = new MyFrame();
    }
}

//public class Main {
//    public static void main(String args[]) throws Exception{
//
//        MyFrame frame = new MyFrame();
//    }
//}
