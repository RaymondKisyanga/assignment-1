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
public class Question2 {
   public static void main (String[]args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Input first number:");
       int num1 = scan.nextInt();
       System.out.print("Input second number:");
       int num2 = scan.nextInt();
       System.out.println("Expected Output:");
       System.out.println(num1 + num2);
       System.out.println(num1 - num2);
       System.out.println(num1 * num2);
       System.out.println(num1 / num2);
       System.out.println(num1 % num2);
   }
    
}
