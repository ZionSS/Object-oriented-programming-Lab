/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearth;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.MouseEvent.MOUSE_CLICKED;
import javafx.scene.layout.AnchorPane;
/**
 *
 * @author STSNX
 */
public class MainController implements Initializable {
    
    ArrayList <frontEndCard> frontDeck= new  ArrayList <frontEndCard>();    
    @FXML private TextField output;
    @FXML private Button button; @FXML private ImageView back; 
    @FXML private ImageView card1; @FXML private ImageView card2; @FXML private ImageView card3; @FXML private ImageView card4;
    @FXML private ImageView card5; @FXML private ImageView card6; @FXML private ImageView card7; @FXML private ImageView card9; @FXML private ImageView card10; @FXML private ImageView card11;
    @FXML private ImageView card12; @FXML private ImageView card13; @FXML private ImageView card8; @FXML private ImageView card14;@FXML private ImageView card15; @FXML private ImageView card16; 
    @FXML private ImageView card18; @FXML private ImageView card19; @FXML private ImageView card20;@FXML private ImageView card22; @FXML private ImageView card23; @FXML private ImageView card24;
    @FXML private ImageView card25; @FXML private ImageView card26; @FXML private ImageView card21;@FXML private ImageView card27; @FXML private ImageView card28; @FXML private ImageView card29;
    @FXML private ImageView card30; @FXML private ImageView card31; @FXML private ImageView card32;@FXML private ImageView card33; @FXML private ImageView card35; @FXML private ImageView card36;
    @FXML private ImageView card37; @FXML private ImageView card38; @FXML private ImageView card39;@FXML private ImageView card34; @FXML private ImageView card40; @FXML private ImageView card41;
    @FXML private ImageView card42; @FXML private ImageView card43; @FXML private ImageView card44;@FXML private ImageView card45; @FXML private ImageView card46; @FXML private ImageView card48;
    @FXML private ImageView card49; @FXML private ImageView card50; @FXML private ImageView card51;@FXML private ImageView card52; @FXML private ImageView card47;@FXML private ImageView card17;
    @FXML private ImageView tableBG;
    @FXML private ImageView tablePlay;
    @FXML
   
    private TextField statusBox;
    private Image tablebg = new Image("/img/tablebg.png");
    private Image tableplay = new Image("/img/tableplay.png");
    private   Human human = new Human();
    private   Bot bot1 = new Bot();
    private   Bot bot2 = new Bot();
    private   Bot bot3 = new Bot();
    Deck deck = new Deck();
    private ArrayList<Object> queue = new ArrayList<Object>();
    private int[] point = new int[4];
    
    int countRound=0;
    int[] pointPlayer = new int[4];
    int maxPoint = 0;
    int playerCardNow =0;
    boolean canPlay = false;
    
    int[] tempHuman = new int[3];
    
    int firstPlayer = 0;
    
     
    @FXML
    private AnchorPane field;
    @FXML
    private ImageView table1;
    @FXML
    private ImageView table2;
    @FXML
    private ImageView table3;
    @FXML
    private ImageView table4;
    @FXML
    private TextField scoreboard;
    @FXML
    private ImageView back1;
    void setFrontDeck(){
        for(int i=0;i<52;i++){
            String filename = "/img/Card_Deck/"+i+"_card.png";
            frontEndCard temp = new frontEndCard();
            temp.front = new Image(filename);
            temp.back = new Image("/img/gray_back.png");
            temp.rank = i;
            frontDeck.add(temp);
        }
    }
    
