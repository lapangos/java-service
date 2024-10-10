package com.demo.service.lld.tictactoe;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", 'X');
        Player player2 = new Player("Bob", 'O');

        Board board = new Board(3);

        GameStrategy strategy = new SimpleGameStrategy();
        Game game = new Game(board, Arrays.asList(player1, player2), strategy);

        game.play();
    }
}