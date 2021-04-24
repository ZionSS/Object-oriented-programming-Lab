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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import hearth.MainController;
public class Deck {
    private boolean checkdeck[] = new boolean[53];
    private String[] textcard = {"Clover","Spade","Hearth","Diamond"};
    private String[] point = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    public ArrayList<Integer> deck = new ArrayList<Integer>();
    
     public void shuffle(ArrayList<Integer> deck){
        int count = 0;
        int temp;
        deck.clear();
        for(int i=0;i<52;i++){
            checkdeck[i] = false;
        }
        while(count<52){
            temp = (int)(Math.random()*52);
            if(checkdeck[temp]==false){
                deck.add(temp); 
                checkdeck[temp]=true;
                count++;
            }
        }
        count = 0;
    }
    public int getcard(int i){
        return deck.get(i);
    } 
   
       public String getTextcard(int i) {
        return this.textcard[i];
    }

    public String getPoint(int i) {
        return this.point[i];
    }
    
    public int card(int x){
        return this.deck.get(x);
    }
    public void show(){
        for(int i=0;i<52;i++){
            System.out.println(point[deck.get(i)%13]+" "+textcard[(int)(deck.get(i)/13)]+"deck");
        }
       
    }
    
}
