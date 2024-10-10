package com.demo.service.lld.cricbuzz;

import java.util.List;

public class Match {
    private final String matchId;
    private final Team team1;
    private final Team team2;
    private final List<Score> scores;

    public Match(String matchId, Team team1, Team team2, List<Score> scores) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
        this.scores = scores;
    }

    public String getMatchId() {
        return matchId;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public List<Score> getScores() {
        return scores;
    }
}