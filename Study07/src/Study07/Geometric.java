/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Study07;

import java.util.Date;

/**
 *
 * @author Ailas
 */
public class Geometric {
    String color;
    Date dateCreated;

    public Geometric() {
        this.dateCreated = new Date();
    }
    public Geometric(String color) {
        this.color = color;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated() {
        this.dateCreated = new Date();
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", dateCreated=" + dateCreated + '}';
    }
    
    
    
    
}
