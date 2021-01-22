/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Ailas
 */
public class Lab02_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cities[] = new String[3];
        String order[] = {"first","second","third"};
        Scanner name = new Scanner(System.in);
        for(int i =0;i<=2;i++)
        {
            System.out.printf("Enter the %s city: ",order[i]);
            cities[i] =  name.nextLine();
        }
        Arrays.sort(cities);
        System.out.print("The three cities in alphabetical order are ");
        for(String i:cities)
        {
            System.out.print(i+" ");
        }
    }
    
}
