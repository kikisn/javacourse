package chapter4;

import java.util.Scanner;

public class ItemCheckout {
    public static void main(String args[]){

        System.out.println("How many items is that?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i=0; i<quantity; i++){
            System.out.println("How much is the item?");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total comes down to " + total);
    }
}
