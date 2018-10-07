/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit5;

/**
 *
 * @author maruiling
 */
/*
Name: Ruiling Ma
Date: Apr 21 2017
Version: 1.0
Description: reduce fraction
 */
import java.util.*;

public class ReduceFraction {
    /**
     * Uses Euclidean algorithm to calculate the GCD of a and b
     * Precondition: a, b are integer and b doesn't equal zero
     * Postcondition: return the GCD of a and b
     * @param a is the first number
     * @param b is the second number
     * @return the greatest common divisor of a and b
     */
    public static int gcd(int a, int b) {
        //two temporary int for exchange value
        int temp, t;
        //change a and b to absolute value
        a = Math.abs(a);
        b = Math.abs(b);
        //exchange a and b if a is smaller than b
        if (a < b) {
            
            t = a;
            a = b;
            b = t;
            
        }
        //use Euclidean algorithm
        while (a % b != 0) {
            
            temp = a;
            a = b;
            b = temp % b;
            
        }
        //return the result
        return b;
        
    }
    
    /**
     * Read user input and print out the reduced fraction in console
     */
    public static void reduceFraction() {
        //to read user input
        Scanner input = new Scanner(System.in);
        //print message
        System.out.println("Reduce Fraction\n");
        System.out.println("This program will reduce a fraction to the lowest term\n");
        //read user input of numerator
        System.out.print("Enter the Numerator: ");
        int numerator = input.nextInt();
        System.out.println();
        //read user input of denominator
        System.out.print("Enter the Denominator: ");
        int denominator = input.nextInt();
        //a denominator cannot be 0
        while(denominator == 0){
            System.out.print("Please re-enter the denominator (hint: a denominator cannot be 0): ");
            denominator = input.nextInt();
        }
        
        System.out.println();
        //both numerator and denominator divide by the gcd of them
        int newNum = numerator / gcd(numerator, denominator);
        int newDen = denominator / gcd(numerator, denominator);
        //print the reduced fraction
        System.out.println(numerator + "/" + denominator + " can be reduced to " + newNum + "/" + newDen);

    }

    public static void main(String args[]) {
        //invoke
        reduceFraction();

    }

}
