package com.BMS.loan;

public class Loan {

    private final double loanAmount;
    private final double interestRate;
    private final int tenure;

    public Loan(double loanAmount, double interestRate, int tenure) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    public double calculateEMI() {

        double emi = (loanAmount * interestRate * tenure) / 100;

        System.out.println("EMI: " + emi);

        return emi;
    }

}