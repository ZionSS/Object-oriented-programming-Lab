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
public class Rectangle extends GeometricObject{
    double lenght;
    double wide;

    public Rectangle() {
    }

    public Rectangle(double lenght, double wide) {
        this.lenght = lenght;
        this.wide = wide;
    }

    public Rectangle(double lenght, double wide, String color,String name, double area) {
        super(name,color, area);
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
    public String max(Rectangle c2)
    {
        if(this.getArea()>c2.getArea())
            return this.toString();
        else if(c2.getArea()>this.getArea())
            return c2.toString();
        return "EQUALS";
    }
      public boolean compareCheck(Rectangle c2)
    {
        int t;
        t=Double.compare(this.getArea(), c2.getArea());
        return !(t==-1||t==1);
    }
    @Override
    public String toString() {
        return  "[Rectangle] name ="+name+" widht = "+wide+" height = "+lenght+" color = "+color; 
    }
}
