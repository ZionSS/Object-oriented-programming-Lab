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
public class Triangle extends GeometricObject {
    double lenght1;
    double lenght2;
    double lenght3;

    public Triangle() {
    }

    
    public Triangle(double lenght1, double lenght2, double lenght3) {
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
        this.lenght3 = lenght3;
    }

    public Triangle(double lenght1, double lenght2, double lenght3, String color, String name, double area) {
        super(name,color,area);
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
        this.lenght3 = lenght3;
    }

    
    

   

    public double getLenght1() {
        return lenght1;
    }

    public void setLenght1(double lenght1) {
        this.lenght1 = lenght1;
    }

    public double getLenght2() {
        return lenght2;
    }

    public void setLenght2(double lenght2) {
        this.lenght2 = lenght2;
    }

    public double getLenght3() {
        return lenght3;
    }

    public void setLenght3(double lenght3) {
        this.lenght3 = lenght3;
    }
    
    public boolean triangleCheck(){
            return (lenght1+lenght2>lenght3&&lenght2+lenght3>lenght1&&lenght2+lenght3>lenght1);
    }
    public double getPerimeter(){
        return lenght1+lenght2+lenght3;
    }
     @Override
    public double getArea(){
        double S=(lenght1+lenght2+lenght3)/2;
        this.area=Math.sqrt(S*(S-lenght1)*(S-lenght2)*(S-lenght3));
        
        return this.area;
    }
    public String max(Triangle c2)
    {
        if(this.getArea()>c2.getArea())
            return this.toString();
        else if(c2.getArea()>this.getArea())
            return c2.toString();
        return "EQUALS";
    }
    public boolean compareCheck(Triangle c2)
    {
        int t;
        t=Double.compare(this.getArea(), c2.getArea());
        return !(t==-1||t==1);
    }
    @Override
    public String toString() {
        return  "[Triangle] name ="+name+" lenght1 = "+lenght1+" lenght2 = "+lenght2+" lenght3 = "+lenght3+" color = "+color; 
    }
}
