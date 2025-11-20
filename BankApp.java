package task_5;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a sample bank account
        BankAccount account = new BankAccount("Siddhi", "ACC12345", 5000.0);

        while (true) {
            System.out.println("\n===== Bank Account Simulation =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
