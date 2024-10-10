package com.demo.service.lld.tictactoe;

import java.util.List;
import java.util.Scanner;

public class SimpleGameStrategy implements GameStrategy {
    @Override
    public void play(Board board, List<Player> players) {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int currentPlayerIndex = 0;

        while (!gameWon && !board.isFull()) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println(currentPlayer.getName() + "'s turn. Enter row and column (0-based): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                board.printBoard();
                if (board.checkWin(currentPlayer.getSymbol())) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    gameWon = true;
                } else {
                    currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        if (!gameWon) {
            System.out.println("It's a draw!");
        }
    }
}