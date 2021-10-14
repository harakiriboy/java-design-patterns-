package com.company;

public class LOGGER {
    public static void info(String s, OSFactory osfactory, Menu menu, Window window) {
        System.out.println("Window of type of " + window + " and Menu type of " + menu + " " + s + " " + osfactory);
    }
}
