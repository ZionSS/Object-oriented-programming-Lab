/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07_1;

import java.util.Date;

/**
 *
 * @author Ailas
 */
public class CheckingAccount extends Account{
    double overDraftLimit;
    double amount;
    public CheckingAccount() {
    }

    public CheckingAccount(String id, double balance, double annualInterestRate, Date dateCreated) {
        super(id, balance, annualInterestRate, dateCreated);
    }

    public CheckingAccount(double overDraftLimit, String id, double balance, double annualInterestRate, Date dateCreated) {
        super(id, balance, annualInterestRate, dateCreated);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    
    @Override
    public void withdraw(double amount)
    {
        this.amount=amount;
        
    }
    public void withdrawDo()
    {
        if(balance+overDraftLimit>=amount)
        balance=balance-amount;
        
    }
    public boolean canWithdraw()
    {
        
        return (balance+overDraftLimit)>=amount;
        
     
        
    }
    
}
