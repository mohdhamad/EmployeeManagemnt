package Employee.management.system;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.sql.DriverManager;

public class Con {

    static Connection connection;

    Statement statement;

    public Con(){
        try{

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","@wasif");
           connection.setAutoCommit(true);


            statement=connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }

    }



}
