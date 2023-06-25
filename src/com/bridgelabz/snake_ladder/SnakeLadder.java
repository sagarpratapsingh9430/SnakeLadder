package com.bridgelabz.snake_ladder;

public class SnakeLadder {
    static final int WIN_POSITION = 100;

    static final int START_POSITION = 0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;

    static int player1Position = 0;
    public static void main(String[] args) {

        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        int option = (int) (Math.random() * 10 % 3) + 1;

        switch (option) {
            case NO_PLAY:
                System.out.println("No Play");
                break;
            case LADDER:
                if (player1Position + dieValue <= WIN_POSITION)
                    player1Position = player1Position + dieValue;
                break;
            case SNAKE:
                player1Position = player1Position - dieValue;
                if (player1Position < START_POSITION)
                    player1Position = START_POSITION;
                break;
            default:
                System.out.println("wrong option");

        }
    }
}
