package javapackage;
import java.util.Scanner;

	// Class to represent the Bank Account
	class Bank_Account{
	    private double balance;

	    // Constructor to initialize account balance
	    public Bank_Account(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0;
	        }
	    }

	    // Method to deposit money into the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method to withdraw money from the account
	    public boolean withdraw(double amount) {
	        if (amount <= balance && amount > 0) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	            return true;
	        } else if (amount > balance) {
	            System.out.println("Insufficient funds.");
	            return false;
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	            return false;
	        }
	    }

	    // Method to check the account balance
	    public void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }
	}

	// Class to represent the ATM machine
	class ATM {
	    private BankAccount account;
	    private Scanner scanner;

	    // Constructor to initialize ATM with a bank account
	    public ATM(BankAccount account) {
	        this.account = account;
	        this.scanner = new Scanner(System.in);
	    }

	    // Method to display the ATM menu
	    public void displayMenu() {
	        int option = 0;
	        while (option != 4) {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    depositMoney();
	                    break;
	                case 2:
	                    withdrawMoney();
	                    break;
	                case 3:
	                    checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }

	    // Method for depositing money
	    private void depositMoney() {
	        System.out.print("Enter amount to deposit: ");
	        double amount = scanner.nextDouble();
	        account.deposit(amount);
	    }

	    // Method for withdrawing money
	    private void withdrawMoney() {
	        System.out.print("Enter amount to withdraw: ");
	        double amount = scanner.nextDouble();
	        account.withdraw(amount);
	    }

	    // Method to check account balance
	    private void checkBalance() {
	        account.checkBalance();
	    }
	}

	public class BankAccount1 {
	    public static void main(String[] args) {
	        // Create a bank account with an initial balance
	        BankAccount userAccount = new BankAccount(5000.00); // Initial balance: $5000

	        // Create an ATM object with the user's bank account
	        ATM atm = new ATM(userAccount);

	        // Display ATM menu for the user
	        atm.displayMenu();
	    }
	}


