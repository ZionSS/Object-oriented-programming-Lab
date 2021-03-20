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
import java.util.Scanner;
public class Lab07_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        if(input.nextLine().equals("Checkings"))
        {
            CheckingAccount c1 = new CheckingAccount();
            System.out.print("Overdraft Limit: ");
            c1.setOverDraftLimit(input.nextDouble());
            c1.setDateCreated(new Date());
            System.out.print("Balance is ");
            c1.setBalance(input.nextDouble());
            System.out.print("Withdraw: ");
            c1.withdraw(input.nextDouble());
            if(c1.canWithdraw()){
                c1.withdrawDo();
            System.out.println("Balance is "+c1.getBalance());
            System.out.println("This account was created at "+c1.getDateCreated());
            }
            else{
                System.out.println("Invalid amount to withdraw");
            }
        }
        else if(input.nextLine().equals("Savings"))
        {
            SavingAccount s1 = new SavingAccount();
            s1.setDateCreated(new Date());
            System.out.print("Balance is ");
            s1.setBalance(input.nextDouble());
            System.out.print("Withdraw: ");
            s1.withdraw(input.nextDouble());
            System.out.println("Balance is "+s1.getBalance());
            System.out.println("This account was created at "+s1.getDateCreated());
        }
        
           
    }
    
}
