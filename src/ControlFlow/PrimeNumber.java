package ControlFlow;

public class PrimeNumber {
    public static void PrimeNumbers() {

        System.out.println("0 is " + (isPrime(5) ? "" : "NOT") + " a prime number.");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT") + " a prime number.");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT") + " a prime number.");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT") + " a prime number.");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT") + " a prime number.");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT") + " a prime number.");
    }

    public static boolean isPrime(int num) {

        if (num <= 2) {
            return (num == 2);
        }
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
