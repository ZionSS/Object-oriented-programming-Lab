/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_1;

/**
 *
 * @author HP O M E N
 */
public class Lab01_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double population = 312032486;
        double timeCalculation = 365*24*60*60;
        double bornRate = timeCalculation/7.0;
        double deathRate = timeCalculation/13.0;
        double immigrantRate = timeCalculation/45.0;
        double newPopulation = population;
        newPopulation += bornRate-deathRate+immigrantRate; 
        System.out.printf("Year 1 = %.0f%n",newPopulation );
        newPopulation += bornRate*2-deathRate*2+immigrantRate*2; 
        System.out.printf("Year 2 = %.0f%n",newPopulation );
        newPopulation += bornRate*3-deathRate*3+immigrantRate*3; 
        System.out.printf("Year 3 = %.0f%n",newPopulation );
        newPopulation += bornRate*4-deathRate*4+immigrantRate*4; 
        System.out.printf("Year 4 = %.0f%n",newPopulation );
        newPopulation += bornRate*5-deathRate*5+immigrantRate*5; 
        System.out.printf("Year 5 = %.0f%n",newPopulation );
        
    }
    
}
