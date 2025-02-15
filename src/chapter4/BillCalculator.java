package chapter4;

import java.util.Scanner;

public class BillCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        double planFee = planFee();
        double subtotalOverage = subtotalOverage();
        scanner.close();
        double totalTax = totalTax(planFee, subtotalOverage);
        double totalBill = totalBill(planFee, subtotalOverage, totalTax);

    }
    public static double planFee() {
        System.out.println("Welcome to the Phone Bill Calculator! Please input the plan fee.");
        double planFee = scanner.nextDouble();
        System.out.println("Your plan fee is " + planFee);
        return planFee;
    }

    public static double subtotalOverage() {
        System.out.println("Please input how many minutes you used in excess of your plan.");
        int overageMinutes = scanner.nextInt();
        double overageRate = 0.25;
        double subtotalOverage = overageMinutes * overageRate;
        System.out.println("Phone Bill Statement");
        System.out.println("Your overage fee is " + subtotalOverage);
        return subtotalOverage;
    }
    public static double totalTax(double planFee, double subtotalOverage) {
        double tax = 0.15;
        double totalTax = tax * (planFee + subtotalOverage);
        System.out.println("Your total tax is " + totalTax);
        return totalTax;
    }

    public static double totalBill(double planFee, double subtotalOverage, double totalTax) {
        double totalBill = planFee + subtotalOverage + totalTax;
        System.out.println("Your total bill is " + totalBill);
        return totalBill;
    }
    }
