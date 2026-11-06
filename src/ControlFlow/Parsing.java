package ControlFlow;

public class Parsing {
    public static void Parsing() {
        int currentYear = 2026;
        String DOB = "1999";
        int intDOB = Integer.parseInt(DOB);
        System.out.println("Age = " + (currentYear - intDOB));
    }
}
