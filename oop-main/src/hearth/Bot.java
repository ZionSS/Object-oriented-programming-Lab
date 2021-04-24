/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearth;

import java.util.ArrayList;

/**
 *
 * @author STSNX
 */
public class Bot extends Player{
    public boolean checkSymbol(int check,ArrayList<Integer> hand){
        boolean res = false;
        for(int i=0;i<hand.size();i++){
            if((int)(hand.get(i)/13)==check){
            return true;
            }
        }
        return res;
    }
    public int playAnyCard(int place,int turn,int fps,ArrayList<Integer> hand){
        int play = 0;
        boolean foundQ=false;
        for(int i=0;i<hand.size();i++){
                if(hand.get(i)==23){
                    play = i;
                    foundQ=true;
                }
            }
        if(!foundQ) play = (int)(Math.random()*hand.size());
        else{
            if(place==0){
                if(hand.size()>1){
                    while(hand.get(play)==23){
                        play = (int)(Math.random()*hand.size());
                    }
                }
            }
         }
       // System.out.println("I play any");
        return play;
    }
    public int playHighestRank(int place,int turn,int fps,ArrayList<Integer> hand){
        int play = 0;
        int max =-1,card=0;
       // System.out.println("I play highest");
        if(turn == 1&&place==0){
            for(int i=0;i<hand.size();i++){
                if(hand.get(i)%13>max){
                    card = i;
                    max = hand.get(i);
                }
            }
            play = card;
        }
        else if(place==0){
            if(fps==2){
                card = playLowestRank(place,turn,fps,hand);
            }
        }
        else {
            if(checkSymbol(fps,hand)){
                max = -1;
                for(int i=0;i<hand.size();i++){
                if((int)(hand.get(i)/13)==fps){
                    if(hand.get(i)%13>max){
                    
                    card = i;
                    max = hand.get(i)%13;
                    }
                }
                }
                if(hand.get(card)==23){
                    card = playLowestRank(place,turn,fps,hand);
                }
            }
            else{
                card = playAnyCard(place,turn,fps,hand);
            }
            play = card;
        }
        
        return play;
    }
    public int playLowestRank(int place,int turn,int fps,ArrayList<Integer> hand){
        int play = 0;
        int min =14,card=0;
        if(turn == 1&&place==0){
            for(int i=0;i<hand.size();i++){
                if(hand.get(i)%13<min){
                    card = i;
                    min = hand.get(i);
                }
            }
            play = card;
        }
        else {
            if(checkSymbol(fps,hand)){
                min = 14;
                for(int i=0;i<hand.size();i++){
                if((int)(hand.get(i)/13)==fps){
                    if(hand.get(i)%13<min){
                    card = i;
                    min = hand.get(i)%13;
                    }
                }
                }
            }
            else{
                card = playAnyCard(place,turn,fps,hand);
            }
            play = card;
        }
        //System.out.println("I play lowest");
        return play;
    }
    public int decitionToplay(int place,int turn,int fps,ArrayList<Integer> hand){
        int cardToPlay = 0;
        int percent;
        if(turn==1){
            if(hand.get(0)==0) cardToPlay=0;
            else {
                percent =(int)(Math.random()*101);
                if(percent<=82){
                    cardToPlay = playHighestRank(place,turn,fps,hand);
                    
                }
                else {
                    cardToPlay = playLowestRank(place,turn,fps,hand);
                   
                }
              
            }
        }
        else if(turn<7){
            percent =(int)(Math.random()*101);
            if(percent<=50){
                cardToPlay = playHighestRank(place,turn,fps,hand);
            
            }
            else {
                cardToPlay = playLowestRank(place,turn,fps,hand);
               
            }
            
        }
        else {
            percent =(int)(Math.random()*101);
            if(percent<=22){
                cardToPlay = playHighestRank(place,turn,fps,hand);
                
            }
            else {
                cardToPlay = playLowestRank(place,turn,fps,hand);
               
            }
           
        }
        return cardToPlay;
    }
}