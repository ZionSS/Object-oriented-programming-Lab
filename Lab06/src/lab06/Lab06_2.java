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
import java.util.List;
public class Lab06_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Course OOP = new Course("OOP");
     System.out.print("Student Name:");
     OOP.setStudent(input.nextLine());
     System.out.print("Student Name:");
     OOP.setStudent(input.nextLine());
     System.out.print("Student Name:");
     OOP.setStudent(input.nextLine());
     System.out.println("Amount of student in this course : "+OOP.getAmountOfStudent());
     System.out.print("Drop||Student Name:");
     OOP.dropStudent(input.nextLine());
     System.out.println("Amount of student in this course : "+OOP.getAmountOfStudent());
     OOP.getStudent();
     System.out.println("Clear all student in this course");
     OOP.clear();
     System.out.println("Amount of student in this course : "+OOP.getAmountOfStudent());
    }
    
}
