/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Ailas
 */
public class Lab07_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String menu;
       menu = scan.nextLine();
       if("Student".equals(menu))
       {
           Student s1 = new Student();
           System.out.print("Name: ");
           s1.setName(scan.nextLine());
           System.out.print("Address: ");
           s1.setAddress(scan.nextLine());
           System.out.print("Phone: ");
           s1.setPhoneNumber(scan.nextLine());
           System.out.print("Email: ");
           s1.setEmailAddress(scan.nextLine());
           System.out.print("Status: ");
           s1.setStatus(scan.nextInt());
           
           System.out.println(s1.toString());
       }
       else if("Employee".equals(menu))
       {
           Employee e1 = new Employee();
           System.out.print("Name: ");
           e1.setName(scan.nextLine());
           System.out.print("Address: ");
           e1.setAddress(scan.nextLine());
           System.out.print("Phone: ");
           e1.setPhoneNumber(scan.nextLine());
           System.out.print("Email: ");
           e1.setEmailAddress(scan.nextLine());
           System.out.print("Office: ");
           e1.setOffice(scan.nextLine());
           System.out.print("Salary: ");
           e1.setSalary(scan.nextDouble());
           System.out.print("Date Hired: "+e1.getDateHired());
           e1.setDateHired();
           
           System.out.println(e1.toString());
       }
       else if("Faculty".equals(menu))
       {
           Faculty f1 = new Faculty();
           System.out.print("Name: ");
           f1.setName(scan.nextLine());
           System.out.print("Address: ");
           f1.setAddress(scan.nextLine());
           System.out.print("Phone: ");
           f1.setPhoneNumber(scan.nextLine());
           System.out.print("Email: ");
           f1.setEmailAddress(scan.nextLine());
           System.out.print("Office: ");
           f1.setOffice(scan.nextLine());
           System.out.print("Salary: ");
           f1.setSalary(scan.nextDouble());
           scan.nextLine();
           System.out.print("Date Hired: ");
           f1.setDateHired();
           System.out.println(f1.getDateHired());
           System.out.print("Office Hours: ");
           f1.setOfficeHours(scan.nextInt());
            scan.nextLine();
           System.out.print("Rank: ");
           f1.setRank(scan.nextLine());
           
           System.out.println(f1.toString());
       }
       else if("Staff".equals(menu))
       {
           Staff t1 = new Staff();
            System.out.print("Name: ");
           t1.setName(scan.nextLine());
           System.out.print("Address: ");
           t1.setAddress(scan.nextLine());
           System.out.print("Phone: ");
           t1.setPhoneNumber(scan.nextLine());
           System.out.print("Email: ");
           t1.setEmailAddress(scan.nextLine());
           System.out.print("Office: ");
           t1.setOffice(scan.nextLine());
           System.out.print("Salary: ");
           t1.setSalary(scan.nextDouble());
           scan.nextLine();
           System.out.print("Date Hired: ");
           t1.setDateHired();
           System.out.println(t1.getDateHired());
           System.out.print("Title: ");
           t1.setTitle(scan.nextLine());
           
           System.out.println(t1.toString());
       }
    }
    
}
