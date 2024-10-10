package com.demo.service.lld.cricbuzz;

public class Score {
    private final Player player;
    private final int runs;
    private final int balls;

    public Score(Player player, int runs, int balls) {
        this.player = player;
        this.runs = runs;
        this.balls = balls;
    }

    public Player getPlayer() {
        return player;
    }

    public int getRuns() {
        return runs;
    }

    public int getBalls() {
        return balls;
    }
}