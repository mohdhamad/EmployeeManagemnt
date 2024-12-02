package Employee.management.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class retrievedata extends JFrame {


//


//        getContentPane().setBackground(new Color(222, 255, 220));
//        setLayout(null);
//        setSize(800,700);
//        setLocation(360,40);
//        setVisible(true);



        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/employee";
            String user = "root";
            String password = "@wasif";


            JFrame frame = new JFrame("MySQL Data in Swing Table");
            JTable table = new JTable();
            DefaultTableModel model = new DefaultTableModel();
            JScrollPane scrollPane = new JScrollPane(table);


            model.addColumn("name");
            model.addColumn("fame");
            model.addColumn("CourseName");
            model.addColumn("CollegeName");
            model.addColumn("DOB");
            model.addColumn("Gender");
            model.addColumn("emailaddress");
            model.addColumn("Address");
            table.setModel(model);

            try {
                // Establish database connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","@wasif");
                String query = "SELECT * FROM employee.signup";
                PreparedStatement statement = connection.prepareStatement(query);



                // Execute query
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    //int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String fname = resultSet.getString("fname");
                    String CourseName = resultSet.getString("CourseName");
                    String CollegeName = resultSet.getString("CollegeName");
                    String DOB = resultSet.getString("DOB");
                    String Gender = resultSet.getString("Gender");
                    String emailaddress = resultSet.getString("emailaddress");
                    String Address = resultSet.getString("Address");
                    model.addRow(new Object[]{ name, fname,CourseName,CollegeName,DOB,Gender,emailaddress,Address});
                }

                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Database Error: " );
            }

            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.setSize(1100, 700);
            frame.setLocation(200,60);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);


//        getContentPane().setBackground(new Color(222, 255, 220));
//        setLayout(null);
//        setSize(800,700);
//        setLocation(360,40);
//        setVisible(true);
        }
    }


