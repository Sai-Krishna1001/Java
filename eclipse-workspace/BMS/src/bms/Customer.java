package bms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer {
	
	static Logger log = LogManager.getLogger(Customer.class.getName());
    Scanner sc = new Scanner(System.in);

    // Customer work...
    public void cust(int cn,int cp){ // cn here and everywhere related to customer
        // is the account number and cp is customer pin..

        boolean b = false;   // used for the looping process if incorrect data is provided...
        // Verification..
        int flag=0;
        do {
            if (flag==0){
                b = check2(cn,cp);
                flag=1;
            }
            else {
            	log.info("Info not matched...Access denied");
                log.info("Enter the account number = ");
                int i = sc.nextInt();
                log.info("Enter the Pin  = ");
                int pin = sc.nextInt();
                b = check2(i,pin);
            }
        }while (!b);

        // if user exits the customer portal once and again enters
        // and gives wrong info then the entire
        // thing can work again
        flag = 0;

        try{
            boolean p = false;
            while (!p){
            	log.info("=========================================================");
                log.info("1. View account details"+
                        "\n2. Deposit cash" +
                        "\n3. Withdraw cash" +
                        "\n4. Exit");
                log.info("=========================================================");
                log.info("\nWhat work do you want to perform = ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        // View account details..
                        
                        new DisplayAccount(cn);
                        break;

                    case 2:
                        // Deposit cash..
                      
                        new Deposit(cn);
                        break;

                    case 3:
                        // Withdraw cash..
                       
                        new Withdraw(cn);
                        break;

                    case 4:
                        // Exit
                        log.info("Exiting from the customer portal...");
                        p = true;
                        break;

                    default:
                        log.info("Enter the correct option...");
                }
            }
        }
        catch (Exception e){
            log.info("Please enter the correct option...");
        }
    }

    // Customer details checking...
    public boolean check2(int cn,int cp){
        try{
            // Getting the connection..
            Connection con = Connect.cc1();

            // Query that needs to be fired..
            String q = "select * from customer_data;";

            // Statement(static query)..
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(q);

            while (r.next()){
                int acc_num = r.getInt("acc_num");
                int acc_pin = r.getInt("acc_pin");
                if (acc_num == cn && acc_pin == cp){
                    log.info("\nAccess granted..");
                    log.info("\nWelcome {} " , r.getString("acc_name"));
                    return true;
                }
            }
        }
        catch (Exception e){
            log.info("\nSorry couldn't perform your operation...");
        }
        return false;
    }



}
