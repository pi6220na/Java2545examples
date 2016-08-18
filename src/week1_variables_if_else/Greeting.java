package week1_variables_if_else;

import java.util.Scanner;

public class Greeting {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Write your code between here...


        System.out.println("What is your name?");

        //This causes the program to pause, and wait for the user to type something, and press Enter.
        //Whatever the user types will be saved in the variable called username, and the program continues
        String username = stringScanner.nextLine();

        //Display a greeting to the user

        System.out.println("Hello, " + username);


        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }
}
