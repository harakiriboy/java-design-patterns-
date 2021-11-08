package com.company;

public class MatchStart {
    public static void main(String[] args) {
        /*Football football = new Football();
        football.playFootball();
        RefereeWhistle whistle = new RefereeWhistle();
        whistle.WhistleStarted();                           Big code without Facade pattern
        Player player = new Player();
        player.playFootballUntilFinish(whistle);

        whistle.WhisleFinished();
        player.playFootballUntilFinish(whistle);*/


        MatchFlow matchFlow = new MatchFlow();              // Code using Facade pattern
        matchFlow.PlayFootball();

    }
}
