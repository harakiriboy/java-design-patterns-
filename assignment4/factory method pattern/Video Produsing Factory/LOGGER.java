package com.company;

public class LOGGER {
    public static void info(String s,Director director, Video video) {
        System.out.println(video + " " + s + " by " + director);
    }
}
