package com.demo.service.lld.snakeandladder;

import java.util.List;

public interface GameStrategy {
    void play(Board board, List<Player> players);
}