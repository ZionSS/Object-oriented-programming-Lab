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
public class Circle extends GeometricObject{
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String name, String color,  double area) {
        super(name,color,area);
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
     public String max(Circle c2)
    {
        if(this.getArea()>c2.getArea())
            return this.toString();
        else if(c2.getArea()>this.getArea())
            return c2.toString();
        return "EQUALS";
    }
     @Override
    public double getArea(){
       
        this.area=Math.PI*radius*radius;
        
        return this.area;
    }
    public boolean compareCheck(Circle c2)
    {
        int t;
        t=Double.compare(this.getArea(), c2.getArea());
        return !(t==-1||t==1);
    }
    @Override
    public String toString() {
        return  "[Circle] name ="+name+" radius = "+radius+" color = "+color; 
    }
    
}
