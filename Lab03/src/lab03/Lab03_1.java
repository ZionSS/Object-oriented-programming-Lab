/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Ailas
 */

public class Lab03_1 {

    /**
     * @param args the command line arguments
     */
    static boolean palindromeCheck(int number)
    {
        int n,digit,rev=0;
        n=number;
        do{
           digit = number % 10;
         rev = (rev * 10) + digit;
         number = number / 10;
        }while(number!=0);
        if(n==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
      int num = 2;
      int numCount = 1;
      boolean flag=false;
      while(numCount<=100)
      {
          for(int i = 2;i<=num/2;++i)
         {
          if(num%i==0)
          {
             flag=true;
             break;
          }
          else
          {
              flag=false;
          }
         }
        if(!flag)
         {
             if(palindromeCheck(num))
             {
                System.out.print(num+" ");
                if(numCount%10==0)
                 System.out.println("");
                numCount++;
             }
         }
        num++;
      }
      
    }
    
}
