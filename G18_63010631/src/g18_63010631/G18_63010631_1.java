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

public class G18_63010631_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        List<Character> alphabet = new ArrayList();
        List<Character> number = new ArrayList();
        Scanner input = new Scanner(System.in);
        alphabet.addAll(Arrays.asList('a','b','c','d','e','f','g','h','i','j'));
        number.addAll(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
       int r = rand.nextInt(10);
       int dataSelect;
       List<Integer> temp = new ArrayList();
       List<Character> randomChar = new ArrayList();
       int aor1;
      aor1 = rand.nextInt(2);
       if(aor1==0)
       {
           for(int i=0;i<10;i++)
           {
              do
              {
                  r = rand.nextInt(10);
              }while(temp.contains(r));
               temp.add(r);
               if(i%2==0)
               {
                 switch(r){
                   case 0 : randomChar.add('0'); break;
                   case 1 : randomChar.add('1'); break;
                   case 2 : randomChar.add('2'); break;
                   case 3 : randomChar.add('3'); break;
                   case 4 : randomChar.add('4'); break;
                   case 5 : randomChar.add('5'); break;
                   case 6 : randomChar.add('6'); break;
                   case 7 : randomChar.add('7'); break;
                   case 8 : randomChar.add('8'); break;
                   case 9 : randomChar.add('9'); break;
                   default:
               }
               }
                else{
                         switch(r){
                   case 0 : randomChar.add('a'); break;
                   case 1 : randomChar.add('b'); break;
                   case 2 : randomChar.add('c'); break;
                   case 3 : randomChar.add('d'); break;
                   case 4 : randomChar.add('e'); break;
                   case 5 : randomChar.add('f'); break;
                   case 6 : randomChar.add('g'); break;
                   case 7 : randomChar.add('h'); break;
                   case 8 : randomChar.add('i'); break;
                   case 9 : randomChar.add('j'); break;
                   default:
                         }
               }
               
                   
           
           
        }     
       }
       else{
            for(int i=0;i<10;i++)
           {
              do
              {
                  r = rand.nextInt(10);
              }while(temp.contains(r));
               temp.add(r);
               if(i%2!=0)
               {
                 switch(r){
                   case 0 : randomChar.add('0'); break;
                   case 1 : randomChar.add('1'); break;
                   case 2 : randomChar.add('2'); break;
                   case 3 : randomChar.add('3'); break;
                   case 4 : randomChar.add('4'); break;
                   case 5 : randomChar.add('5'); break;
                   case 6 : randomChar.add('6'); break;
                   case 7 : randomChar.add('7'); break;
                   case 8 : randomChar.add('8'); break;
                   case 9 : randomChar.add('9'); break;
                   default:
               }
               }
                else{
                         switch(r){
                   case 0 : randomChar.add('a'); break;
                   case 1 : randomChar.add('b'); break;
                   case 2 : randomChar.add('c'); break;
                   case 3 : randomChar.add('d'); break;
                   case 4 : randomChar.add('e'); break;
                   case 5 : randomChar.add('f'); break;
                   case 6 : randomChar.add('g'); break;
                   case 7 : randomChar.add('h'); break;
                   case 8 : randomChar.add('i'); break;
                   case 9 : randomChar.add('j'); break;
                   default:
                         }
               }
       }
        
        
    }
        System.out.print("Random characters are : ");
       for(int i = 0; i < randomChar.size(); i++) {
            System.out.print(randomChar.get(i)+" ");
        }
        System.out.println("");
        System.out.print("Select group of characters [1] character or [2] numeric : ");
        dataSelect = input.nextInt();
        
        if(dataSelect == 1)
        {
            System.out.print("Characters not in the list are :");
           alphabet.removeAll(randomChar);
            for(int i = 0; i < alphabet.size(); i++) {
            System.out.print(alphabet.get(i)+" ");
        }
        }
        else
        {
            System.out.print("Numerics not in the list are :");
                number.removeAll(randomChar);
            for(int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i)+" ");   
        }
        }
    }//main
}
