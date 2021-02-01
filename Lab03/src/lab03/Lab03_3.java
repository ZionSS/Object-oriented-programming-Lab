/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Ailas
 */
import java.util.Random;
import java.util.Scanner;
public class Lab03_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int size ;
       int ran = (int) ((Math.random() * 2));
       boolean flag = false;
       int rowCheck = 0;
       int columnCheck = 0;
       int diagonalCheck =0;
       int superdiagonalCheck = 0;
       int subdiagonalCheck = 0;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size for the matrix:");
        size=scanner.nextInt();
        int[][] matrix= new int[size][size];
        for(int i = 0;i< size;i++)
        {
            for(int j = 0;j<size;j++)
            {
                ran = (int) ((Math.random() * 2));
                matrix[i][j]=ran;
            }
        }
        for(int i = 0;i< size;i++)
        {
            for(int j = 0;j<size;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i = 0;i<size;i++) // Row
        {
            for(int j = 0;j<size;j++)
            {
                if(matrix[i][0]==matrix[i][j])
                {
                  flag=true;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                {
                    if(matrix[i][0]==0)
                    System.out.println("All 0s on row "+(i+1));
                else if(matrix[i][0]==1)
                    System.out.println("All 1s on row "+(i+1));
                    rowCheck++;
                }
        }
        for(int i = 0;i<size;i++) //Column
        {
            for(int j = 0;j<size;j++)
            {
                if(matrix[0][i]==matrix[j][i])
                {
                  flag=true;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                {
                    if(matrix[0][i]==0)
                    System.out.println("All 0s on column "+(i+1));
                else if(matrix[0][i]==1)
                    System.out.println("All 1s on column "+(i+1));
                    columnCheck++;
                }
        }
        for(int i = 0;i<size;i++) //Superdiagonal
        {
            for(int j = 0;j<size;j++)
            {
                if(i==j-1)
                {
                  if(matrix[0][1]==matrix[i][j])
                    {
                        flag=true;
                    }
                    else
                    {
                        flag=false;
                        break;
                    }  
                }
                
            } 
             if(!flag)
                break;
            
        }
        if(flag)
                {
                    if(matrix[0][1]==0)
                    System.out.println("All 0s on the superdiagonal");
                else if(matrix[0][1]==1)
                    System.out.println("All 1s on the superdiagonal");
                    superdiagonalCheck++;
                }
        for(int i = 0;i<size;i++) //Diagonal
        {
            for(int j = 0;j<size;j++)
            {
                if(i==j)
                {
                  if(matrix[0][0]==matrix[i][j])
                    {
                        flag=true;
                    }
                    else
                    {
                        flag=false;
                        break;
                    }  
                }
                
            }
            if(!flag)
                break;
        }
        if(flag)
                {
                    if(matrix[0][0]==0)
                    System.out.println("All 0s on the diagonal");
                else if(matrix[0][0]==1)
                    System.out.println("All 1s on the diagonal");
                    diagonalCheck++;
                }
        for(int i = 0;i<size;i++) //Supdiagonal
        {
            for(int j = 0;j<size;j++)
            {
                if(i-1==j)
                {
                  if(matrix[1][0]==matrix[i][j])
                    {
                        flag=true;
                    }
                    else
                    {
                        flag=false;
                        break;
                    }  
                }
                
            }
             if(!flag)
                break;
            
        }
        if(flag)
                {
                    if(matrix[1][0]==0)
                    System.out.println("All 0s on the subdiagonal");
                else if(matrix[1][0]==1)
                    System.out.println("All 1s on the subdiagonal");
                    subdiagonalCheck++;
                }
        if(rowCheck==0)
            {
                System.out.println("No same numbers on a row");
            }
        if(columnCheck==0)
            {
                System.out.println("No same numbers on a column");
            }
        if(superdiagonalCheck==0)
            {
                System.out.println("No same numbers on the superdiagonal");
            }
        if(diagonalCheck==0)
            {
                System.out.println("No same numbers on the diagonal");
            }
        if(subdiagonalCheck==0)
            {
                System.out.println("No same numbers on the subdiagonal");
            }
                 
    }
    
}
