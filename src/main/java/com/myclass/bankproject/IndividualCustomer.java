package com.myclass.bankproject;
public class IndividualCustomer extends Customer {
    
    private String birthDate;

    public IndividualCustomer (int id, String name, String email,String birthDate) {
        super(id, name, email);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
       this.birthDate = birthDate;
    }
    @Override
    public String toString() {
    
        return "IndividualCustomer{ id = " + getId() +"  name = " + getName() + " email = " + getEmail() + " birthDate ="  + birthDate + '}';
        
    }
    
    
}
