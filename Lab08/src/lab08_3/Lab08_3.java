/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_3;

/**
 *
 * @author Ailas
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Lab08_3 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
      ComparableCircle c1 = new ComparableCircle();
      ComparableCircle c2 = new ComparableCircle();
      ComparableRectangle r1 = new ComparableRectangle();
      ComparableRectangle r2 = new ComparableRectangle();
      ComparableTriangle t1 = new ComparableTriangle();
      ComparableTriangle t2 = new ComparableTriangle();
      int choice;
      ArrayList<Circle> cA =new ArrayList<Circle>();  
      
      Scanner input = new Scanner(System.in);
      do{
        System.out.println("--------------------------------------\n" +"Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit) ");
        System.out.print("Your choice: ");
        choice=input.nextInt();
        input.nextLine();
        
        switch(choice){
            case 1 :    System.out.print("Circle c1 (name radius color) :");
                        c1.setName(input.next());
                        c1.setRadius(input.nextDouble());
                        c1.setColor(input.next());
                        System.out.print("Circle c2 (name radius color) :");
                        c2.setName(input.next());
                        c2.setRadius(input.nextDouble());
                        c2.setColor(input.next());
                        
                        System.out.print("Equal Circles, if their radii are the same :");
                        if(c1.compareTo(c2)==1||c1.compareTo(c2)==-1)
                            System.out.println("false");
                        else
                            System.out.println("true");
                        System.out.println("The larger object using max method :"+c1.max(c2));
                        System.out.println("--------------------------------------\n");
                        break;
            case 2 :    System.out.print("Rectangle r1 (name widht height color) :");
                        r1.setName(input.next());
                        r1.setWide(input.nextDouble());
                        r1.setLenght(input.nextDouble());
                        r1.setColor(input.next());
                        System.out.print("Rectangle r2 (name widht height color) :");
                        r2.setName(input.next());
                        r2.setWide(input.nextDouble());
                        r2.setLenght(input.nextDouble());
                        r2.setColor(input.next());
                        
                        System.out.println("Equal Rectangle, if their areas are the same :");
                        System.out.print("Equal Circles, if their radii are the same :");
                        if(r1.compareTo(r2)==1||r1.compareTo(r2)==-1)
                            System.out.println("false");
                        else
                            System.out.println("true");
                        System.out.println("The larger object using max method :"+r1.max(r2));
                        System.out.println("--------------------------------------\n");
                        break;
            case 3 :    System.out.print("Triangle t1 (name lenght1 lenght2 lenght3 color) :");
                        t1.setName(input.next());
                        t1.setLenght1(input.nextDouble());
                        t1.setLenght2(input.nextDouble());
                        t1.setLenght3(input.nextDouble());
                        t1.setColor(input.next());
                        System.out.print("Triangle t2 (name lenght1 lenght2 lenght3 color) :");
                        t2.setName(input.next());
                        t2.setLenght1(input.nextDouble());
                        t2.setLenght2(input.nextDouble());
                        t2.setLenght3(input.nextDouble());
                        t2.setColor(input.next());
                        
                        System.out.println("Equal Rectangle, if their areas are the same :");
                        System.out.print("Equal Circles, if their radii are the same :");
                        if(t1.compareTo(t2)==1||t1.compareTo(t2)==-1)
                            System.out.println("false");
                        else
                            System.out.println("true");
                        System.out.println("The larger object using max method :"+t1.max(t2));
                        System.out.println("--------------------------------------\n");
                        break;
            case 4 :    System.out.println("End of program.");
                        System.exit(0);
                        break;
                default: System.out.println("Invalid Choice [Please input 1-4]");
        }

        System.out.println();
    }while(true);
      
    }
    
}
