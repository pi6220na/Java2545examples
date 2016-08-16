package week1;

import java.util.Scanner;

public class UsingNumberAndStringScanners {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Write your code between here...

        System.out.println("What is the current month?");
        String month = stringScanner.nextLine();

        System.out.println("What is today's date (as a number)?");
        int day = numberScanner.nextInt();

        System.out.println("What is today's forecast high temp?");
        double high = numberScanner.nextDouble();

        System.out.println("What is today's forecast low temp?");
        double low = numberScanner.nextDouble();

        double diff = high - low;

        System.out.println("On " + month + " " + day + " the difference between the forecast high and low temperatures is " + diff + " F");

        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }
}

