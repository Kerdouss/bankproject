package com.myclass.bankproject;
public class SavingAccount extends Account{
    
    private double minBalance;

    public SavingAccount(int accountId, double accountBalance, String transactionType,double minBalance,AccountType accountType) {
        super (accountId,accountBalance,transactionType,accountType);
        this.minBalance = minBalance;
    }
    public double getMinBalance() {
        return minBalance;
    }
    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + " minBalance = " + minBalance + '}';
    }
    
}
