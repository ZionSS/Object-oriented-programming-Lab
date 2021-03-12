/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Ailas
 */
public class Student extends Person{
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

       public Student() {
       
    }
    public Student(int status) {
        this.status = status;
    }

    public Student(int status, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

   
    
    

    @Override
    public String toString() {
        
        switch (this.status) {
            case 1:
                return super.toString()+"Student{"+"status=" +"FRESHMAN"+ '}';
            case 2:
                return super.toString()+"Student{"+"status=" +"SOPHOMORE"+ '}';
            case 3:
                return super.toString()+"Student{"+"status=" +"JUNIOR"+ '}';
            case 4:
                return super.toString()+"Student{"+"status=" +"SENIOR"+ '}';
            default:
                break;
        }
        return null;
    }

   
    
    
    
    
}
