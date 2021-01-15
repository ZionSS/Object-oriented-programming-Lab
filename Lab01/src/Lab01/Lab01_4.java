/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_4;
import java.util.Scanner;
/**
 *
 * @author HP O M E N
 */
public class Lab01_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner valInput = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightKg = valInput.nextFloat()*0.45359237;
        System.out.print("Enter height in inches: ");
        double heightCen = valInput.nextFloat()*0.0254;
        double bmi = weightKg/(heightCen*heightCen);
        System.out.printf("BMI is %.4f",bmi);
    }
    
}
