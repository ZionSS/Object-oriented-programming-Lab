/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07_2;
/**
 *
 * @author Ailas
 */
import java.util.ArrayList;
import java.util.Date;

public class Account {
    
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;

    public Account() {
        
    }

   

    public Account(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getDateCreate() {
        return dateCreate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public String getClassName() {
        return getClass().getSimpleName() + " id:" + id;
    }

    private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

    public void withdraw(double withdraw) {
        if (withdraw <= 0) {
            System.out.println(getClassName() + " Error :: withdraw is not a negative number");
        } else if (withdraw > balance) {
            System.out.println(getClassName() + " Error :: withdraw is much than balance");
        } else {
            balance -= withdraw;
            transactionList.add(new Transaction('W', withdraw, balance, ""));
        }

    }

    public void deposit(double deposit) {
        if (deposit <= 0) {
            System.out.println(getClassName() + " Error :: deposit is not a negative number");
        } else {
            balance += deposit;
            transactionList.add(new Transaction('D', deposit, balance, ""));
        }
    }

    @Override
    public String toString() {
        return "name : "+name+"\nAccount ID : " + id + "\nDate Created : " + dateCreate +"\nBalance : "+ String.format("%.2f", balance)+"\nAnnual Interest Rate : $"+ String.format("%.2f", getAnnualInterestRate());
    }

    public void transactionToString(){
        System.out.println("Date\t\t\t\t\tType\t\tAmount\t\tBalance");
        transactionList.forEach(tsn -> {
            System.out.println(tsn.getDataCreated() +"\t\t"+tsn.getType()+"\t\t"+tsn.getAmount()+"\t\t"+tsn.getBalance()+"\t\t"+tsn.getDescription());
        });
    }

}