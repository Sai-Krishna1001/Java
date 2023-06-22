package com.checking;
import java.util.logging.Logger;

public class SwitchExpressionWithYield {
    private static final Logger LOGGER = Logger.getLogger(SwitchExpressionWithYield.class.getName());

    public static void main(String[] args) {
        int num = 5;
        String result = switch (num) {
            case 1, 2 -> {
//                LOGGER.info("One or Two");
                yield "One or Two";
            }
            case 3 -> {
//                LOGGER.info("Three");
                yield "Three";
            }
            default -> {
//                LOGGER.info("Invalid number");
                yield "Invalid number";
            }
        };
        LOGGER.info(result);
    }
}

