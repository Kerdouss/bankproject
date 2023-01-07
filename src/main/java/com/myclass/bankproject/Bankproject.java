package com.myclass.bankproject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class Bankproject {
    
    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("====== Welcome To Your Bank =====");
            System.out.println(" Menu : Select A Option ");
            System.out.println("1 : Add Bank");
            System.out.println("2 : Update Bank");
            System.out.println("3 : Add Employee");
            System.out.println("4 : Update Employee");
            System.out.println("5 : Add Customer");
            System.out.println("6 : Update Customer");
            System.out.println("7 : Add Account");
            System.out.println("8 : Update Account");
            System.out.println("9 Show Employees");
            System.out.println("10 Show Customers");
            System.out.println("11 Show Accounts");
            System.out.println("12 Serach By Employee ID");
            System.out.println("13 Search By Customer ID");
            System.out.println("14 To Exit The System");

            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Add Bank");
                    try {
                        FileWriter fw = new FileWriter("c:\\data\\bank.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        Bank bank = new Bank(1, "BANK", "Park Ave", "123456789");
                        bw.write(bank.toString());
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Update Bank");
                    break;
                case 3:
                    System.out.println("Add Employee");
                    try {
                        FileWriter fw = new FileWriter("c:\\data\\employee.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        //Adding 1 Full Time Employees  AND 1 Part Time Employee
                        Employee employee = new FTEmployee(1, "TIM", "tim@abc.com", 700.99f);
                        Employee employee1 = new PTEmployee(2, "JOE", "joe@abc.com", 25.90f);
                        bw.write(employee1.toString());
                        bw.newLine();
                        bw.write(employee.toString());
                        bw.newLine();
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println("Update Employee");
                    break;
                case 5:
                    System.out.println(" Add Customer");
                    try {
                        FileWriter fw = new FileWriter("c:\\data\\customer.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        // Adding Individual AND Business Customer without a account
                        Customer customer = new IndividualCustomer(3, "TOM", "tom@abc.com", "1-1-2000");
                        Customer customer1 = new BusinessCustomer(4, "Company", "company@abc.com", "100100100");
                        bw.write(customer.toString());                       
                        bw.newLine();
                        bw.write(customer1.toString());
                        

                        //Adding individual with checking account + Using Enum
                        CheckingAccount account = new CheckingAccount(10, 1000, "Deposit", 500, AccountType.CheckingAccount);
                        Customer customerwithaccount = new IndividualCustomer(5, "MATT", "matt@abc.com", "1-2-2001");
                        customerwithaccount.getAccounts().add(account);       // Adding account to arraylist         
                        bw.write(customerwithaccount.toString());
                        bw.newLine();
                        // Adding Customer with saving account
                        Customer customerwithsaving = new BusinessCustomer(10,"Company", "company@abc.com", "100100");
                        Account savingaccount = new SavingAccount(6, 10000, "Withdrawl", 500, AccountType.SavingAccount);
                        customerwithsaving.getAccounts().add(savingaccount); // Add saving account to arraylist
                        bw.write(customerwithsaving.toString());
                        bw.newLine();
                        
                        //Adding Customer with saving AND checking account
                        Customer mixaccount = new IndividualCustomer(7, "JACK", "jack@abc.com", "1-5-2000");
                        SavingAccount mixaccount1 = new SavingAccount(10, 1000, "Deposit", 100, AccountType.SavingAccount);
                        CheckingAccount mixaccount2 = new CheckingAccount(11, 90000, "Deposit", 200, AccountType.CheckingAccount);
                        mixaccount.getAccounts().add(mixaccount1);
                        mixaccount.getAccounts().add(mixaccount2);   
                        bw.write(mixaccount.toString());
                        bw.newLine();
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 6:
                    System.out.println("Update Customer");
                               
                    break;
                case 7:
                    System.out.println("Add Account");
                     try {
                        FileWriter fw = new FileWriter("c:\\data\\account.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        Account account = new SavingAccount(7, 5000, "Deposit",500, AccountType.SavingAccount);
                        bw.write(account.toString());
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Update Account");
                    break;
                case 9:
                    System.out.println("Show Employee");
                    break;
                case 10:
                    System.out.println("Show Customer");
                    break;
                case 11:
                    System.out.println("Show Account");
                    break;
                case 12:
                    System.out.println("Serach By Employee ID");
                    break;
                case 13:
                    System.out.println("Serach By Employee ID");
                    break;
                case 14:
                    System.out.println(" Exit ");
                    System.exit(0);
            }
        } while (option != 14);

    }
}
