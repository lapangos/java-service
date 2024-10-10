package com.demo.service.lld.cricbuzz;

public class DetailedMatchSummary implements MatchSummaryStrategy {
    @Override
    public String generateSummary(Match match) {
        StringBuilder summary = new StringBuilder();
        summary.append("Detailed Summary for Match: ").append(match.getMatchId()).append("\n");
        summary.append(match.getTeam1().getName()).append(" vs ").append(match.getTeam2().getName()).append("\n");
        for (Score score : match.getScores()) {
            summary.append(score.getPlayer().getName()).append(": ").append(score.getRuns()).append(" runs, ").append(score.getBalls()).append(" balls\n");
        }
        return summary.toString();
    }
}