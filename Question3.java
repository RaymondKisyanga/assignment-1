/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Raymond Kisyang'a
 */
import java.util.Scanner;
public class Question3 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.print("Input first integer:");
        num1 = scan.nextInt();
        
        System.out.print("Input second integer:");
        num2 = scan.nextInt();
        
        if (num1 == num2)
            System.out.println("Equal");
        if ( num1 != num2)
            System.out.println("Not equal");
    }
    
}
