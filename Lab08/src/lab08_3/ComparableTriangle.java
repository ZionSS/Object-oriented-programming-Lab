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
public class ComparableTriangle extends Triangle implements Comparable<Triangle>{

    @Override
    public int compareTo(Triangle t) {
        return Double.compare(area, t.getArea());
    }
    
}
