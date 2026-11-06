package OOP_PART1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount sebastianAccount = new BankAccount("41179015", "Maildesu@deska.com", "Sebbe Astian", 100_000, 123);

        System.out.println(sebastianAccount.getAccountBalance() + "nok");

        sebastianAccount.depositFunds(5);
        System.out.println(sebastianAccount.getAccountBalance() + "nok");

        sebastianAccount.withdrawFunds(50000000);
        System.out.println(sebastianAccount.getAccountBalance() + "nok");

        BankAccount breadBank = new BankAccount();

        System.out.println(breadBank.getFullName());
    }
}