    void setDisplay(){
         tablePlay.setImage(tableplay);
         tableBG.setImage(tablebg);
           for(int i=0;i<13;i++){
            if(i<human.getHand().size()){
            switch(i){
                case 0: card1.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 1: card2.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 2: card3.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 3: card4.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 4: card5.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 5: card6.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 6: card7.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 7: card8.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 8: card9.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 9: card10.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 10: card11.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 11: card12.setImage(frontDeck.get(human.getHand().get(i)).front);break;
                case 12: card13.setImage(frontDeck.get(human.getHand().get(i)).front);break;
            }
            }
            else{
            switch(i){
                case 0: card1.setImage(null);break;
                case 1: card2.setImage(null);break;
                case 2: card3.setImage(null);break;
                case 3: card4.setImage(null);break;
                case 4: card5.setImage(null);break;
                case 5: card6.setImage(null);break;
                case 6: card7.setImage(null);break;
                case 7: card8.setImage(null);break;
                case 8: card9.setImage(null);break;
                case 9: card10.setImage(null);break;
                case 10: card11.setImage(null);break;
                case 11: card12.setImage(null);break;
                case 12: card13.setImage(null);break;
            }    
            }
        }
        for(int i=0;i<13;i++){
            if(i<bot1.getHand().size()){
            switch(i){
                case 0: card14.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 1: card15.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 2: card16.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 3: card17.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 4: card18.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 5: card19.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 6: card20.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 7: card21.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 8: card22.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 9: card23.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 10: card24.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 11: card25.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
                case 12: card26.setImage(frontDeck.get(bot1.getHand().get(i)).back);break;
            }
            }
            else {
            switch(i){
                case 0: card14.setImage(null);break;
                case 1: card15.setImage(null);break;
                case 2: card16.setImage(null);break;
                case 3: card17.setImage(null);break;
                case 4: card18.setImage(null);break;
                case 5: card19.setImage(null);break;
                case 6: card20.setImage(null);break;
                case 7: card21.setImage(null);break;
                case 8: card22.setImage(null);break;
                case 9: card23.setImage(null);break;
                case 10: card24.setImage(null);break;
                case 11: card25.setImage(null);break;
                case 12: card26.setImage(null);break;
            }    
            }
        }
        for(int i=0;i<13;i++){
            if(i<bot2.getHand().size()){
            switch(i){
                case 0: card27.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 1: card28.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 2: card29.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 3: card30.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 4: card31.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 5: card32.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 6: card33.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 7: card34.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 8: card35.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 9: card36.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 10: card37.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 11: card38.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
                case 12: card39.setImage(frontDeck.get(bot2.getHand().get(i)).back);break;
            }
            }
            else{
                switch(i){
                case 0: card27.setImage(null);break;
                case 1: card28.setImage(null);break;
                case 2: card29.setImage(null);break;
                case 3: card30.setImage(null);break;
                case 4: card31.setImage(null);break;
                case 5: card32.setImage(null);break;
                case 6: card33.setImage(null);break;
                case 7: card34.setImage(null);break;
                case 8: card35.setImage(null);break;
                case 9: card36.setImage(null);break;
                case 10: card37.setImage(null);break;
                case 11: card38.setImage(null);break;
                case 12: card39.setImage(null);break;
            }
            }
        }
        for(int i=0;i<13;i++){
            if(i<bot3.getHand().size()){
            switch(i){
                case 0: card40.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 1: card41.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 2: card42.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 3: card43.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 4: card44.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 5: card45.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 6: card46.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 7: card47.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 8: card48.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 9: card49.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 10: card50.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 11: card51.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
                case 12: card52.setImage(frontDeck.get(bot3.getHand().get(i)).back);break;
            }
            }
            else {
                switch(i){
                case 0: card40.setImage(null);break;
                case 1: card41.setImage(null);break;
                case 2: card42.setImage(null);break;
                case 3: card43.setImage(null);break;
                case 4: card44.setImage(null);break;
                case 5: card45.setImage(null);break;
                case 6: card46.setImage(null);break;
                case 7: card47.setImage(null);break;
                case 8: card48.setImage(null);break;
                case 9: card49.setImage(null);break;
                case 10: card50.setImage(null);break;
                case 11: card51.setImage(null);break;
                case 12: card52.setImage(null);break;
            }
            }
        }
    }
    public void changeThreeCard(int round){
        for(int i=0;i<4;i++){
            point[i] = 0;
        }
        statusBox.setText("Round "+countRound);
        int[] tempHuman = new int[3];
        int temp=0;
        //output.setText("Which card are you want to change :");
           fSelect();
        if(round==0){
            statusBox.setText("Give three card to Left Player");
        }
        else if(round==1){
            output.setText("Give three card to Right Player");
        }
        else if(round==2){
           output.setText("Give three card to Opposite Player");
        }
        else if(round==3){
            beginRoundFirstHalf(1);
        }
    }
    public void changeThreecardAfterSelected(int round){
        int temp = 0;
        Arrays.sort(tempHuman);
       
        if(round==0){
          // statusBox.setText("Give three card to Left Player");
         for(int i=0;i<3;i++){ 
                human.addOwn(human.getHand().get(tempHuman[i]-i));
                human.getHand().remove(tempHuman[i]-i);
                temp = bot1.playHighestRank(0, 1, (int)(Math.random()*4), bot1.getHand());
                bot1.addOwn(bot1.getHand().get(temp));
                bot1.getHand().remove(temp);
               // System.out.println("bot#1 choose"+deck.getPoint(bot1.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot1.getOwn().get(i)/13)));
                temp = bot2.playHighestRank(0, 1, (int)(Math.random()*4), bot2.getHand());
                bot2.addOwn(bot2.getHand().get(temp));
                bot2.getHand().remove(temp);
              //  System.out.println("bot#2 choose"+deck.getPoint(bot2.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot2.getOwn().get(i)/13)));
                temp = bot3.playHighestRank(0, 1, (int)(Math.random()*4), bot3.getHand());
                bot3.addOwn(bot3.getHand().get(temp));
                bot3.getHand().remove(temp);
               // System.out.println("bot#3 choose"+deck.getPoint(bot3.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot3.getOwn().get(i)/13)));
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
            statusBox.setText("ez");
            setDisplay();
            beginRoundFirstHalf(1);
        }
        else if(round == 1){
            //System.out.println("In round "+round+ "change Right");
           // System.out.print("Which card are you want to change :");
          //  statusBox.setText("Give three card to Right Player");
            for(int i=0;i<3;i++){ 
                human.addOwn(human.getHand().get(tempHuman[i]-i));
                human.getHand().remove(tempHuman[i]-i);
                temp = bot1.playHighestRank(0, 1, (int)(Math.random()*4), bot1.getHand());
                bot1.addOwn(bot1.getHand().get(temp));
                bot1.getHand().remove(temp);
               // System.out.println("bot#1 choose"+deck.getPoint(bot1.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot1.getOwn().get(i)/13)));
                temp = bot2.playHighestRank(0, 1, (int)(Math.random()*4), bot2.getHand());
                bot2.addOwn(bot2.getHand().get(temp));
                bot2.getHand().remove(temp);
               // System.out.println("bot#2 choose"+deck.getPoint(bot2.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot2.getOwn().get(i)/13)));
                temp = bot3.playHighestRank(0, 1, (int)(Math.random()*4), bot3.getHand());
                bot3.addOwn(bot3.getHand().get(temp));
                bot3.getHand().remove(temp);
               // System.out.println("bot#3 choose"+deck.getPoint(bot3.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot3.getOwn().get(i)/13)));
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
            statusBox.setText("ez");
            setDisplay();
            beginRoundFirstHalf(1);
        }
        else if(round == 2){
          //  System.out.println("In round "+round+ "change Opposite");
          //  System.out.print("Which card are you want to change :");
        //   statusBox.setText("Give three card to Opposite Player");
            for(int i=0;i<3;i++){ 
                human.addOwn(human.getHand().get(tempHuman[i]-i));
                human.getHand().remove(tempHuman[i]-i);
                temp = bot1.playHighestRank(0, 1, (int)(Math.random()*4), bot1.getHand());
                bot1.addOwn(bot1.getHand().get(temp));
                bot1.getHand().remove(temp);
            //    System.out.println("bot#1 choose"+deck.getPoint(bot1.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot1.getOwn().get(i)/13)));
                temp = bot2.playHighestRank(0, 1, (int)(Math.random()*4), bot2.getHand());
                bot2.addOwn(bot2.getHand().get(temp));
                bot2.getHand().remove(temp);
            //    System.out.println("bot#2 choose"+deck.getPoint(bot2.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot2.getOwn().get(i)/13)));
                temp = bot3.playHighestRank(0, 1, (int)(Math.random()*4), bot3.getHand());
                bot3.addOwn(bot3.getHand().get(temp));
                bot3.getHand().remove(temp);
            //    System.out.println("bot#3 choose"+deck.getPoint(bot3.getOwn().get(i)%13)+" "+deck.getTextcard((int)(bot3.getOwn().get(i)/13)));
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
            statusBox.setText("ez");
            setDisplay();
            
            beginRoundFirstHalf(1);
            
        }
        
        
    }
    public void beginRoundFirstHalf(int turn){  
        ArrayList<Integer> table = new ArrayList<Integer>();
        int max = 0,playePlayMax=0,firstPlayerSymbol=0; 
        if(turn==1)firstPlayerSymbol=(int)(Math.random()*4);
        int playersCard =0;
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
        if(human.getHand().get(0)==0) {
        output.setText("Must play 2 Clover, ");}
        else {
        output.setText("which card you play : ");}
       statusBox.setText("begin Turn "+turn);
       output.setText(" ");
          for(int i =0;i<4;i++){
                if(queue.get(i) instanceof Human){
                    if (i==0) playersCardSelect(turn,table,max,playePlayMax,firstPlayerSymbol,i,0);
                    else playersCardSelect(turn,table,max,playePlayMax,firstPlayerSymbol,i,1);
                    for(int j=0;j<table.size();j++){
                    String filename = "/img/Card_Deck/"+table.get(j)+"_card.png";
                    Image imageTable = new Image(filename);
                    switch(j){
                    case 0 :table1.setImage(imageTable);break;
                    case 1 :table2.setImage(imageTable);break;
                    case 2 :table3.setImage(imageTable);break;
                    case 3 :table4.setImage(imageTable);break;
                    }
                    }
                    break;
                }
                else if(queue.get(i)  instanceof Bot){
                    
                    if(i==0){
                        playersCard = ((Bot)queue.get(i)).decitionToplay(i,turn,firstPlayerSymbol,((Bot)queue.get(i)).getHand());
                        if(((Bot)queue.get(i)).getHand().get(0)==0){
                             output.setText("Must play 2 Clover, ");
                            firstPlayerSymbol= (int)(((Bot)queue.get(i)).getHand().get(playersCard)/13);
                            max = ((Bot)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Bot)queue.get(i)).getSeat();
                            table.add(((Bot)queue.get(i)).getHand().get(playersCard));
                        }
                        else{
                            output.setText("which card you play : ");
                            firstPlayerSymbol= (int)(((Bot)queue.get(i)).getHand().get(playersCard)/13);
                            max = ((Bot)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Bot)queue.get(i)).getSeat();
                            table.add(((Bot)queue.get(i)).getHand().get(playersCard));  
                        }
                    }
                    else {
                        output.setText("which card you play : ");
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
                    ((Bot)queue.get(i)).getHand().remove(playersCard);
                    for(int j=0;j<table.size();j++){
                    String filename = "/img/Card_Deck/"+table.get(j)+"_card.png";
                    Image imageTable = new Image(filename);
                    switch(j){
                    case 0 :table1.setImage(imageTable);break;
                    case 1 :table2.setImage(imageTable);break;
                    case 2 :table3.setImage(imageTable);break;
                    case 3 :table4.setImage(imageTable);break;
                    }
                    }
                    setDisplay();
                }
                
            }
            
    }
        
    public void beginRoundLastHalf(int played,int turn,ArrayList<Integer> table,int max,int playePlayMax,int firstPlayerSymbol, int startnext){
        int playersCard = 0;
        
        playersCard = played;
        //output.setText(played+" ");
         for(int i =startnext;i<4;i++){
                if(queue.get(i) instanceof Human){
                    
                    if(i==0){
                        if(((Human)queue.get(i)).getHand().get(0)==0) {
                            output.setText("Must play 2 Clover, ");
                            firstPlayerSymbol= (int)(((Human)queue.get(i)).getHand().get(playersCard)/13);
                            max = ((Human)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Human)queue.get(i)).getSeat();
                            table.add(((Human)queue.get(i)).getHand().get(playersCard));
                        }
                        else{
                            output.setText("which card you play : ");
                            firstPlayerSymbol= (int)(((Human)queue.get(i)).getHand().get(playersCard)/13);
                            max = ((Human)queue.get(i)).getHand().get(playersCard)%13;
                            playePlayMax=((Human)queue.get(i)).getSeat();
                            table.add(((Human)queue.get(i)).getHand().get(playersCard));
                        }
                    }
                    else {
                        output.setText("which card you play : ");  
                        if((int)(((Human)queue.get(i)).getHand().get(playersCard)/13)!=firstPlayerSymbol){ //checksymbol
                            if(checkSymbol(firstPlayerSymbol,((Human)queue.get(i)).getHand())){
                                output.setText("Out of Rule(Must play same symbol if you have)");
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
                    ((Bot)queue.get(i)).getHand().remove(playersCard);
                }
            
            }
            int pointForRound =0;
            for(int i=0;i<table.size();i++){
                if(table.get(i)==23){
                    pointForRound+=13;
                }
                else if(table.get(i)>25&&table.get(i)<39){
                    pointForRound++;
                }
            }
          /*  for(int i=0;i<4;i++){
                 if(queue.get(i) instanceof Human){
                     if(((Human)queue.get(i)).getSeat()==playePlayMax) ((Human)queue.get(i)).setPoint(((Human)queue.get(i)).getPoint()+pointForRound);
                 }
                 if(queue.get(i) instanceof Bot){
                     if(((Bot)queue.get(i)).getSeat()==playePlayMax) ((Bot)queue.get(i)).setPoint(((Bot)queue.get(i)).getPoint()+pointForRound);
                 }
            }*/
            for(int i=0;i<table.size();i++){
                String filename = "/img/Card_Deck/"+table.get(i)+"_card.png";
                Image imageTable = new Image(filename);
                switch(i){
                    case 0 :table1.setImage(imageTable);break;
                    case 1 :table2.setImage(imageTable);break;
                    case 2 :table3.setImage(imageTable);break;
                    case 3 :table4.setImage(imageTable);break;
                }
                
            }
            setDisplay();
          //  statusBox.setText(pointForRound+" "+playePlayMax);
            endinground(turn,table,max,playePlayMax,firstPlayerSymbol,pointForRound);
            table.clear();
            
    }
    public void endinground(int turn,ArrayList<Integer> table,int max,int playePlayMax,int firstPlayerSymbol,int pointForRound){
         field.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
             
             for(int i=0;i<4;i++){
                 if(queue.get(i) instanceof Human){
                     if(((Human)queue.get(i)).getSeat()==playePlayMax) point[((Human)queue.get(i)).getSeat()-1]+=pointForRound;
                 }
                 if(queue.get(i) instanceof Bot){
                     if(((Bot)queue.get(i)).getSeat()==playePlayMax)  point[((Bot)queue.get(i)).getSeat()-1]+=pointForRound;
                 }
            }
            statusBox.setText("end round press ESC to Exit");
            
            table1.setImage(null);
            table2.setImage(null);
            table3.setImage(null);
            table4.setImage(null);
            //countRound++;
            firstPlayer=playePlayMax;
            
            
            /*for(int i=0;i<4;i++){
                 if(queue.get(i) instanceof Human){
                    point[(((Human)queue.get(i)).getSeat()-1)] = ((Human)queue.get(i)).getPoint();
                 }
                 if(queue.get(i) instanceof Bot){
                   point[(((Bot)queue.get(i)).getSeat()-1)] = ((Bot)queue.get(i)).getPoint();
                 }
            }*/
           
            
            if(turn+1<=13){
                beginRoundFirstHalf(turn+1);
                setDisplay();
            }
            else {
                for(int i=0;i<4;i++){
                    if(point[i]==26){
                         for(int j=0;j<4;j++){
                             if(i!=j){
                                 point[j]=26;
                             }
                             else  point[j]=0;
                         }
                    }
                }
                for(int i=0;i<4;i++){
                    pointPlayer[i]+=point[i];
                }
                for(int i=0;i<4;i++){
                    if(pointPlayer[i]>maxPoint) maxPoint = pointPlayer[i];
                }
                if(maxPoint>=50){
                    statusBox.setText("end of game");
                }
                else {
                    countRound++;
                    deck.shuffle(deck.deck);
                    givehand();
                    setDisplay();
                    
                    scoreboard.setText("player "+pointPlayer[0]+" bot#1 "+pointPlayer[1]+" bot#2 "+pointPlayer[2]+" bot#3 "+pointPlayer[3]);
                   // scoreShow = "player "+pointPlayer[0]+" bot#1 "+pointPlayer[1]+" bot#2 "+pointPlayer[2]+" bot#3 "+pointPlayer[3];
                    firstPlayer = setFirstPlayerInFirstTurn();
                    changeThreeCard(countRound%4);
                }
            }
            }
         });
    }
    public void givehand(){
        for(int i=0;i<13;i++){
            human.addHand(deck.card(i*4));
            bot1.addHand(deck.card((i*4)+1));
            bot2.addHand(deck.card((i*4)+2));
            bot3.addHand(deck.card((i*4)+3));
        }
        human.sortHand();
        bot1.sortHand();
        bot2.sortHand();
        bot3.sortHand();
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       deck.shuffle(deck.deck);
       output.setText("text");
       setFrontDeck();
        Image backCard = new Image("/img/gray_back.png");
        back.setImage(backCard);
       // back1.setImage(backCard);
      if(countRound==0){
    //   back1.setS
       givehand();
       setDisplay();
       setSeat();
       for(int i=0;i<4;i++){
           pointPlayer[i] = 0;
       }
       changeThreeCard(countRound);
      }
      
    }  
    
    /*private void textScoreSetting(String scoreShow){
        scoreLabel.setText(scoreShow);
        scoreLabel.setPrefHeight(maxPoint-50);
        scoreLabel.setPrefWidth(50);
        scoreLabel.setAlignment(Pos.CENTER);
        scoreLabel.setWrapText(true);
        groupTextScore.getChildren().add(scoreLabel);
  
    }
*/
    @FXML
    private void display(ActionEvent event) {
        
        deck.shuffle(deck.deck);
        output.setText("text");
        human.getHand().clear();
        bot1.getHand().clear();
        bot2.getHand().clear();
        bot3.getHand().clear();
        setFrontDeck();
        Image backCard = new Image("/img/gray_back.png");
        back.setImage(backCard);
        givehand();
        setDisplay();
       
   
    }
    
    public void fSelect() {
         field.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
        String t[] = event.getTarget().toString().split(" ");
        String[] temp = t[0].split("card");
        String[] tempfinal = temp[1].split(",");
        int id = parseInt(tempfinal[0]);
      //  statusBox.setText(tempfinal[0]);
        tempHuman[0] = id-1 ;
        canPlay = true;
        sSelect();
                 }
         });
         
    }
    public void sSelect() {
         field.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
        String t[] = event.getTarget().toString().split(" ");
        String[] temp = t[0].split("card");
        String[] tempfinal = temp[1].split(",");
        int id = parseInt(tempfinal[0]);
       // statusBox.setText(tempfinal[0]);
        tempHuman[1] = id-1 ;
        canPlay = true;
        tSelect();
                 }
         });
         
    }
    public void tSelect() {
         field.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
        String t[] = event.getTarget().toString().split(" ");
        String[] temp = t[0].split("card");
        String[] tempfinal = temp[1].split(",");
        int id = parseInt(tempfinal[0]);
       // statusBox.setText(tempfinal[0]);
        tempHuman[2] = id-1 ;
        canPlay = true;
        output.setText(tempHuman[0]+" "+tempHuman[1]+" "+tempHuman[2]+" ");
        changeThreecardAfterSelected(countRound%4);
                 }
         });
         
    }
    public void playersCardSelect(int turn,ArrayList<Integer> table,int max,int playePlayMax,int firstPlayerSymbol, int startnext,int isfirst){
        field.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
        String t[] = event.getTarget().toString().split(" ");
        String[] temp = t[0].split("card");
        String[] tempfinal = temp[1].split(",");
        int id = parseInt(tempfinal[0]); 
        //statusBox.setText(tempfinal[0]);
        if(isfirst==1){
        for(int i=0;i<4;i++){
            if(queue.get(i) instanceof Human){
                if((int)(((Human)queue.get(i)).getHand().get(id-1)/13)!=firstPlayerSymbol){ //checksymbol
                        if(checkSymbol(firstPlayerSymbol,((Human)queue.get(i)).getHand())){
                                output.setText("Out of Rule(Must play same symbol if you have)");
                             
                            }
                            else {
                                beginRoundLastHalf(id-1,turn,table,max,playePlayMax,firstPlayerSymbol,startnext);
                            }
                        }
                else beginRoundLastHalf(id-1,turn,table,max,playePlayMax,firstPlayerSymbol,startnext);
            }
        }
        }
        else {
            for(int i=0;i<4;i++){
            if(queue.get(i) instanceof Human){
             int firstPlayerSymbol = (int)(((Human)queue.get(i)).getHand().get(id-1)/13);
             int max = ((Human)queue.get(i)).getHand().get(id-1)%13;
             beginRoundLastHalf(id-1,turn,table,max,1,firstPlayerSymbol,startnext);
            }
            }
        }
        }
            
         });
         
    }
    public void con() {
         output.setText(tempHuman[0]+" "+tempHuman[1]+" "+tempHuman[2]+" ");
    }
    @FXML
    private void showCard(MouseEvent event) {
        String t[] = event.getTarget().toString().split(" ");
        String[] temp = t[0].split("card");
        String[] tempfinal = temp[1].split(",");
        int id = parseInt(tempfinal[0]);
        statusBox.setText(tempfinal[0]);
        playerCardNow = id;
        canPlay = true;
    }
    public void displaystatus(String status) {
       
        statusBox.setText(status);
    }

    @FXML
    private void waveing(MouseEvent event) {
        
    }
    
}
//setcardandplay