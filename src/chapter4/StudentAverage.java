package chapter4;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 24;
        int numberOfTests = 4;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("What is the last name of the student?");
            String name = scanner.next();
            double total = 0;

            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("What is their score for test " + (j + 1) + "?");
                double score = scanner.nextDouble();
                total = total + score;
            }

            double studentAverage = total / numberOfTests;
            System.out.println( name + "'s average is " + studentAverage);
        }

        scanner.close();
    }
}
