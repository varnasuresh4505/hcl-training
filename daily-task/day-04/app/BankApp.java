
package app;

import model.BankAccount;
import service.BankAccountService;

public class BankApp {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("ACC101", "Varna", 5000);

        BankAccount account2 =
                new BankAccount("ACC102", "Priya", 3000);

        BankAccountService service =
                new BankAccountService();

        System.out.println("===== BANK ACCOUNT APPLICATION =====");

        System.out.println();

        service.displayAccount(account1);

        System.out.println();

        System.out.println("Depositing Rs. 1000...");
        service.deposit(account1, 1000);

        service.displayAccount(account1);

        System.out.println();

        System.out.println("Withdrawing Rs. 500...");
        service.withdraw(account1, 500);

        service.displayAccount(account1);

        System.out.println();

        System.out.println("Total Accounts Created: "
                + BankAccount.getAccountCount());

        System.out.println();

        System.out.println("Account 1:");
        System.out.println(account1);

        System.out.println();

        System.out.println("Account 2:");
        System.out.println(account2);
    }
}