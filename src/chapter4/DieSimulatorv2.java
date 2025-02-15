package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DieSimulatorv2 {
    public static void main(String args[]){

        int numberOfSpaces = 20;
        int maxRolls = 5;
        int currentSpace = 0;
        Random random = new Random();

        System.out.println("Welcome to Die Simulator v.2. Press enter to get started.");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();

        for(int i=1; i<=maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            System.out.println("You are on Space " + currentSpace + ".You have " + (maxRolls - i) + " roll/s left.");


            if(currentSpace == numberOfSpaces){
                System.out.println("Congratulations! You have won!");
                break;
            }
            else if(currentSpace > numberOfSpaces){
                System.out.println("You are on Space " + currentSpace + " which does not exist. You lost. :(");
                break;
            }
            else if(i==maxRolls && currentSpace < numberOfSpaces){
                System.out.println("You are on Space " + currentSpace + " which is " + (numberOfSpaces - currentSpace) + " spaces away. You lost :(");

            }
            else {
                System.out.println("Press Enter to Roll again");
                letter = scanner.nextLine();
            }

            System.out.println();
        }
    }
}
