package chapter4;

import java.util.Scanner;

public class LetterFinder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Paste your text:");
        String text = scanner.nextLine();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; !letterFound && i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
            }
        }
        if (letterFound) {
            System.out.println("This text contains the Letter 'A'");
        } else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}

