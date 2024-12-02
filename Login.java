package Employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JPasswordField passwordField2;

    JTextField textField2,textField3;

    JButton button1,button2,button3;


    Login(){
        super("Employee outlook");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/Softwareee.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        label1=new JLabel("WELCOME TO INTERRA IT");
        label1.setForeground(Color.black);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(210,110,750,50);
        add(label1);


        label2=new JLabel("EMP ID:");
        label2.setForeground(Color.black);
        label2.setFont(new Font("AvantGarde",Font.BOLD,22));
        label2.setBounds(150,180,350,50);
        add(label2);

        passwordField2=new JPasswordField(15);
        passwordField2.setBounds(325,190,230,30);
        passwordField2.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField2);


        label3=new JLabel("EMP NAME:");
        label3.setForeground(Color.black);
        label3.setFont(new Font("AvantGarde",Font.BOLD,22));
        label3.setBounds(150,250,370,30);
        add(label3);

        textField3=new JTextField(15);
        textField3.setBounds(325,250,230,30);
        textField3.setFont(new Font("Arial",Font.BOLD,14));
        add(textField3);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(325,300,100,30);
        button1.addActionListener(this);
        add(button1);


        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(470,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("Sign UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(325,360,250,30);
        button3.addActionListener(this);
        add(button3);


        setLayout(null);
        setSize(850,480);
        setLocation(300,170);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){

            } else if (e.getSource()==button2) {
                textField3.setText("");
                passwordField2.setText("");
            } else if (e.getSource()==button3) {

            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new   Login();
    }
}




