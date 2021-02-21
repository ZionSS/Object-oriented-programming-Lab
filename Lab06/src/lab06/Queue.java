/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ailas
 */
public class Queue {
    int[] elements = new int[0];
    int size = 0;
    
    public Queue(){
        this.elements = new int[8];
    }
    
    public void enqueue(int v){
        if(size+1 < elements.length){
            elements[size]= v;
            size++;
        }
        else{
            int[] temp = elements;
            elements = new int[elements.length * 2];
            for(int i=0;i<temp.length;i++){
                elements[i]=temp[i];
            }
            elements[size]=v;
            size++;
        }
    }
    
    public int dequeue(){
        
        int temp = elements[0];
        if(size > 0){
            size--;
        for(int i=0;i<size;i++){
            elements[i]=elements[i+1];
        }
        return temp;
        }
        else{
            return -1;
        }
    }
    
    public boolean empty(){
        if(size == 0){
            return true;
        }
        else return false;
    }
    
    public int getSize(){
        return size;
    }
}