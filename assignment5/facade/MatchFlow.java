package com.company;

public class MatchFlow {
    Player player = new Player();
    Football football = new Football();
    RefereeWhistle whistle = new RefereeWhistle();

    public void PlayFootball() {
        football.playFootball();
        whistle.WhistleStarted();
        player.playFootballUntilFinish(whistle);
    }
}
