package chapter7;

import java.util.Scanner;

public class DayOfTheWeekArray {
    private static final int LENGTH = 7;

    public static void main(String args[]){
        String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number from 1-7 that corresponds to a day of the week");
        int index = input.nextInt();
        input.close();

        System.out.println("The day of the week is: " + weekDay[index -1]);

    }
}

