/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Date;

/**
 *
 * @author Ailas
 */
public class Staff extends Employee{
    public String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Staff() {
    }

    public Staff(String title) {
        this.title = title;
    }


    public Staff(String title, String office, double salary, Date dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" + "title=" + title + '}';
    }
    
}
