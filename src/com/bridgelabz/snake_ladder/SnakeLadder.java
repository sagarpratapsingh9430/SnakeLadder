package com.bridgelabz.snake_ladder;

public class SnakeLadder {
    public static void main(String[] args) {
        int player1Position = 0;
        System.out.println("Player1 at starting position is: " + player1Position);
        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        System.out.println("Die value : " + dieValue);
    }
}
