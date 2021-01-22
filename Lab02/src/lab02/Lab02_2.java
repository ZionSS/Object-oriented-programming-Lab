/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Ailas
 */
public class Lab02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int com = (int) ((Math.random() * 3));
       int player;
       Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        player = input.nextInt();
        if(player<0||player>2)
        {
            System.out.println("Invalid Data");
            return;
        }
        System.out.print("The computer is ");
        switch(com)
        {
            case 0: System.out.print("scissor."); break;
            case 1: System.out.print("rock."); break;
            case 2: System.out.print("paper."); break;
        }
        System.out.print(" You are ");
        switch(player)
        {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper"); break;
        }
        if(com==player)
        {
            System.out.print(" too.");
        }
        else
        {
            System.out.print(".");
        }
        if((com == 2 && player == 1)||(com == 1 && player == 0)||(com == 0 && player == 2))
        {
            System.out.println(" You lose");
        }
        else if((com == 1 && player == 2)||(com == 0 && player == 1)||(com == 2 && player == 0))
        {
            System.out.println(" You won");
        }
        else if(com == player)
        {
            System.out.println(" It is a draw");
        }
    }
    
}
