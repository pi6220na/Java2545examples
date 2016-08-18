package week1_variables_if_else;

import java.util.Scanner;

public class Dinner {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        // Write your code between here...

        System.out.println("What should we have for dinner?");

        String dinnerSuggestion = stringScanner.nextLine();

        //Computers only like pizza and tacos.
        //So, print one response for pizza, another response one for tacos, and another response for anything else.

        if (dinnerSuggestion.equalsIgnoreCase("pizza")) {
            System.out.println("Pizza sounds good!");
        } else if (dinnerSuggestion.equalsIgnoreCase("tacos")) {
            System.out.println("Great! I like tacos");
        } else {
            System.out.println("How about pizza, or tacos?");
        }


        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }
}

