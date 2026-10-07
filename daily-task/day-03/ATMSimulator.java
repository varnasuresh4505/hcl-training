import java.util.Scanner;
public class ATMSimulator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        final int correct_pin = 1234;
        int balance = 5000;
        final int max_attempts = 3;
        int attempts = 0;
        boolean authenticated = false;
        System.out.println("---ATM Simulator---");
        while (attempts < max_attempts) 
        {
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();
            attempts++;
            if (pin == correct_pin) 
            {
                authenticated = true;
                System.out.println("PIN verified successfully.");
                break;
            } 
            else 
            {
                System.out.println("Invalid PIN.");
                if (attempts < max_attempts) 
                {
                    System.out.println("Please try again.");
                    continue;
                }
            }
        }
        if (!authenticated) 
        {
            System.out.println("Maximum attempts reached.");
            sc.close();
            return;
        }
        int choice;
        do 
        {
            System.out.println();
            System.out.println("---ATM MENU---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Balance: Rs. " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposite_amount = sc.nextInt();
                    balance += deposite_amount;
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawal_amount = sc.nextInt();
                    if (withdrawal_amount <= balance) 
                    {
                        balance -= withdrawal_amount;
                        System.out.println("Withdrawal successful.");
                    } 
                    else
                    {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid menu choice.");
                    continue;
            }

        } while (choice != 4);
    }
}