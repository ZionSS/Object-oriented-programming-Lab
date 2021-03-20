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
public class TestGeeometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circle c = new Circle();
       Rect r = new Rect();
        System.out.println(displayInfo(c));
    }
    static double displayInfo(Geometric g){
        if(g instanceof Circle)
        {
            return ((Circle)g).getRadius();
        }
        else if (g instanceof Rect)
        {
            
            return ((Rect)g).getWidth();
        }
        return 0;
    }
}
