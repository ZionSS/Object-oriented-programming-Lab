/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study08;

/**
 *
 * @author Ailas
 */
public class Geometric {
    private String name;

    public String getName() {
        return name;
    }
    
}
class Circle extends Geometric{
    private double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
class Rect extends Geometric{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
}