/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearth;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author STSNX
 */
public class Player {
    private int point = 0;
    private int seat;
    private ArrayList<Integer> hand = new ArrayList<Integer>();
    private ArrayList<Integer> own = new ArrayList<Integer>();
    public void play(){
        //pick card;
    }
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public ArrayList<Integer> getHand() {
        return hand;
    }

    public ArrayList<Integer> getOwn() {
        return own;
    }

    public void addHand(int x){
        this.hand.add(x);
    }
    public void addOwn(int x){
        this.own.add(x);
    }
    public void sortHand(){
        Collections.sort(this.hand);
    }
}

