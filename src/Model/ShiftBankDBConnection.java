package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class ShiftBankDBConnection {
    private static  Connection con;
    public static Connection getBankDBConnection(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbpath = "jdbc:mysql://localhost:3308/bank";
        con = DriverManager.getConnection(dbpath, "root", "");        
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        
        
    return con;
    }
}
