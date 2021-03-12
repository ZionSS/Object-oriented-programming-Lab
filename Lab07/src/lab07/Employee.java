/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Date;

/**
 *
 * @author Ailas
 */
public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired() {
        this.dateHired = new Date();
        this.dateHired.getTime();
        
    }

    public Employee() {
    }

    public Employee(String office, double salary, Date dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String office, double salary, Date dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }
    
    
}
