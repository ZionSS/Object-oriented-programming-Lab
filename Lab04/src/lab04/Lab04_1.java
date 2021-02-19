/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Ailas
 */
public class Lab04_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL"," Oracle Corporation");
        stock.previosClosingPrice=34.5;
        stock.CurrentPrice=34.35;
        System.out.println("Symbol: "+stock.Symbol);
        System.out.println("Name: "+stock.name);
        System.out.println("Previos Closing Price: "+stock.previosClosingPrice);
        System.out.println("Current Price: "+stock.CurrentPrice);
        System.out.println("Price Change: "+stock.getChangePercentage()+"%");
    }
    
}

 class Stock {
    String Symbol;
    String name;
    double previosClosingPrice;
    double CurrentPrice;
    
    Stock(String symbolName,String newName){
        Symbol = symbolName;
        name = newName;  
        
    }
    
    double getChangePercentage(){
        return(((CurrentPrice-previosClosingPrice)*100/previosClosingPrice));
    }
}