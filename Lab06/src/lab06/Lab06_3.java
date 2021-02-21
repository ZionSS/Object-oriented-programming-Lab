/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Ailas
 */
public class Lab06_3 {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        for(int i=1 ; i <= 20 ;i++ ){
            q1.enqueue(i);
        }
        int size=q1.getSize();
        for(int i=0;i<size+1;i++){
            System.out.println(q1.dequeue());
        }
        if(q1.empty()){
            System.out.println("q1 Is empty");
        }
        else System.out.println("q1 is not empty");
        
    }
}