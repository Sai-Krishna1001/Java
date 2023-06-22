package com.java.login;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Runnable task1 = () -> {
            User user = database.getUser(1);
            System.out.println("Thread 1: " + user.getName() + " - " + user.getEmail());
        };
        
        Runnable task2 = () -> {
            User user = database.getUser(2);
            System.out.println("Thread 2: " + user.getName() + " - " + user.getEmail());
            user.setEmail("krishna@gmail.com");
            database.updateUser(user);
            System.out.println("Thread 2: User updated");
        };
        
        executor.execute(task1);
        executor.execute(task2);
        
        executor.shutdown();
        
        database.close();
            
        
    }
}

