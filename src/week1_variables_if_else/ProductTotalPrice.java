package week1_variables_if_else;

import java.util.Scanner;

public class ProductTotalPrice {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Write your code between here...

        System.out.println("What is the name of the product?");
        String productName = stringScanner.nextLine();

        System.out.println("What does one " + productName + " cost?");
        double price = numberScanner.nextDouble();

        System.out.println("How many " + productName + " to sell?");
        double quantity = numberScanner.nextInt();

        //Math - the total price is quantity * price. Save in a double variable
        double totalPrice = quantity * price;

        //Display the total price
        System.out.println("The total price is $" + totalPrice);

        //Or we could be more verbose...

        System.out.println(quantity + " " + productName + " at $" + price + " each will cost a total of $" + totalPrice);

        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }
}
