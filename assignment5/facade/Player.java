package com.company;

public class Player {
    public void playFootballUntilFinish(RefereeWhistle whistle) {
        if(whistle.isWhistleStarted()) {
            System.out.println("Player on the match.");
        }
        else {
            System.out.println("Player on the way to home");
        }
    }
}
