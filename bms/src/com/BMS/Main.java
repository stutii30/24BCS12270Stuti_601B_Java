package com.BMS;

import com.BMS.Accounts.SavingsAccount;
import com.BMS.customers.Customer;
import com.BMS.loan.Loan;
import com.BMS.exceptions.InsufficientBalanceException;

import static com.BMS.util.Util.generateAccountNumber;
import static com.BMS.util.Util.validateMinimumBalance;

public class Main {

    public static void main(String[] args) {

        try {

            Customer customer = new Customer(1, "Stuti");

            int accNumber = generateAccountNumber();

            SavingsAccount account = new SavingsAccount(accNumber, 5000, 5);

            validateMinimumBalance(account.getBalance());

            customer.linkAccount(account);

            account.deposit(2000);

            account.withdraw(1500);

            account.calculateInterest();

            Loan loan = new Loan(100000, 5, 2);
            loan.calculateEMI();

            customer.displayCustomerDetails();

        }

        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

}