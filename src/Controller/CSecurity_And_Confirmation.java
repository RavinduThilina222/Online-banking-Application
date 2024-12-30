
package Controller;

import Model.MSecurity_And_Confirmation;




public class CSecurity_And_Confirmation {
    MSecurity_And_Confirmation msc = new MSecurity_And_Confirmation();
    public void transferMoney(String from_acc,String amount,String receiver_name,String bank,String Branch,String to_acc,String note){
        msc.transferMoeny(from_acc, amount, receiver_name, bank, Branch, to_acc, note);
    }
    
    
    
}
