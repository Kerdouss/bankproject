package com.myclass.bankproject;
public class FTEmployee extends Employee {
    
    private float salary;

    public FTEmployee(int id, String name, String email,float salary) {
        super(id, name, email);
        this.salary = salary;

    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;   
    }

    @Override
    public String toString() {
        return "FTEmployee{" + " salary = " + salary + " name = " + this.name +'}';
    }
   
    }


