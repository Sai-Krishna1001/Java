package bms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	static Logger log = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
    	
    	log.info("=========================================================");
        log.info("Welcome to the SK_BANK");
        log.info("=========================================================");
        Login.sp();
    }

}
