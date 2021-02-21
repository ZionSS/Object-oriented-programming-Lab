/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Ailas
 */
import java.util.List;
import java.util.ArrayList;
public class Course {
    private List<String> studentName=new ArrayList<String>();
    private String courseName;
    private int studentAmount=studentName.size();
    
    Course(String courseName){
        this.courseName=courseName;
    }
    void setStudent(String name)
    {
        studentName.add(name);
    }
    void getStudent()
    {
        for(int i=0;i<studentName.size();i++)
        System.out.println("Student Name:"+studentName.get(i));
    }
    int getAmountOfStudent()
    {
        return studentName.size();
    }
    void clear()
    {
        studentName.clear();
    }
    void dropStudent(String name)
    {
        for(int i =0;i<=studentAmount;i++)
        {
            if(studentName.get(i).equals(name))
            {
                studentName.remove(i);
            }
        }
    }
}
