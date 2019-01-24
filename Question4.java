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
public class Question4 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input a degree in Fahreneheit:");
        double fahrenheit = scan.nextDouble();
        double celsius = (( 5*(fahrenheit - 32.0))/9.0);
        System.out.println("Expected Output:");
        System.out.println(fahrenheit + "degree Fahrenheit is equal to" + celsius + "in Celsius");
    }
    
}
