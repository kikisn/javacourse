package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DieSimulator {
    public static void main(String args[]) {

        int spaces = 20;
        int maxRolls = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Roll the Die! Enter any letter to start");
        String letter = scanner.nextLine();

        boolean endGame = false;

        for (int i = 0; !endGame && i < spaces; i++) {
            int total = 0;

            for (int j = 0; j < maxRolls; j++) {
                Random random = new Random();
                int die = random.nextInt(6) + 1;
                total = total + die;
                System.out.println("You've rolled = " + die +". You are now on space " + die + " and have " + (spaces - total) + " to go!");
                if (total == spaces) {
                    endGame = true;
                }
            }
            if (endGame) {
                System.out.println("Congratulations! You have won the game.");
            } else {
                System.out.println("You lost the game.");
            }
        }
    }
}
