package com.demo.service.lld.cricbuzz;

public class MatchSummary {
    private final Match match;
    private final String summary;

    public MatchSummary(Match match, String summary) {
        this.match = match;
        this.summary = summary;
    }

    public Match getMatch() {
        return match;
    }

    public String getSummary() {
        return summary;
    }
}