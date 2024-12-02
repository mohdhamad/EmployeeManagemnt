package Employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup extends JFrame implements ActionListener {


    JRadioButton r1, r2, r3;

    JButton Submit,Retrieved;
    JTextField textName, textfName, textEmail, textAdd, textC, textClg;

    JDateChooser dateChooser;

    //Random ran = new Random();




    private Object connection;

    signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Softwareee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 80, 100, 100);
        add(image);


        JLabel label1 = new JLabel("APPLICATION FORM" );
        label1.setBounds(360, 20, 600, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100, 190, 300, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 24));
        textName.setBounds(240, 190, 300, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name:");
        labelfName.setBounds(100, 250, 350, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelfName);

        textfName = new JTextField();
        textfName.setFont(new Font("Raleway", Font.BOLD, 20));
        textfName.setBounds(240, 250, 300, 30);
        add(textfName);

        JLabel DOB = new JLabel("DOB:");
        DOB.setBounds(100, 400, 200, 30);
        DOB.setFont(new Font("Raleway", Font.BOLD, 15));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(240, 400, 300, 30);
        add(dateChooser);

        JLabel labelC = new JLabel("Course Name :");
        labelC.setFont(new Font("Raleway", Font.BOLD, 15));
        labelC.setBounds(100, 300, 250, 30);
        add(labelC);

        textC = new JTextField();
        textC.setFont(new Font("Raleway", Font.BOLD, 24));
        textC.setBounds(240, 300, 300, 30);
        add(textC);

        JLabel labelClg = new JLabel("College Name :");
        labelClg.setFont(new Font("Raleway", Font.BOLD, 15));
        labelClg.setBounds(100, 350, 280, 30);
        add(labelClg);

        textClg = new JTextField();
        textClg.setFont(new Font("Raleway", Font.BOLD, 24));
        textClg.setBounds(240, 350, 300, 30);
        add(textClg);

        JLabel labelG = new JLabel("Gender :");
        labelG.setBounds(100, 450, 300, 30);
        labelG.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 15));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(240, 450, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 15));
        r2.setBounds(350, 450, 80, 30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setBackground(new Color(222, 255, 228));
        r3.setFont(new Font("Raleway", Font.BOLD, 15));
        r3.setBounds(460, 450, 80, 30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 15));
        labelEmail.setBounds(100, 500, 250, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 24));
        textEmail.setBounds(240, 500, 300, 30);
        add(textEmail);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 15));
        labelAdd.setBounds(100, 550, 250, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 24));
        textAdd.setBounds(240, 550, 300, 30);
        add(textAdd);


        Submit = new JButton("Submit");
        Submit.setFont(new Font("Raleway", Font.BOLD, 14));
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setBounds(650, 550, 100, 30);
        Submit.addActionListener(this);
        add(Submit);


        Retrieved= new JButton("Retrieved");
        Retrieved.setFont(new Font("Raleway", Font.BOLD, 14));
        Retrieved.setBackground(Color.BLACK);
        Retrieved.setForeground(Color.WHITE);
        Retrieved.setBounds(790, 550, 120, 30);
        Retrieved.addActionListener(this);
        add(Retrieved);

        //Submit.setEnabled(false);

        getContentPane().setBackground(new Color(222, 255, 220));
        setLayout(null);
        setSize(1000, 850);
        setLocation(160, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = textName.getText().trim();
        String fname = textfName.getText().trim();


        String CourseName = textC.getText();
        String CollegeName = textClg.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String Gender = null;

        if (r1.isSelected()) {
            Gender = "Male";
        } else if (r2.isSelected()) {
            Gender = "Female";
        } else if (r3.isSelected()) {
            Gender = "Other";
        }
        String emailaddress = textEmail.getText();
        String Address = textAdd.getText();


        try {
            if (textName.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Fill in this fields");
            } else {
                Con con1 = new Con();
                String s = "insert into signup values('"+name+"','"+fname+"','"+CourseName+"','"
                        +CollegeName+"','"+DOB+"','"+Gender+"','"+emailaddress+"','"+Address+"')";

                //String s = "SELECT * FROM employee WHERE fname = 'hiku'";

                con1.statement.executeUpdate(s);
                new retrievedata();
                setVisible(false);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        // Signup signup = new Signup();
        // signup.actionPerformed(new ActionEvent(signup, ActionEvent.ACTION_PERFORMED, "nextButtonClicked"));
        new signup();
    }
}

