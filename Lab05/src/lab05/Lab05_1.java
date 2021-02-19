/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Ailas
 */
import java.util.Date;
import java.util.Scanner;
public class Lab05_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amountToWithdraw;
        double amountToDeposit;
        Scanner input = new Scanner(System.in);
        Account account1 = new Account(1122,20000.0);
        account1.setAnnualInterestRate(4.5);
        System.out.println("ID Account: "+account1.getId());
        System.out.println("Balance: "+account1.getBalance());
        System.out.println("Annual Interest Rate: "+account1.getAnnualInterestRate()+"%");
        System.out.print("Withdraw: ");
        amountToWithdraw=input.nextDouble();
        System.out.println("Total Balance:"+account1.withdraw(amountToWithdraw));
        account1.setBalance(account1.withdraw(amountToWithdraw));
        System.out.print("Deposit: ");
        amountToDeposit=input.nextDouble();
        System.out.println("Total Balance:"+account1.deposit(amountToDeposit));
        account1.setBalance(account1.deposit(amountToDeposit));
        System.out.println("Monthly interest: "+account1.getMonthlyInterest());
        System.out.println("Date:"+account1.dateCreated.toString());
        
        
        
    }
    
}

class Account{
        private int id;
        private double balance;
        private double annualInterestRate=0.0;
        Date  dateCreated = new Date();
        
        Account(int newId,double newBalance){
            id=newId;
            balance=newBalance;
        }
        Account(){
            id = 0;
            balance =0;
            annualInterestRate = 0;
        }
        
         int getId()
        {
            return id;
        }
         void setId(int id)
         {
             this.id = id;
         }
         double getBalance()
        {
            return balance;
        }
         void setBalance(double balance)
         {
             this.balance = balance;
         }
         double getAnnualInterestRate()
        {
            return annualInterestRate;
        }
         void setAnnualInterestRate(double annualInterestRate)
         {
             this.annualInterestRate=annualInterestRate;
         }
         public double getMonthlyInterestRate(){
             return (annualInterestRate/100)/12.0;
         }
        public double getMonthlyInterest(){
            return balance*((annualInterestRate/100)/12.0);
        }
        public double withdraw(double amount)
        {
            double rebalance;
            if(amount < 0)
            {
                System.out.println("Invalid data ");
                return balance;
            }
            if(amount>balance)
            {
                System.out.println("Not enough balance.");
                return balance;
            }
            if(balance>amount&&amount>=0)
            {
               rebalance=balance - amount;
               this.balance = rebalance;
             return rebalance; 
            } 
            return 0;
        }
        public double deposit(double amount)
        {
            double rebalance;
            if(amount < 0)
            {
                System.out.println("Invalid data");
                return balance;
            }
               if(amount>=0)
            {
               rebalance=balance + amount;
               this.balance = rebalance;
             return rebalance; 
            } 
            return 0;
           
        }
}