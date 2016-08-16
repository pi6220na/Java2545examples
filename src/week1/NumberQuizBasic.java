package week1;

import java.util.Scanner;

public class NumberQuizBasic {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        int secretNumber = 6;

        System.out.println("Guess the number I am thinking of");
        int guess = numberScanner.nextInt();

        if (guess == secretNumber) {
            System.out.println("You guessed correctly!");
        }

        stringScanner.close();
        numberScanner.close();
    }
}