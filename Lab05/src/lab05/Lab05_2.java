/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Ailas
 */
import java.util.Scanner;
public class Lab05_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.print("Number of side:");
        poly1.setN(input.nextInt());
        System.out.print("Lenght of each side:");
        poly1.setSide(input.nextDouble());
        System.out.print("X-Coordinate:");
        poly1.setX(input.nextDouble());
        System.out.print("Y-Coordinate:");
        poly1.setY(input.nextDouble());
        System.out.println("-------------Polygon 1--------------");
        poly1.getPerimeter();
        System.out.println("Polygon Area:"+poly1.getArea());
        System.out.println("-------------Polygon 2--------------");
        poly2.getPerimeter();
        System.out.println("Polygon Area:"+poly2.getArea());
        System.out.println("-------------Polygon 3--------------");
        poly3.getPerimeter();
        System.out.println("Polygon Area:"+poly3.getArea());
    }
    
}

class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    
    RegularPolygon()
    {

    }
    RegularPolygon(int newN,double newSide){
        n=newN;
        side=newSide;
        x=0;
        y=0;
    }
    RegularPolygon(int newN2,double newSide2,double newX,double newY){
        n=newN2;
        side=newSide2;
        x=newX;
        y=newY;
    }
    int getN()
    {
        return n;
    }
    double getSide()
    {
        return side;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    void setN(int n)
    {
        this.n=n;
    }
    void setSide(double side)
    {
        this.side=side;
    }
    void setX(double x)
    {
        this.x=x;
    }
    void setY(double y)
    {
        this.y=y;
    }
    void getPerimeter()
    {
        System.out.println("Number of side:"+this.n);
        System.out.println("Lenght of each side:"+this.side);
        System.out.println("X-Coordinate:"+this.x);
        System.out.println("Y-Coordinate:"+this.y);
    }
    double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }
}