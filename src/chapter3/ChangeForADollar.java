package chapter3;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {

        int pennyValue = 1;
        int nickelValue = 5;
        int dimeValue = 10;
        int quarterValue = 25;
        int dollar = 100;

        System.out.println("How many pennies do you have?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels do you have?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes do you have?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters do you have?");
        int quarters = scanner.nextInt();

        scanner.close();

        int actualPennies = pennies * pennyValue;
        int actualNickels = nickels * nickelValue;
        int actualDimes = dimes * dimeValue;
        int actualQuarters = quarters * quarterValue;
        int totalValue = actualPennies + actualNickels + actualDimes + actualQuarters;
        int totalNeeded = dollar - totalValue;
        int totalExcess = totalValue - dollar;

        if (totalValue == dollar) {
            System.out.println("Congrats! You have $1!");
        }
        else if (totalValue < dollar) {
            System.out.println("You need " + totalNeeded + " cents to have $1.");
        }
        else if (totalValue > dollar) {
            System.out.println("You have an excess of " + totalExcess + " cents");
        }
        else {
            System.out.println("Error. Invalid amount of coins added");
        }
    }
}