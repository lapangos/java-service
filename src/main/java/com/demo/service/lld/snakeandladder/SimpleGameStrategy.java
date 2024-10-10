package com.demo.service.lld.snakeandladder;

import java.util.List;
import java.util.Random;

public class SimpleGameStrategy implements GameStrategy {
    private final Random random = new Random();

    @Override
    public void play(Board board, List<Player> players) {
        boolean gameWon = false;
        while (!gameWon) {
            for (Player player : players) {
                int diceRoll = random.nextInt(6) + 1;
                int newPosition = player.getPosition() + diceRoll;
                if (newPosition > board.getSize()) {
                    newPosition = board.getSize();
                }
                for (Snake snake : board.getSnakes()) {
                    if (snake.getHead() == newPosition) {
                        newPosition = snake.getTail();
                    }
                }
                for (Ladder ladder : board.getLadders()) {
                    if (ladder.getStart() == newPosition) {
                        newPosition = ladder.getEnd();
                    }
                }
                player.setPosition(newPosition);
                System.out.println(player.getName() + " is at position " + player.getPosition());
                if (newPosition == board.getSize()) {
                    System.out.println(player.getName() + " wins!");
                    gameWon = true;
                    break;
                }
            }
        }
    }
}