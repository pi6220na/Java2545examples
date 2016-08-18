package week1_variables_if_else;

import java.util.Scanner;

public class BloodDonor {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);


    public static void main(String args[]) {


        //Testing if two things are true with AND, the && operator
        // A person can be a blood donor if
        // they weigh at least 110lbs AND are 17 or over

        System.out.println("What is your weight?");
        double weight = numberScanner.nextDouble();

        System.out.println("How old are you?");
        int age = numberScanner.nextInt();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor");
        } else {
            System.out.println("Sorry, you are not eligible");
        }


        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();

    }
}
