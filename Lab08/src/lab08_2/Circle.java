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
public class Circle extends GeometricObject{
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean areaFilled, double area) {
        super(color, areaFilled, area);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
     public double getPerimeter(){
        return Math.PI*2*radius;
    }
     @Override
    public double getArea(){
       
        this.area=Math.PI*radius*radius;
        
        return this.area;
    }
}
