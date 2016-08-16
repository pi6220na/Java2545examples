package week1;

import java.util.Scanner;

public class AboveFreezingElse {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter today's temperature in F");
        double temp = numberScanner.nextDouble();

        if (temp > 32) {
            //This will run if the condition is true
            System.out.println("It's above freezing");
        } else {
            System.out.println("It's below freezing");
        }

        //Indentation in if blocks is optional but strongly suggested
        //It's a standard convention and helps readability

        stringScanner.close();
        numberScanner.close();
    }

}
