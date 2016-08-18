package week1_variables_if_else;

import java.util.Scanner;

public class Apollo11Quiz {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Quiz time!");
        System.out.println("What year did the Apollo 11 spaceship land on the moon?");

        //Hint... it was 1969

        int answer = numberScanner.nextInt();

        // The != operator tests if two values are NOT equal
        // This condition tests if answer is not equal to 1969.
        if ( answer != 1969 ) {
            System.out.println("Wrong answer - it was 1969");
        }

        stringScanner.close();
        numberScanner.close();
    }
}
