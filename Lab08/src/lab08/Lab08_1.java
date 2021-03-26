/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Ailas
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Lab08_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Triangle t = new Triangle();
        
        System.out.print("Point of 1st Coordinate triangle: ");
        double[] p1={input.nextDouble(),input.nextDouble()};
        t.setP1(p1);
        input.nextLine();
         System.out.print("Point of 2nd Coordinate triangle: ");
        double[] p2={input.nextDouble(),input.nextDouble()};
        t.setP2(p2);
        input.nextLine();
         System.out.print("Point of 3rd Coordinate triangle: ");
        double[] p3={input.nextDouble(),input.nextDouble()};
        t.setP3(p3);
        input.nextLine();
        t.coordinateToLenght();
        if(t.triangleCheck())
        {
            System.out.print("Color of Triangle: ");
        t.setColor(input.nextLine());
        System.out.print("Triangle area is filled[true or false]: ");
        t.setAreaFilled(input.nextBoolean());
        
        System.out.println("Area of this triangle: "+t.getArea());
        System.out.println("Perimeter of this triangle: "+t.getPerimeter());
            System.out.println("Color of this triangle: "+t.getColor());
            System.out.println("Area of this triangle is filled: "+t.isAreaFilled());
        }
        else{
            System.out.println("Invalid lenght of triangle ((Can't create triangle))");
        }
        
        
        
        
        
        
    }
    
}
