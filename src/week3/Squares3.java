package week3;

import java.util.Scanner;

public class Squares3 {

    //Create two scanners
    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    //This is the main method - the first code to run
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number and I'll square it");
        double number = scanner.nextDouble();
        double squaredNumber = square(number);
        System.out.println("The square of " + number + " is " + squaredNumber);

        //Close scanners.
        stringScanner.close();
        numberScanner.close();

    }    // This is the end of the main method.


    // This method takes one argument, a number
    // It calculates the square of that number (by multiplying it by itself)
    // and then returns the square value.
    public static double square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        return sq;

    }    // The end of the squares method
}



