package ControlFlow;

public class ForStatement {

    public static double calculateInterest(double amount, double interestRate) {



        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = ForStatement.calculateInterest(10000.0, rate);
            System.out.println("10000.0 at " + rate + "% interest = " + interestAmount
            );
        }
        return (amount * (interestRate / 100)); }
}
