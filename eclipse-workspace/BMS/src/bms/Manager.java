package bms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Manager {

	static Logger log = LogManager.getLogger(Manager.class.getName());
    // Manager verification...

    public boolean check1(int id, int password){

        try {
            // Getting the connection
            Connection con = Connect.cc();

            // Giving the orders...
            String p = "select * from manager_data;";

            // Statement for static query..
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(p);
            while (r.next()){
                int i = r.getInt("man_id");
                int pass = r.getInt("man_pass");

                // Checking the id and password for verification..
                if (id == i && password == pass){
                    log.info("Access granted...");
                    return true;
                }
                else {
                    log.info("Info not matched...Access denied");
                }
            }
        }
        catch (Exception e){
            log.info(e);
        }
        return false;
    }

    // Manager work...

    public void man(int id, int password){

        Scanner sc = new Scanner(System.in);
        boolean b = false;   // used for the looping process if incorrect data is provided...
        // Verification..
        int flag=0;
        do {
            if (flag==0){
                b = check1(id,password);
                flag=1;
            }
            else {
                log.info("Enter the Id = ");
                int i = sc.nextInt();
                log.info("Enter the Password = ");
                int pass = sc.nextInt();
                b = check1(i,pass);
            }
        }while (!b);

        // if user exits the manager portal once and again enters
        // and gives wrong info then the entire
        // thing can work again
        flag = 0;

        boolean l = false;
        do {
            // Things manager can do..
        	log.info("=========================================================");
            log.info(" 1.Add an account" +
                    "\n 2.Update existing account" +
                    "\n 3.Delete an account" +
                    "\n 4.Display account" +
                    "\n 5.Display All Accounts" +
                    "\n 6.Exit ");
            log.info("=========================================================");
            try{
                log.info("What work do you want to do = ");
                int ch = sc.nextInt();
                switch (ch){
                    case 1:
                        // Object creation and constuctor invoking done here...
                        new AddAccount();
                        break;

                    case 2:
                        // Editing the account...
                    	new UpdateAccount();
                        break;

                    case 3:
                        // Delete an account...
                        new DeleteAccount();
                        break;

                    case 4:
                        // Displaying a specific account details...
                        new DisplayAccount();
                        break;

                    case 5:
                        // Displaying the entire database....
                        new ShowAllAccounts();
                        break;

                    case 6:
                        // Return to the home menu...
                        log.info("Exiting the manager portal...");
                        l = true;


                }
            }catch (Exception e){
                log.info("Please enter correct option...");
            }
        }while (!l);

    }
}
