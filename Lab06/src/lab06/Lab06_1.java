/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Ailas
 */
import java.util.Scanner;
public class Lab06_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BMI p1 = new BMI("",0,0,0,0);
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        p1.setName(input.nextLine());
        System.out.print("Age: ");
        p1.setAge(input.nextInt());
        System.out.print("Weight (pounds):");
        p1.setWeight(input.nextDouble());
        System.out.print("Height (feet):");
        p1.setFeet(input.nextDouble());
        System.out.print("Height (inches):");
        p1.setInch(input.nextDouble());
        System.out.println("----------------------");
        System.out.println("         Data         ");
        System.out.println("Name : "+p1.getName());
        System.out.println("Age : "+p1.getAge());
        System.out.println("Weight : "+p1.getWeight());
        System.out.println("Height : "+p1.getHeight());
        System.out.println("BMI : "+p1.getBMI());
        System.out.println("Interpretation : "+p1.getInterpretation());
    }

}
