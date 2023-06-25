package com.bridgelabz.snake_ladder;

public class SnakeLadder {
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static final int WIN_POSITION = 100;
    static final int START_POSITION = 0;

    static int player1Position = 0;

    private static int dieRoll() {
        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        return dieValue;
    }

    private static int getOption() {
        int option = (int) (Math.random() * 10 % 3) + 1;
        return option;
    }

    public static void main(String[] args) {

        System.out.println("Player1 at starting position: " + player1Position);


        while (player1Position < WIN_POSITION ) {
            int dieValue = dieRoll();
            System.out.println("Die:" + dieValue);
            int option = getOption();
            System.out.println("Option:" + option);

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

            System.out.println("Position Player 1: " + player1Position);

        }
    }
}
