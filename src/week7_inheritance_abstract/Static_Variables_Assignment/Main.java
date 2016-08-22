package week7_inheritance_abstract.Static_Variables_Assignment;

public class Main {    public static void main(String args[]) {
    Assignment assignment1 = new Assignment(45);
    double percentGrade = assignment1.getPercentScore();
    System.out.println("Assignment 1 scored out of " +
            Assignment.getScoredOutOf());
    System.out.println("Percent grade for Assignment 1 			is " + percentGrade);
    Assignment assignment2 = new Assignment(42);       double percentGrade2 = assignment2.getPercentScore();
    System.out.println("Assignment 2 scored out of " + 			Assignment.getScoredOutOf());
    System.out.println("Percent grade for Assignment 2 			is " + percentGrade2);
}}
