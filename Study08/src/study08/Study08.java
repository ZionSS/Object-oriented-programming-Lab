/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study08;

/**
 *
 * @author Ailas
 */
public class Study08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student(63010631,"Aranya");
        Faculty f1 = new Faculty("Lecturer","Somsak");
        
        //System.out.println(s1.toString());
       // System.out.println(f1.toString());
       Person s2 = new Person();
       Person s3 = new Student();
       Person s4 = new Faculty();
       
       Student s5 =(Student)s2;
       display(s1);
       display(f1);
       display(s1);
    }
    static void display(Student s)
    {
        s.toString();
    }
    static void display(Faculty f)
    {
        f.toString();
    }
    static void display(Person p)
    {
        p.toString();
    }
}
