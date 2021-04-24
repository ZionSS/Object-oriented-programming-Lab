/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearth;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author STSNX
 */
public class Round {
    private boolean RoundOperate;
    private   Human human = new Human();
    private   Bot bot1 = new Bot();
    private   Bot bot2 = new Bot();
    private   Bot bot3 = new Bot();
    Deck deck = new Deck();
    private ArrayList<Object> queue = new ArrayList<Object>();
    private int[] point = new int[4];
   
    Scanner cin = new Scanner(System.in);
    public boolean isRoundOperate() {
        return RoundOperate;
    }

    public void setRoundOperate(boolean RoundOperate) {
        this.RoundOperate = RoundOperate;
    }
       
    public void roundBegin(){
    }
    public void roundEnd(){
        
    }
    public void givehand(){
        for(int i=0;i<13;i++){
            human.addHand(deck.card(i*4));
           // System.out.println("add in"+deck.card(i*4)+" p in "+(i*4));
            bot1.addHand(deck.card((i*4)+1));
          //  System.out.println("add in"+deck.card(i*4)+"b1 in "+((i*4)+1));
            bot2.addHand(deck.card((i*4)+2));
          //  System.out.println("add in"+deck.card(i*4)+"b2 in "+((i*4)+2));
            bot3.addHand(deck.card((i*4)+3));
           // System.out.println("add in"+deck.card(i*4)+"b2 in "+((i*4)+3));
        }
        //deck.show();
        human.sortHand();
        bot1.sortHand();
        bot2.sortHand();
        bot3.sortHand();
        System.out.println("human have");
        for(int i=0;i<human.getHand().size();i++){
            System.out.println(deck.getPoint(human.getHand().get(i)%13)+" "+deck.getTextcard((int)(human.getHand().get(i)/13)));
           // System.out.println(human.getHand().get(i)+" "+(int)human.getHand().get(i)/13);
        }
        System.out.println("");
        System.out.println("bot1 have");
        for(int i=0;i<bot1.getHand().size();i++){
            System.out.println(deck.getPoint(bot1.getHand().get(i)%13)+" "+deck.getTextcard((int)(bot1.getHand().get(i)/13)));
           // System.out.println(bot1.getHand().get(i)+" "+(int)bot1.getHand().get(i)/13);
        }
        System.out.println("");
        System.out.println("bot2 have");
        for(int i=0;i<bot2.getHand().size();i++){
            System.out.println(deck.getPoint(bot2.getHand().get(i)%13)+" "+deck.getTextcard((int)(bot2.getHand().get(i)/13)));
           // System.out.println(bot2.getHand().get(i)+" "+(int)bot2.getHand().get(i)/13);
        }
        System.out.println("");
        System.out.println("bot3 have");
        for(int i=0;i<bot3.getHand().size();i++){
            System.out.println(deck.getPoint(bot3.getHand().get(i)%13)+" "+deck.getTextcard((int)(bot3.getHand().get(i)/13)));
          // System.out.println(bot3.getHand().get(i)+" "+(int)bot3.getHand().get(i)/13);
        }
        System.out.println("");
    }
    public void changeThreeCard(int round){
        int[] tempHuman = new int[3];
        int temp=0;
        System.out.println("human have");
        for(int i=0;i<human.getHand().size();i++){
            System.out.println(i+" : "+deck.getPoint(human.getHand().get(i)%13)+" "+deck.getTextcard((int)(human.getHand().get(i)/13)));
           // System.out.println(human.getHand().get(i)+" "+(int)human.getHand().get(i)/13);
        }
        if(round == 0){
            System.out.println("In round "+round+ "change Left");
            System.out.print("Which card are you want to change :");
            for(int i=0;i<3;i++){
                tempHuman[i]=cin.nextInt();
            }
            for(int i=0;i<3;i++){ 
                human.addOwn(human.getHand().get(tempHuman[i]-i));
                human.getHand().remove(tempHuman[i]-i);
                temp = bot1.playHighestRank(0, 1, (int)(Math.random()*4), bot1.getHand());
                bot1.addOwn(bot1.getHand().get(temp));
                bot1.getHand().remove(temp);
                System.out.println("bot#1 choose"+deck.getPoint(bot1.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot1.getOwn().get(i)/13)));
                temp = bot2.playHighestRank(0, 1, (int)(Math.random()*4), bot2.getHand());
                bot2.addOwn(bot2.getHand().get(temp));
                bot2.getHand().remove(temp);
                System.out.println("bot#2 choose"+deck.getPoint(bot2.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot2.getOwn().get(i)/13)));
                temp = bot3.playHighestRank(0, 1, (int)(Math.random()*4), bot3.getHand());
                bot3.addOwn(bot3.getHand().get(temp));
                bot3.getHand().remove(temp);
                System.out.println("bot#3 choose"+deck.getPoint(bot3.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot3.getOwn().get(i)/13)));
            }
            for(int i=0;i<3;i++){ 
                human.addHand(bot3.getOwn().get(0));
                bot3.getOwn().remove(0);
                bot3.addHand(bot2.getOwn().get(0));
                bot2.getOwn().remove(0);
                bot2.addHand(bot1.getOwn().get(0));
                bot1.getOwn().remove(0);
                bot1.addHand(human.getOwn().get(0));
                human.getOwn().remove(0);
            }
            human.sortHand();
            bot1.sortHand();
            bot2.sortHand();
            bot3.sortHand();
        }
        else if(round == 1){
            System.out.println("In round "+round+ "change Right");
            System.out.print("Which card are you want to change :");
            for(int i=0;i<3;i++){
                tempHuman[i]=cin.nextInt();
            }
            for(int i=0;i<3;i++){ 
                human.addOwn(human.getHand().get(tempHuman[i]-i));
                human.getHand().remove(tempHuman[i]-i);
                temp = bot1.playHighestRank(0, 1, (int)(Math.random()*4), bot1.getHand());
                bot1.addOwn(bot1.getHand().get(temp));
                bot1.getHand().remove(temp);
                System.out.println("bot#1 choose"+deck.getPoint(bot1.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot1.getOwn().get(i)/13)));
                temp = bot2.playHighestRank(0, 1, (int)(Math.random()*4), bot2.getHand());
                bot2.addOwn(bot2.getHand().get(temp));
                bot2.getHand().remove(temp);
                System.out.println("bot#2 choose"+deck.getPoint(bot2.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot2.getOwn().get(i)/13)));
                temp = bot3.playHighestRank(0, 1, (int)(Math.random()*4), bot3.getHand());
                bot3.addOwn(bot3.getHand().get(temp));
                bot3.getHand().remove(temp);
                System.out.println("bot#3 choose"+deck.getPoint(bot3.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot3.getOwn().get(i)/13)));
            }
            for(int i=0;i<3;i++){ 
                human.addHand(bot1.getOwn().get(0));
                bot1.getOwn().remove(0);
                bot1.addHand(bot2.getOwn().get(0));
                bot2.getOwn().remove(0);
                bot2.addHand(bot3.getOwn().get(0));
                bot3.getOwn().remove(0);
                bot3.addHand(human.getOwn().get(0));
                human.getOwn().remove(0);
            }
            human.sortHand();
            bot1.sortHand();
            bot2.sortHand();
            bot3.sortHand();
        }
        else if(round == 2){
            System.out.println("In round "+round+ "change Opposite");
            System.out.print("Which card are you want to change :");
            for(int i=0;i<3;i++){
                tempHuman[i]=cin.nextInt();
            }
            for(int i=0;i<3;i++){ 
                human.addOwn(human.getHand().get(tempHuman[i]-i));
                human.getHand().remove(tempHuman[i]-i);
                temp = bot1.playHighestRank(0, 1, (int)(Math.random()*4), bot1.getHand());
                bot1.addOwn(bot1.getHand().get(temp));
                bot1.getHand().remove(temp);
                System.out.println("bot#1 choose"+deck.getPoint(bot1.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot1.getOwn().get(i)/13)));
                temp = bot2.playHighestRank(0, 1, (int)(Math.random()*4), bot2.getHand());
                bot2.addOwn(bot2.getHand().get(temp));
                bot2.getHand().remove(temp);
                System.out.println("bot#2 choose"+deck.getPoint(bot2.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot2.getOwn().get(i)/13)));
                temp = bot3.playHighestRank(0, 1, (int)(Math.random()*4), bot3.getHand());
                bot3.addOwn(bot3.getHand().get(temp));
                bot3.getHand().remove(temp);
                System.out.println("bot#3 choose"+deck.getPoint(bot3.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot3.getOwn().get(i)/13)));
            }
            for(int i=0;i<3;i++){ 
                human.addHand(bot2.getOwn().get(0));
                bot2.getOwn().remove(0);
                bot3.addHand(bot1.getOwn().get(0));
                bot1.getOwn().remove(0);
                bot1.addHand(bot3.getOwn().get(0));
                bot3.getOwn().remove(0);
                bot2.addHand(human.getOwn().get(0));
                human.getOwn().remove(0);
            }
            human.sortHand();
            bot1.sortHand();
            bot2.sortHand();
            bot3.sortHand();
        }
        
    }
    public void setSeat(){
        human.setSeat(1);
        bot1.setSeat(2);
        bot2.setSeat(3);
        bot3.setSeat(4);
    }
    public void setFirstPlayer(int fp){
    
        while(true){
               Object temp = queue.get(0);
               if(temp instanceof Human){
               if(((Human)temp).getSeat()!=fp){
                   queue.add(temp);
                   queue.remove(0);
                   }  
               else break;
                }
            else if(temp instanceof Bot){
               if(((Bot)temp).getSeat()!=fp){
                   queue.add(temp);
                   queue.remove(0);
                   }
               else break;
                }
        }
       
    }
   public int setFirstPlayerInFirstTurn(){
       int fp = 0;
        for(int i =0;i<queue.size();i++){
            Object temp = queue.get(i);
            if(temp instanceof Human){
               if(((Human)temp).getHand().get(0)==0){
                   fp = ((Human) temp).getSeat();
               }  
            }
            else if(temp instanceof Bot){
               if(((Bot)temp).getHand().get(0)==0){
                   fp = ((Bot) temp).getSeat();
               }  
            }
            
        }
        while(true){
               Object temp = queue.get(0);
               if(temp instanceof Human){
               if(((Human)temp).getSeat()!=fp){
                   queue.add(temp);
                   queue.remove(0);
                   }  
               else break;
                }
            else if(temp instanceof Bot){
               if(((Bot)temp).getSeat()!=fp){
                   queue.add(temp);
                   queue.remove(0);
                   }
               else break;
                }
        }
        System.out.println("Firstplayer is "+fp);
        return fp;
   }
    public boolean checkSymbol(int check,ArrayList<Integer> hand){
        boolean res = false;
        for(int i=0;i<hand.size();i++){
            if((int)(hand.get(i)/13)==check){
            return true;
            }
        }
        return res;
    }
    public void beginRound(){
        int firstPlayer = 0;
        int playersCard = 0;
        ArrayList<Integer> table = new ArrayList<Integer>();
        int max = 0,playePlayMax=0,firstPlayerSymbol=0;
        for(int turn = 1;turn<=13;turn++){
            System.out.println("human have");
            for(int i=0;i<human.getHand().size();i++){
            System.out.println(i+" : "+deck.getPoint(human.getHand().get(i)%13)+" "+deck.getTextcard((int)(human.getHand().get(i)/13)));
           // System.out.println(human.getHand().get(i)+" "+(int)human.getHand().get(i)/13);
            }
            System.out.println("");
            System.out.println("bot1 have");
            for(int i=0;i<bot1.getHand().size();i++){
            System.out.println(deck.getPoint(bot1.getHand().get(i)%13)+" "+deck.getTextcard((int)(bot1.getHand().get(i)/13)));
           // System.out.println(bot1.getHand().get(i)+" "+(int)bot1.getHand().get(i)/13);
            }
            System.out.println("");
            System.out.println("bot2 have");
            for(int i=0;i<bot2.getHand().size();i++){
            System.out.println(deck.getPoint(bot2.getHand().get(i)%13)+" "+deck.getTextcard((int)(bot2.getHand().get(i)/13)));
           // System.out.println(bot2.getHand().get(i)+" "+(int)bot2.getHand().get(i)/13);
            }
            System.out.println("");
            System.out.println("bot3 have");
            for(int i=0;i<bot3.getHand().size();i++){
            System.out.println(deck.getPoint(bot3.getHand().get(i)%13)+" "+deck.getTextcard((int)(bot3.getHand().get(i)/13)));
          // System.out.println(bot3.getHand().get(i)+" "+(int)bot3.getHand().get(i)/13);
            }
            System.out.println("");
           if(turn==1){
               queue.add(human);
               queue.add(bot1);
               queue.add(bot2);
               queue.add(bot3);
               firstPlayer = setFirstPlayerInFirstTurn();
           }
           else {
               setFirstPlayer(firstPlayer);
           }
           
            System.out.println("round"+turn+" : first player is" +firstPlayer);
           for(int i =0;i<4;i++){
                if(i==1) System.out.println("first player symbol is "+firstPlayerSymbol);
                if(queue.get(i) instanceof Human){
                    
                    if(i==0){
                        if(((Human)queue.get(i)).getHand().get(0)==0) {
                            System.out.print("Must play 2 Clover, ");
                            System.out.println("which card you play : ");
                            playersCard = cin.nextInt();
                        }
                        else{
                            System.out.println("which card you play : ");
                            playersCard = cin.nextInt();
                            firstPlayerSymbol= (int)(((Human)queue.get(i)).getHand().get(playersCard)/13);
                            max = ((Human)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Human)queue.get(i)).getSeat();
                            table.add(((Human)queue.get(i)).getHand().get(playersCard));
                        }
                    }
                    else {
                        System.out.println("which card you play : ");
                        playersCard = cin.nextInt();
                     //   System.out.println("playerC :"+deck.getPoint(((Human)queue.get(i)).getHand().get(playersCard)%13)+" "+ deck.getTextcard((int)(((Human)queue.get(i)).getHand().get(playersCard)/13)));
                       
                        if((int)(((Human)queue.get(i)).getHand().get(playersCard)/13)!=firstPlayerSymbol){ //checksymbol
                            if(checkSymbol(firstPlayerSymbol,((Human)queue.get(i)).getHand())){
                                System.out.println("Out of Rule(Must play same symbol if you have)");
                                i--;
                            }
                            else {
                                table.add(((Human)queue.get(i)).getHand().get(playersCard));
                            }
                        }
                        else{
                        if(max<((Human)queue.get(i)).getHand().get(playersCard)%13){
                            max = ((Human)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Human)queue.get(i)).getSeat();
                        }
                        table.add(((Human)queue.get(i)).getHand().get(playersCard));
                        }
                    }
                   
                    System.out.println("Human plays : "+deck.getPoint(((Human)queue.get(i)).getHand().get(playersCard)%13)+" "+ deck.getTextcard((int)(((Human)queue.get(i)).getHand().get(playersCard)/13)));
                    ((Human)queue.get(i)).getHand().remove(playersCard);
                }
                else if(queue.get(i)  instanceof Bot){
                    
                    if(i==0){
                        playersCard = ((Bot)queue.get(i)).decitionToplay(i,turn,firstPlayerSymbol,((Bot)queue.get(i)).getHand());
                        if(((Bot)queue.get(i)).getHand().get(0)==0){
                            firstPlayerSymbol= (int)(((Bot)queue.get(i)).getHand().get(playersCard)/13);
                            max = ((Bot)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Bot)queue.get(i)).getSeat();
                            table.add(((Bot)queue.get(i)).getHand().get(playersCard));
                        }
                        else{
                            firstPlayerSymbol= (int)(((Bot)queue.get(i)).getHand().get(playersCard)/13);
                            max = ((Bot)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Bot)queue.get(i)).getSeat();
                            table.add(((Bot)queue.get(i)).getHand().get(playersCard));  
                        }
                    }
                    else {
                        playersCard = ((Bot)queue.get(i)).decitionToplay(i,turn,firstPlayerSymbol,((Bot)queue.get(i)).getHand());
                        if((int)(((Bot)queue.get(i)).getHand().get(playersCard)/13)!=firstPlayerSymbol){ //checksymbol
                                table.add(((Bot)queue.get(i)).getHand().get(playersCard));
                        }
                        else{
                        if(max<((Bot)queue.get(i)).getHand().get(playersCard)%13){
                            max = ((Bot)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Bot)queue.get(i)).getSeat();
                        }
                        table.add(((Bot)queue.get(i)).getHand().get(playersCard));
                        }
                    }
                    System.out.println("Bot #"+(((Bot)queue.get(i)).getSeat()-1) +"plays : "+deck.getPoint(((Bot)queue.get(i)).getHand().get(playersCard)%13)+" "+deck.getTextcard((int)(((Bot)queue.get(i)).getHand().get(playersCard)/13)));
                    ((Bot)queue.get(i)).getHand().remove(playersCard);
                }
            
            }
            System.out.println("Max card is :"+deck.getPoint(max%13));
            int pointForRound=0;
            for(int i=0;i<table.size();i++){
                if(table.get(i)==23){
                    pointForRound+=13;
                }
                else if(table.get(i)>25&&table.get(i)<39){
                    pointForRound++;
                }
            }
            System.out.println("Table have "+pointForRound+"Point");
            for(int i=0;i<4;i++){
                 if(queue.get(i) instanceof Human){
                     if(((Human)queue.get(i)).getSeat()==playePlayMax) ((Human)queue.get(i)).setPoint(((Human)queue.get(i)).getPoint()+pointForRound);
                 }
                 if(queue.get(i) instanceof Bot){
                     if(((Bot)queue.get(i)).getSeat()==playePlayMax) ((Bot)queue.get(i)).setPoint(((Bot)queue.get(i)).getPoint()+pointForRound);
                 }
            }
             for(int i=0;i<4;i++){
                 if(queue.get(i) instanceof Human){
                     System.out.println("Human have "+((Human)queue.get(i)).getPoint()+" point");
                 }
                 if(queue.get(i) instanceof Bot){
                      System.out.println("Bot #"+(((Bot)queue.get(i)).getSeat()-1) +"have "+((Bot)queue.get(i)).getPoint()+" point");
                 }
            }
            table.clear();
            firstPlayer=playePlayMax;
            playePlayMax=0;
            max = 0;
            firstPlayerSymbol=(int)(Math.random()*4);
            
        }
        for(int i=0;i<4;i++){
                 if(queue.get(i) instanceof Human){
                    point[(((Human)queue.get(i)).getSeat()-1)] = ((Human)queue.get(i)).getPoint();
                 }
                 if(queue.get(i) instanceof Bot){
                   point[(((Bot)queue.get(i)).getSeat()-1)] = ((Bot)queue.get(i)).getPoint();
                 }
            }
     
    }
    public int[] play(int round){
        
//        deck.shuffle();
        givehand();
        changeThreeCard(round);
        setSeat();
        beginRound();
        return point;
    }
}