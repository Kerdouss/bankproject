package com.myclass.bankproject;
public class CheckingAccount extends Account{
    
    private double maxWithdrawl;

    public CheckingAccount(int accountId, double accountBalance, String transactionType,double maxWithdrawl,AccountType accountType) {
        super(accountId,accountBalance,transactionType,accountType);
        this.maxWithdrawl = maxWithdrawl;
    }

    public double getMaxWithdrawl() {
        return maxWithdrawl;
    }

    public void setMaxWithdrawl(double maxWithdrawl) {
        this.maxWithdrawl = maxWithdrawl;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + " maxWithdrawl= " + maxWithdrawl + '}';
    }
    
}
