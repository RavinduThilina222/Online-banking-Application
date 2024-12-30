package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MTransfer_Details {
    int Count = 0;
    String Acc_No;
    double Balance;
   
    public String showAccountDetails(){
        
        try{
            String sql = "SELECT `Balance` FROM `account`";
            PreparedStatement pst = ShiftBankDBConnection.getBankDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            Balance = rst.getDouble("`Balance`");
        }
        catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
        
        String ShowBalance = Double.toString(Balance);
        
        return ShowBalance;
    }
       
    
}
