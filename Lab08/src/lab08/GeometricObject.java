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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public abstract class GeometricObject {
    String color;
    boolean areaFilled;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean areaFilled) {
        this.color = color;
        this.areaFilled = areaFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAreaFilled() {
        return areaFilled;
    }

    public void setAreaFilled(boolean areaFilled) {
        this.areaFilled = areaFilled;
    }

}
