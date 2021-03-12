/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Study07;

/**
 *
 * @author Ailas
 */
public class Circle extends Geometric{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()+"Circle{" + "radius=" + radius + '}';
    }
    
    
}
