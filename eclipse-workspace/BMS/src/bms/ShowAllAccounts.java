package bms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShowAllAccounts {

	static Logger log = LogManager.getLogger(ShowAllAccounts.class.getName());
    Scanner sc = new Scanner(System.in);
    ShowAllAccounts(){
        try{
            Connection con = Connect.cc1();

            String p = "select * from customer_data;";

            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(p);

            log.info("Showing the entire database....");
            log.info("=========================================================");
            while (r.next()){

                // Getting the data...
                String acc_name = r.getString("acc_name");
                int acc_num = r.getInt("acc_num");
                int acc_amount = r.getInt("acc_amount");
                int acc_pin = r.getInt("acc_pin");

                // displaying the data...
                log.info("\n\nAccount holder name = " + acc_name);
                log.info("Account number = " + acc_num);
                log.info("Account pin = " + acc_pin);
                log.info("Amount present = " + acc_amount);
            }
            log.info("=========================================================");
        }
        catch (Exception e){
            log.info("Operation cannot be performed....");
        }
    }
}
