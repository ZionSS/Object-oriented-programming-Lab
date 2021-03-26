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
public class Rectangle extends GeometricObject{
    double lenght;
    double wide;

    public Rectangle() {
    }

    public Rectangle(double lenght, double wide) {
        this.lenght = lenght;
        this.wide = wide;
    }

    public Rectangle(double lenght, double wide, String color, boolean areaFilled, double area) {
        super(color, areaFilled, area);
        this.lenght = lenght;
        this.wide = wide;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
    
     public double getPerimeter(){
        return lenght*2+wide*2;
    }
      @Override
    public double getArea(){
        
        this.area= lenght*wide;
        
        return this.area;
    }
}
