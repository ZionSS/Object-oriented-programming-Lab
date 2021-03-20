/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07_1;

/**
 *
 * @author Ailas
 */
import java.util.Date;
public class Account {
    String id;
    double balance;
    double annualInterestRate;
    Date dateCreated;

    public Account() {
    }

    public Account(String id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public void deposit(double amount)
    {
        this.balance = this.balance+amount;
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        this.balance = this.balance-amount;
        
    }
    
}
