/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Scanner;

/**
 *
 * @author Ailas
 */
public class Lab02_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int amount,num;
       Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of lines: ");
        amount=input.nextInt();
        num=amount;
        for(int i=0;i<amount;i++)
        {
           for(int k=i;k<amount;k++)
            {
                System.out.print("   ");
            }
           for(int k=i+1;k>=1;k--)
            {
                if(k<10)
                System.out.printf(" %d ",k);
                else if(k>=10)
                System.out.printf("%d ",k);
            }
           for(int k=2;k<=i+1;k++)
            {
                 if(k<10)
                System.out.printf(" %d ",k);
                else if(k>=10)
                System.out.printf("%d ",k);
            }
            System.out.println("");
        }
    
        
    }
    
}
