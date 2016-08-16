package week1;

import java.util.Scanner;

public class JavascriptQuiz {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Quiz time! Finish the quote.");
        System.out.println("Java is to Javascript as Car is to... ?");

        String answer = stringScanner.nextLine();

        // The .equals method is case sensitive. If you don't need
        // to be case sensitive, you can use the equalsIgnoresCase method.
        // So JavaScript and JAVASCRIPT and javascript are all correct answers.
        if ( answer.equalsIgnoreCase("javascript") ) {
            System.out.println("Correct!!!");
        } else {
            System.out.println("Sorry, the answer is 'Javascript'. ");
        }

        stringScanner.close();
        numberScanner.close();
    }
}