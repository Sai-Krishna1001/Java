package bms;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Login {
	
	static Logger log = LogManager.getLogger(Login.class.getName());
    // Starting point of the program...
    public static void sp() {
        Scanner sc = new Scanner(System.in);

        // k is taken for looping the manager part...
        boolean k = false;
        // j is taken for looping the customer part...
        boolean j = false;
        // this is done for looping the entire switch case ...
        boolean signal = false;
        while (!signal) {
        	log.info("=========================================================");
            log.info("Press 1 to login as a manager");
            log.info("Press 2 to login as a customer");
            log.info("Press 3 to exit");
            log.info("=========================================================");

            try{
                log.info("Enter the way you want to login=");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        // Manager part

                        // Taking the inputs from the user
                        log.info("Enter the Id = ");
                        int i = sc.nextInt();
                        log.info("Enter the Password = ");
                        int password = sc.nextInt();
                        Manager m = new Manager();
                        m.man(i,password);
                        break;

                    case 2:
                        // Customer part

                        // Taking the inputs from the customer
                        log.info("Enter the account number = ");
                        int cust_num = sc.nextInt();
                        log.info("Enter the pin = ");
                        int cust_pin = sc.nextInt();
                        // making the object for customer
                        Customer o = new Customer();
                        o.cust(cust_num,cust_pin);

                        break;

                    case 3:
                    	log.info("=========================================================");
                        log.info("Thank you for using SK Banking System");
                        log.info("=========================================================");
                        signal = true;
                        break;

                    default:
                        log.info("Please enter the correct option...");
                }

            }catch (Exception e){
                log.info("Please enter the correct option...");
            }
                    }
    }
}
