package com.myclass.bankproject;
public class BusinessCustomer extends Customer{
    
    private String fax;

    public BusinessCustomer (int id, String name, String email,String fax) {
        super(id,name,email);
        this.fax = fax;
    }
    
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "BusinessCustomer{ id=" + getId() +" name =" + getName() + " email = "  + getEmail()  +  " fax = " +  fax + '}';
    }
    
}
