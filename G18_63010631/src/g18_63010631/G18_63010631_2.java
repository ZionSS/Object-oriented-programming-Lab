/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g18_63010631;

/**
 *
 * @author Ailas
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class G18_63010631_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of matrix: ");
        int size= input.nextInt();
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        Random rand = new Random();
        int temp;
        
        
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
               temp = rand.nextInt(6);
                matrix.add(new ArrayList<>(temp));
            }
        }
        
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(matrix.get(i).get(j));
            }
        }
    }
    
}
