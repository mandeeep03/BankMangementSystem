package com.bank;

import java.util.logging.Logger;

public class Main{
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){
        LOGGER.info("==========================================");
        LOGGER.info("Starting Bank Mangment System ");
        LOGGER.info("Java Version: "+System.getProperty("java.version"));
        LOGGER.info("==========================================");

        System.out.println("Bank Management System Initialized Successfully.");
    }

}
