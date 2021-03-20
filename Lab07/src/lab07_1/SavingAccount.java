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
public class SavingAccount extends Account{

    public SavingAccount() {
    }

    public SavingAccount(String id, double balance, double annualInterestRate, Date dateCreated) {
        super(id, balance, annualInterestRate, dateCreated);
    }
    
}
