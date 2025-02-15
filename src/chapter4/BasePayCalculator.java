package chapter4;

import java.util.Scanner;

public class BasePayCalculator {
    public static void main(String args[]){
        int rate = 15;
        int hoursPerWeek = 40;

        System.out.println("How many regular hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double actualHours = scanner.nextDouble();

        while (actualHours > hoursPerWeek){
            System.out.println("You have exceeded the number of regular hours worked per week. Enter the number of hours you worked regularly.");
            actualHours = scanner.nextDouble();
        }

        scanner.close();

       double basePay = actualHours * rate;
        System.out.println("You earned "+ basePay+ " this week.");
    }
}
