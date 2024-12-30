
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;

public class MSecurity_And_Confirmation {
    int rowcount = 0;
    String t_ID;
    
    public void transferMoeny(String from_acc,String amount,String receiver_name,String bank,String Branch,String to_acc,String note){
        try{
        String countQuery = "SELECT COUNT(*) AS row_count FROM `online money transaction`";
        PreparedStatement countStatement = ShiftBankDBConnection.getBankDBConnection().prepareStatement(countQuery);
        ResultSet countResultSet = countStatement.executeQuery();
            
            if (countResultSet.next()) {
                rowcount = countResultSet.getInt("row_count");
            }
            
            countResultSet.close();
            countStatement.close();
            
            t_ID = generateAutoIncrementId("T",rowcount);
            
            double Amount = Double.parseDouble(amount);
            String Date = "2023-08-23";
            
        Statement st = ShiftBankDBConnection.getBankDBConnection().createStatement();
        int row_count = st.executeUpdate("INSERT INTO `online money transaction` VALUES ('"+t_ID+"','"+from_acc+"','"+Amount+"','"+Date+"','"+note+"','"+note+"','"+receiver_name+"','"+bank+"','"+Branch+"','"+to_acc+"')");
        if(row_count>0){
            JOptionPane.showMessageDialog(null,"Money Transaction is successfully", "Submission", JOptionPane.INFORMATION_MESSAGE);
         }
        
        
        
        
        }
        catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
        
        
        
        
            
        
        
    }

    public String generateAutoIncrementId(String l,int rowCount) {
        // Format the rowCount with leading zeros
        String formattedCount = String.format("%d", rowCount + 1);

        return l+"00" + formattedCount;
    }
       
       
    
    
    
}
