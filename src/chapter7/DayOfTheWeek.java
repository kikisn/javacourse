package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private static String weekDay;


    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from 1-7 that corresponds to a day of the week");
                int day = scanner.nextInt();
        switch (day) {
            case 1: weekDay = "Monday";
            break;
            case 2: weekDay = "Tuesday";
            break;
            case 3: weekDay = "Wednesday";
            break;
            case 4: weekDay = "Thursday";
            break;
            case 5: weekDay = "Friday";
            break;
            case 6: weekDay = "Saturday";
            break;
            case 7: weekDay = "Sunday";
            break;
        }

        System.out.println(weekDay);


    }

}
