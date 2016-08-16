package week1;

import java.util.Scanner;

public class MandMs {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Write your code between here...


        System.out.println("Let's share some M&Ms!");
        System.out.println("How many M&Ms in a packet?");

        double mms = numberScanner.nextDouble();   //The number is probably an int, but what if there's a half M&M in the packet?

        System.out.println("How many people want to share the M&Ms?");

        int people = numberScanner.nextInt();

        //Assume. each person gets an equal amount of M&Ms. So divide number of M&Ms by number of people.

        double mmsEach = mms / people;

        //display result

        System.out.println("Each person will get " + mmsEach + " M&Ms each.");


        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }
}
