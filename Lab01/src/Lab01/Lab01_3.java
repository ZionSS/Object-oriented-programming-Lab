/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_3;
import java.util.Scanner;
/**
 *
 * @author HP O M E N
 */
public class Lab01_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,digit;
        Scanner numInput=new Scanner(System.in);
        num = numInput.nextInt();
        if(num<=0||num>=1000)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            digit = num%10 + (num/10)%10 + (num/100)%10;
             System.out.println(digit);
        }
        
    }
    
}
