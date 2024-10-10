package com.demo.service.lld.cricbuzz;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Player player1 = new Player("1", "Virat Kohli");
        Player player2 = new Player("2", "Rohit Sharma");

        Team team1 = new Team("India", Arrays.asList(player1, player2));
        Team team2 = new Team("Australia", Arrays.asList(player1, player2));

        Score score1 = new Score(player1, 50, 30);
        Score score2 = new Score(player2, 70, 40);

        Match match = new Match("1", team1, team2, Arrays.asList(score1, score2));

        MatchSummaryStrategy detailedSummary = new DetailedMatchSummary();
        MatchSummaryStrategy briefSummary = new BriefMatchSummary();

        System.out.println(detailedSummary.generateSummary(match));
        System.out.println(briefSummary.generateSummary(match));
    }
}