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
public class lab07_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account_01= new Account("George", 112, 1109, 1.65);
        System.out.println(account_01.toString());
        account_01.deposit(30);
        account_01.deposit(40);
        account_01.deposit(50);
        account_01.withdraw(5);
        account_01.withdraw(4);
        account_01.withdraw(2);

        
        account_01.transactionToString();

        
    }

}