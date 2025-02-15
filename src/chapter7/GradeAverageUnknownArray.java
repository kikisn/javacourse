package chapter7;
/* -allows users to enter any number of grades
-provides them with their average score
-provides highest and lowest scores
 */

import java.util.Scanner;

public class GradeAverageUnknownArray {

    private static int grades[]; //if array is unknown, go ahead and declare it first
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        /*string.format - for formatting numbers where "%.2f" is a placeholder
        for the value of the operation beside it. .2f means it is a float number
        only 2 decimal places
         */
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());

    }

    public static void getGrades(){ //enhanced for loops best work for values that are already there
        for (int i=0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighest() {
        /*also possible to sort the array and get the last number
        because that would be the highest number
         */
        int highest = grades[0]; // or assign it to the very first value
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0]; // or assign it to the very first value
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }


}
