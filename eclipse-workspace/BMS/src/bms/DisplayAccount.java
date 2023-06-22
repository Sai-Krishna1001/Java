package bms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DisplayAccount {
	static Logger log = LogManager.getLogger(DisplayAccount.class.getName());
    Scanner sc = new Scanner(System.in);

    DisplayAccount(){
        // taking the account number which needs to be displayed...
        log.info("Enter the account number=");
        int acc_num = sc.nextInt();

        try{
            // Getting connection..
            Connection con = Connect.cc1();

            // query..
            String q = "select * from customer_data;";

            // Static query..
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(q);

            while (r.next()){
                int ac = r.getInt("acc_num");
                if (ac==acc_num){
                    log.info("The details of the user is given below :--");
                    String acc_name = r.getString("acc_name");
                    int acc_amount = r.getInt("acc_amount");
                    int acc_pin = r.getInt("acc_pin");

                    // displaying the data...
                    log.info("=========================================================");
                    log.info("Account holder name = {}" , acc_name);
                    log.info("Account number = {}" , acc_num);
                    log.info("Account pin = {}" , acc_pin);
                    log.info("Amount present = {}" , acc_amount);
                    log.info("=========================================================");

                    break; // Since the account needed is successfully found no need to search any further..
                }
            }
        }
        catch (Exception e){
            log.info("Sorry account not found...");
        }
    }

    DisplayAccount(int acc){

        try{
            // Getting connection..
            Connection con = Connect.cc1();

            // query..
            String q = "select * from customer_data;";

            // Static query..
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(q);

            while (r.next()){
                int ac = r.getInt("acc_num");
                if (ac==acc){
                    log.info("The details of the user is given below :--");
                    String acc_name = r.getString("acc_name");
                    int acc_amount = r.getInt("acc_amount");
                    int acc_pin = r.getInt("acc_pin");

                    // displaying the data...
                    log.info("=========================================================");
                    log.info("Account holder name = {}" , acc_name);
                    log.info("Account number = {}" , acc);
                    log.info("Account pin = {}" , acc_pin);
                    log.info("Amount present = {}" , acc_amount);
                    log.info("=========================================================");

                    break; // Since the account needed is successfully found no need to search any further..
                }
            }
        }
        catch (Exception e){
            log.info("Sorry account not found...");
        }

    }
}
