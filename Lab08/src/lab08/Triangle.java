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
public class Triangle extends GeometricObject {
    double[] p1;//0=x 1=y
    double[] p2;
    double[] p3;
    double lenght1;
    double lenght2;
    double lenght3;
    public Triangle() {
    }

    public Triangle(double[] p1, double[] p2, double[] p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle(double[] p1, double[] p2, double[] p3, String color, boolean areaFilled) {
        super(color, areaFilled);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double[] getP1() {
        return p1;
    }

    public void setP1(double[] p1) {
        this.p1 = p1;
    }

    public double[] getP2() {
        return p2;
    }

    public void setP2(double[] p2) {
        this.p2 = p2;
    }

    public double[] getP3() {
        return p3;
    }

    public void setP3(double[] p3) {
        this.p3 = p3;
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
    
    public void coordinateToLenght(){
        this.lenght1=Math.sqrt(Math.pow((p1[0]-p2[0]),2)+Math.pow((p1[1]-p2[1]),2));
        this.lenght2=Math.sqrt(Math.pow((p2[0]-p3[0]),2)+Math.pow((p2[1]-p3[1]),2));
        this.lenght3=Math.sqrt(Math.pow((p3[0]-p1[0]),2)+Math.pow((p3[1]-p1[1]),2));
    }
    


    
    
    public boolean triangleCheck(){
            return (lenght1+lenght2>lenght3&&lenght2+lenght3>lenght1&&lenght2+lenght3>lenght1);
    }
    public double getPerimeter(){
        return lenght1+lenght2+lenght3;
    }
    public double getArea(){
        double S=(lenght1+lenght2+lenght3)/2;
        double area;
        area=Math.sqrt(S*(S-lenght1)*(S-lenght2)*(S-lenght3));
        return area;
    }
}
