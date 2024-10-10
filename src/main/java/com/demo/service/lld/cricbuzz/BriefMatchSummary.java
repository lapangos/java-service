package com.demo.service.lld.cricbuzz;

public class BriefMatchSummary implements MatchSummaryStrategy {
    @Override
    public String generateSummary(Match match) {
        return "Brief Summary for Match: " + match.getMatchId() + " - " + match.getTeam1().getName() + " vs " + match.getTeam2().getName();
    }
}