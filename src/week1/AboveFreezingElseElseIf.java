package week1;

import java.util.Scanner;

public class AboveFreezingElseElseIf {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter today's temperature in F");
        double temp = numberScanner.nextDouble();

        if (temp > 32) {
            //This will run if the condition is true - if temp is greater than 32
            System.out.println("It's above freezing");
        } else if (temp == 32) {
            //Another condition to check - we can also test if it is exactly 32
            System.out.println("It's exactly freezing");
        } else {
            //If neither of the conditions are true, then this code will run.
            System.out.println("It's below freezing");
        }

        //Indentation in if blocks is optional but strongly suggested
        //It's a standard convention and helps readability

        stringScanner.close();
        numberScanner.close();
    }

}
