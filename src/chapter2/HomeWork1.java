package chapter2;

import javax.swing.text.StringContent;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String arg[]){
        // Ask a user for a season of the year,
        System.out.println("Please enter a season.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Ask a whole number.
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();

        // Ask  an adjective.
        System.out.println("Please give an adjective");
        String adjective = scanner.next();
        scanner.close();

        // Output On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee.
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
