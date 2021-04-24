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
public class ComparableCircle extends Circle implements Comparable<Circle> {
    
    
    @Override
    public int compareTo(Circle t) {
       return Double.compare(this.area, t.getArea());
    }
    
    
}
