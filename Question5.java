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
public class Question5 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1st integer:");
        int num1 = scan.nextInt();
        System.out.print("Input 2nd integer:");
        int num2 = scan.nextInt();
        
        System.out.println("Expected Output:");
        System.out.printf("Sum of two integers: %d%n", num1 +num2);
        System.out.printf("Difference of two integers: %d%n", num1 - num2);
        System.out.printf("Product of two integers: %d%n", num1 * num2);
        System.out.printf("Average of two integers: %.2f%n",(double) (num1 + num2)/2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(num1 - num2));
        System.out.printf(("Max integer:%d%n"), Math.max(num1, num2));
        System.out.printf("Min integer:%d%n", Math.min(num1, num2));
        
    }
    
}
