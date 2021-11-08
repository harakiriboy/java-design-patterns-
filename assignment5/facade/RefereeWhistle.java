package com.company;

public class RefereeWhistle {
    private boolean WhistleForStart;

    public boolean isWhistleStarted() {
        return WhistleForStart;
    }

    public void WhistleStarted() {
        System.out.println("Match is started by whistle.");
        WhistleForStart = true;
    }

    public void WhisleFinished() {
        System.out.println("Match is finished by whistle.");
        WhistleForStart = false;
    }
}
