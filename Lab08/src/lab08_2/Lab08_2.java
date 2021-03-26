/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_2;

/**
 *
 * @author Ailas
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Lab08_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        
        Triangle t = new Triangle();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        GeometricObject[] g = {t,r1,r2,c1,c2 };
        System.out.print("All lenght of 3 triangle side: ");
        t.setLenght1(input.nextDouble());
        t.setLenght2(input.nextDouble());
        t.setLenght3(input.nextDouble());
       if(!t.triangleCheck())
       {
           System.out.println("Invalid lenght of triangle ((Can't create triangle))");
           System.exit(0);
       }
           
        
        System.out.print("Radius lenght of 1st Cricle: ");
        c1.setRadius(input.nextDouble());
        System.out.print("Radius lenght of 2nd Cricle: ");
        c2.setRadius(input.nextDouble());
        if(c1.getRadius()<0||c2.getRadius()<0)
        {
           System.out.println("Invalid radius of circle((Can't create Circle))");
           System.exit(0);
        }
        System.out.print("Wide and lenght of 1st Rectangle: ");
        r1.setWide(input.nextDouble());
        r1.setLenght(input.nextDouble());
        System.out.print("Wide and lenght of 2nd Rectangle: ");
        r2.setWide(input.nextDouble());
        r2.setLenght(input.nextDouble());
        if(r1.getLenght()<0||r1.getWide()<0)
        {
           System.out.println("Invalid lenght and wide of 1st rectangle((Can't create 1st Rectangle))");
           System.exit(0);
        }
        if(r2.getLenght()<0||r2.getWide()<0)
        {
           System.out.println("Invalid lenght and wide of 2nd rectangle((Can't create 2nd Rectangle))");
           System.exit(0);
        }
        System.out.println("Areas of all the geometric objects: "+sumArea(g));
    }
    public static double sumArea(GeometricObject[] a){
        double area=0;
        for(int i =0;i<a.length;i++)
        {
            area+=a[i].getArea();
        }
        return area;
        /*ArrayList<GeometricObject> b = new ArrayList<GeometricObject>();
       Collections.addAll(b, a);
       for(int i =0;i<a.length;i++)
       {
           b.add(a[i]);
       }
      double area=0;
       for(int i =0;i<a.length;i++)
       {
           area+=b.get(i).getArea();
       }
       return area;
       */
    }
}
