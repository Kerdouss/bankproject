package com.myclass.bankproject;

import java.util.ArrayList;
public class Customer {
    
   private int id;
   private  String name;
   private  String email;
   private ArrayList<Account>accounts;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        accounts = new ArrayList<Account>();
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Customer{" + " id = " + id + ", name = " + name + ", email = " + email + '}';
    }
    
    
}
