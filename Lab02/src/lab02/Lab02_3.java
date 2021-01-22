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
public class Lab02_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h,q,m,j,k,y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        y=input.nextInt();
        System.out.print("Enter month: 1-12: ");
        m=input.nextInt();
        if(m<0||m>12)
        {
            System.out.println("Invalid Data");
            return;
        }
        System.out.print("Enter the day of the month: 1-31: ");
        q=input.nextInt();
        if(q<0||q>31)
        {
            System.out.println("Invalid Data");
            return;
        }
        if(m==1||m==2)
        {
            m+=12;
            y-=1;
        }
        j=y/100;
        k=y%100; 
        h=(q+(26*(m+1)/10)+k+(k/4)+(j/4)+5*j)%7;
        System.out.print("Day of the week is ");
        switch(h)
        {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Tursday"); break;
            case 6: System.out.println("Friday"); break;
        }
        
    }
    
}
