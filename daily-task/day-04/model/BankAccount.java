package model;

import java.util.Objects;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    private static int accountCount = 0;

    // Constructor 1
    public BankAccount() {
        this("UNKNOWN");
    }

    // Constructor 2
    public BankAccount(String accountHolderName) {
        this("ACC" + (accountCount + 1), accountHolderName, 0.0);
    }

    // Constructor 3
    public BankAccount(String accountNumber, String accountHolderName, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

        accountCount++;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be greater than zero.");
        }

        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance.");
        }

        // BUG intentionally planted for debugging practice.
        balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankAccount)) {
            return false;
        }

        BankAccount other = (BankAccount) obj;

        return Objects.equals(accountNumber, other.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}