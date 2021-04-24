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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 
public abstract class GeometricObject {
    String color;
    String name;
    double area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeometricObject() {
    }

    public GeometricObject(String name, String color, double area) {
        this.name=name;
        this.color = color;
        this.area = area;
    }

    public abstract double getArea(); 

    public void setArea(double area) {
        this.area = area;
    }

   
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

}
