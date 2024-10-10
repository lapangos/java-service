package com.demo.service.lld.snakeandladder;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");

        Snake snake1 = new Snake(14, 7);
        Ladder ladder1 = new Ladder(3, 22);

        Board board = new Board(30, Arrays.asList(snake1), Arrays.asList(ladder1));

        GameStrategy strategy = new SimpleGameStrategy();
        Game game = new Game(board, Arrays.asList(player1, player2), strategy);

        game.play();
    }
}