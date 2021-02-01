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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Lab03_2 {
    public static int[] merge(int[] list1, int[] list2){
        int[] res = new int[list1.length+list2.length];
        System.arraycopy(list1, 0, res, 0, list1.length);
        System.arraycopy(list2, 0, res, list1.length, list2.length);
        return res;
}
    public static void main(String[] args) {
        String a,b;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter list1: ");
        a = cin.nextLine();
        System.out.print("Enter list2: ");
        b = cin.nextLine();
        String a1[] = a.split(" ");
        String b1[] = b.split(" ");
        int a2[] = new int[a1.length];
        int b2[] = new int[b1.length];
        for(int i=0;i<a1.length; i++){
            a2[i] = Integer.parseInt(a1[i]);
        }
        for(int i=0;i<b1.length; i++){
            b2[i] = Integer.parseInt(b1[i]);
        }
        int answer[] = merge(a2,b2);
        Arrays.sort(answer);
        System.out.print("The merged list is ");
        for(int i:answer){
        System.out.print(i+" ");
        }
    }
  }
