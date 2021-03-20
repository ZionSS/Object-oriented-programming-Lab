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
public class Person {
    String name;
    public Person() {
       
    }
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
}
class Student extends Person{
    int id;

    public Student() {
       
    }
    
    public Student(int id, String name) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" + "id=" + id + '}';
    }
    
}
class Faculty extends Person{
    String title;

    public Faculty() {
    }
    
    public Faculty(String title, String name) {
        super(name);
        this.title = title;
    }
    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty{" + "title=" + title + '}';
    }
    
}