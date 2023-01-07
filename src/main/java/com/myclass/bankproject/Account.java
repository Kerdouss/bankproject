package com.myclass.bankproject;
public class Account {
    
   private int accountId;
   private double accountBalance;
   private String transactionType;
   private AccountType accountType;
   
    public Account(int accountId, double accountBalance, String transactionType, AccountType accountType) {
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.transactionType = transactionType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" + " accountId = " + accountId + ", accountBalance = " + accountBalance + ", transactionType = " + transactionType + '}';
    } 
    
    
}
