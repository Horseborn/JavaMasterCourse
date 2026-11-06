package OOP_PART1;

public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String fullName;
    private String mail;
    private String phoneNumber;

    public BankAccount() {

        this("Default Phone", "Default Email", "Default name", 100, 123);
    }

    public BankAccount(String phoneNumber, String mail, String fullName, int accountBalance, int accountNumber) {
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.fullName = fullName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String fullName, String mail, String phoneNumber) {
        this(phoneNumber, mail, fullName, 99, 99);
    }

    public void withdrawFunds(int amount) {

        if ((accountBalance - amount) < 0) {
            System.out.println("Amount is more than what is available.");

        } else
            accountBalance -= amount;

    }

    public void depositFunds(int amount) {
        accountBalance += amount;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
