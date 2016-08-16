package week1;

import java.util.Scanner;

public class ComparingStringsWrongWay {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Which college do you attend?");
        String college = numberScanner.nextLine();

        //This line does not do as you might expect!
        if (college == "MCTC") {
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should go to MCTC!");
        }

        stringScanner.close();
        numberScanner.close();
    }
}