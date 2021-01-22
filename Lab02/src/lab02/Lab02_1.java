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
public class Lab02_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int presentDay,futureDay,nextDay;
        Scanner dayInput = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        presentDay = dayInput.nextInt();
        if(presentDay<0)
        {
            System.out.println("Invalid Data");
            return;
        }
        if(presentDay>6)
        {
            while(presentDay>=7)
             {
                 presentDay-=7;
             }
        }
        System.out.print("Enter the number of days elapsed since today: ");
        nextDay = dayInput.nextInt();
        if(nextDay<0)
        {
            System.out.println("Invalid Data");
            return;
        }
         if(presentDay + nextDay<7)
         {
             futureDay=presentDay + nextDay;
         }
          else
         {
             futureDay=presentDay + nextDay;
             while(futureDay>=7)
             {
                 futureDay-=7;
             }
         }
         System.out.print("Today is ");
         switch(presentDay)
         {
             case 0: System.out.print("Sunday"); break;
             case 1: System.out.print("Monday"); break;
             case 2: System.out.print("Tuesday"); break;
             case 3: System.out.print("Wednesday"); break;
             case 4: System.out.print("Thursday"); break;
             case 5: System.out.print("Friday"); break;
             case 6: System.out.print("Saturday"); break;
         }
         System.out.print(" and the future day is ");
         switch(futureDay)
         {
             case 0: System.out.println("Sunday"); break;
             case 1: System.out.println("Monday"); break;
             case 2: System.out.println("Tuesday"); break;
             case 3: System.out.println("Wednesday"); break;
             case 4: System.out.println("Thursday"); break;
             case 5: System.out.println("Friday"); break;
             case 6: System.out.println("Saturday"); break;
         }
    }
    
}
