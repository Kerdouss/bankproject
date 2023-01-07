package com.myclass.bankproject;
public class PTEmployee extends Employee {
        
    private float hoursRate;

    public PTEmployee(int id, String name, String email,float hoursRate) {
        super(id, name, email);
        this.hoursRate = hoursRate;
    }
    public float getHoursRate() {
        return hoursRate;
    }
    public void setHoursRate(float hoursRate) {
        this.hoursRate = hoursRate;
    }
    @Override
    public String toString() {
        return "PTEmployee{" + " hoursRate = " + hoursRate + '}';
    }  
    
}
