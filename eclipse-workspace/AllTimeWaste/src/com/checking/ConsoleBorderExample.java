package com.checking;

import java.util.Arrays;

public class ConsoleBorderExample {
    public static void main(String[] args) {
        String message1 = "=====WELCOME TO THE TRAVELLER MENU=====";
        String message2 = "please select an option:";
        String message3 = "1. View my Profile";
        String message4 = "2. Update my Profile";
        String message5 = "3. Book Ticket";
        String message6 = "4. Cancel Ticket";
        String message7 = "5. Search Flights From Source to Destination";
        String message8 = "6. View My Flight Tickets";

        // Define the border characters and colors
        String borderHorizontal = "\u001B[44m" + "═".repeat(43) + "\u001B[0m";
        String borderVertical = "\u001B[44m║\u001B[0m";
        String borderStart = "\u001B[44m╔\u001B[0m";
        String borderEnd = "\u001B[44m╝\u001B[0m";

        // Print the formatted messages with border
        System.out.println(borderStart + borderHorizontal + borderEnd);
        System.out.println(borderVertical + message1 + " ".repeat(43 - message1.length()) + borderVertical);
        System.out.println(borderVertical + message2 + " ".repeat(43 - message2.length()) + borderVertical);
        System.out.println(borderVertical + message3 + " ".repeat(43 - message3.length()) + borderVertical);
        System.out.println(borderVertical + message4 + " ".repeat(43 - message4.length()) + borderVertical);
        System.out.println(borderVertical + message5 + " ".repeat(43 - message5.length()) + borderVertical);
        System.out.println(borderVertical + message6 + " ".repeat(43 - message6.length()) + borderVertical);
        System.out.println(borderVertical + message7 + " ".repeat(43 - message7.length()) + borderVertical);
        System.out.println(borderVertical + message8 + " ".repeat(43 - message8.length()) + borderVertical);
        System.out.println(borderStart + borderHorizontal + borderEnd);
    }
}
