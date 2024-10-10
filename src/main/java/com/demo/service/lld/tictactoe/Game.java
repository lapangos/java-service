package com.demo.service.lld.tictactoe;

import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final GameStrategy strategy;

    public Game(Board board, List<Player> players, GameStrategy strategy) {
        this.board = board;
        this.players = players;
        this.strategy = strategy;
    }

    public void play() {
        strategy.play(board, players);
    }
}