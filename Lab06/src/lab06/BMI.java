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
public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inch;
    private double height;
    private double bmi;
    
    
    BMI(String name,int age,double weight,double feet,double inch){
            this.name=name;
            this.age=age;
            this.feet=feet;
            this.inch=inch;
    }
    
    void setName(String newName)
    {
        this.name=newName;
    }
    void setAge(int newAge)
    {
        this.age=newAge;
    }
    void setWeight(double newWeight)
    {
        this.weight=newWeight;
    }
    void setFeet(double newFeet)
    {
        this.feet=newFeet;
    }
    void setInch(double newInch)
    {
        this.inch=newInch;
    }
    String getName(){
        return name;
    }
    int getAge()
    {
        return age;
    }
    double getWeight()
    {
        return weight*0.45359237;
    }
    double getHeight()
    {
        return height=feet*0.3048+inch*0.0254;
    }
    
    public double getBMI(){
        double bmi;
        height=feet*0.3048+inch*0.0254;
        bmi=(weight*0.45359237)/(height*height);
        this.bmi=bmi;
        return bmi;
    }
    public String getInterpretation()
    {
        if(this.bmi<18.5)
            return "UnderWeight";
        else if(this.bmi<25.0&&this.bmi>=18.5)
            return "Normal";
        else if(this.bmi<30.0&&this.bmi>=25.0)
            return "Overweight";
        else if(this.bmi>=30.0)
            return "Obese";
        return null;
    }
}
