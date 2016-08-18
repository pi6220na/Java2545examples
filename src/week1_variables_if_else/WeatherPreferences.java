package week1_variables_if_else;

import java.util.Scanner;

public class WeatherPreferences {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);


    public static void main(String args[]) {

        // Finding out if someone likes any of Minnesota's weather.


        System.out.println("Do you like snow? Answer Y for yes");
        String likesSnow = stringScanner.nextLine();

        System.out.println("Do you like thunderstorms? Answer Y for yes");
        String likesStorms = stringScanner.nextLine();

        //Use an OR condition - testing if person likes at least one of the things!

        if (likesSnow.equalsIgnoreCase("Y") || likesStorms.equalsIgnoreCase("Y")) {
            System.out.println("You like at least some of Minnesota's weather");
        }

        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();

    }
}
