package bms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeleteAccount {
	
	static Logger log = LogManager.getLogger(DeleteAccount.class.getName());
    Scanner sc = new Scanner(System.in);
    DeleteAccount(){
        log.info("Enter the account number which needs to be deleted =");
        int ac = sc.nextInt();
        boolean b = acc_check(ac);
        if (b){
            try{
                Connection con = Connect.cc1();

                String q = "delete from customer_data where acc_num = ?;";

                PreparedStatement p = con.prepareStatement(q);
                p.setInt(1,ac);
                p.executeUpdate();
                log.info("Account deleted successfully!!!");
            }
            catch(Exception e){
                log.info("nope");
            }
        }
        else {
            log.info("Account not found!!!");
        }

    }

    // Checking whether account exists in database or not...
    public boolean acc_check(int ac){
        try{
            Connection con = Connect.cc1();

            String j = "select * from customer_data;";

            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(j);

            while (r.next()){
                int a_num = r.getInt("acc_num");
                if (ac==a_num){
                    return true;
                }
            }
        }
        catch(Exception e){
            log.info(e);
        }
        return false;
    }
}
