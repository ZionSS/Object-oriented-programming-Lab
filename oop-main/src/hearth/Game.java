/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearth;

/**
 *
 * @author STSNX
 */
public class Game {
    int countRound=0;
    int[] point = {0,0,0,0};
    int max = 0;
    Round round = new Round();
    public void begin(){
        while(max<100){
        System.out.println("Round : "+countRound+" begin");
        int[] temp = round.play(countRound%4);
            
        for(int i=0;i<4;i++){
            if(temp[i]==26){ 
                for(int j=0;j<4;j++){
                if(j!=i) temp[j]=26;
                }
            }
        }
        for(int i=0;i<4;i++){
            point[i] +=temp[i]; 
            System.out.println("now, player : "+(i+1)+"has "+point[i]+" point");
            if(point[i]>max) max = point[i];
        }
        countRound++;
        }
    }
}

