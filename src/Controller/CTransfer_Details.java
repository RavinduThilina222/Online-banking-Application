package Controller;
import Model.MSecurity_And_Confirmation;
import java.sql.Statement;
import java.sql.ResultSet;

import Model.MTransfer_Details;
import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;


public class CTransfer_Details {
    MTransfer_Details mtd = new MTransfer_Details();
    MSecurity_And_Confirmation msn = new MSecurity_And_Confirmation();
    
    public String showBalance(){
        return mtd.showAccountDetails();
    }
    
}
