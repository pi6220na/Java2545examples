package week7_inheritance_abstract.Static_Variables_Assignment;

public class Assignment {
//All assignments are scored out of 50    protected static double scoredOutOf = 50;    protected double points;    public Assignment(double points){        this.points = points;    }    public double getPercentScore() {        double percent = points/scoredOutOf * 100;        return percent;    }    public static double getScoredOutOf() {        return scoredOutOf;    }