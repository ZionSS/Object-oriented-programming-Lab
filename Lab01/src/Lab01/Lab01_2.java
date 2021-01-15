/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01_2;
import java.util.Scanner;
/**
 *
 * @author HP O M E N
 */
public class Lab01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=3.4,b=50.2,c=2.1,d=0.55,e=44.5,f=5.9;
        double x =((e*d)-(b*f))/((a*d)-(b*c));
        double y =((a*d)-(b*c))/((e*d)-(b*f));
        
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    
}
