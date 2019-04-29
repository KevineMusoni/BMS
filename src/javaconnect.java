/**
 *
 * @author Kevine
 */
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;
public class javaconnect {
//    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","kevine","2001.kevI.");
           return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
