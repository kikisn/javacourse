package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorAgain {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        HomeAreaCalculatorAgain calculator = new HomeAreaCalculatorAgain(); //a default constructor is always defined implicitly
        Rectangle kitchen = calculator.getRoom(); //instance was created of the very class we are in
        Rectangle bathroom = calculator.getRoom(); //to get the non-static things wihtin class

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();
    }

    //classes within same package = no need to import

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble ();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width); //return statement has to be last
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();

    }

}