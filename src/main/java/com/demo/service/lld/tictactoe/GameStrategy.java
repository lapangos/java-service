package com.demo.service.lld.tictactoe;

import java.util.List;

public interface GameStrategy {
    void play(Board board, List<Player> players);
}