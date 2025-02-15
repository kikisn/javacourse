package chapter4;

import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        boolean again = false;

        do {
            System.out.println("Give me a number");
            int number1 = scanner.nextInt();
            System.out.println("Give me a 2nd number");
            int number2 = scanner.nextInt();

            int sum = number1 + number2;

            System.out.println("The sum is " + sum);

            System.out.println("Again? (True or False)");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();

    }
}
