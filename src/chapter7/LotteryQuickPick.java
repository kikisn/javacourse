package chapter7;

import java.util.Random;

public class LotteryQuickPick {

    private static final int LENGTH = 6; //caps lock for constant - non-changing fields in class
    //final - keyword used to ensure constant variables
    private static final int MAX_TICKER_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        printTicket(ticket);

    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKER_NUMBER) + 1; // use bound if there is only limited set of numbers to use
            //ADD +1 since specified number will not be included
        }
        return ticket;
    }

    public static void printTicket(int ticket[]){ //array specified as parameter
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | "); //println is for print line return so each number would be printed on a separate line
        }
    }

}
