package chapter8;
//counts the number of words in a String and prints them individually on a new line

public class TextProcessor {

    public static void main(String[]args){
        //countWords("I love Test Automation University");
        //reverseString("Hello TAU!");
        //addSpaces("HeyWorld!JeSuisHoney");
        splitAvacado("avacado");

    }
    /**
     * Splits a String into an array by tokeniziing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" "); //spaces used as delimiter
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }

    }

    /**Palindrome generator
     *
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }

    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))) {//if this
                // character is not the first character and is uppercase,
                // i know to add a space here
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);

    }

    public static void splitAvacado(String text){
        var splitAvacado =  text.split("a");

        System.out.println(splitAvacado);
    }


}
