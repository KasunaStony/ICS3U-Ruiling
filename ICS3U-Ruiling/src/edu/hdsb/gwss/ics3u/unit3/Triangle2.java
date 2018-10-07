/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit3;

/**
 *
 * @author maruiling
 */
/*
Name: Ruiling Ma
Date: Mar 22 2017
Version: 1.0
Description: calculate if the three sides can make a right triangle or not
*/
import java.util.*;
public class Triangle2 {
    
    public static void main(String args[]){
        //Scanner to read user input
        Scanner input = new Scanner(System.in);
        
        //print message to user
        System.out.println("Right Triangle\n");
        System.out.println("A right-angled triangle has the property that when the values of the lengths \nof the sides are squared, the sum of two smaller values in equal to the \nlarger value. This program asks the user to enter three values and then \ndetermines whether the triangle created is a right-triangle or not. \n");
        System.out.print("Enter the length of side 1: ");
        //read user input
        int side1 = input.nextInt();
        System.out.println();
        System.out.print("Enter the length of side 2: ");
        //read user input
        int side2 = input.nextInt();
        System.out.println();
        System.out.print("Enter the length of side 3: ");
        //read user input
        int side3 = input.nextInt();
        System.out.println();
        
        //if there the sum of square of two sides is equal to the square of the third side, it is a right triangle
        if(side1 * side1 + side2 * side2 == side3 * side3||side1 * side1 + side3 * side3 == side2 * side2||side3 * side1 + side3 * side2 == side1 * side1)
            System.out.println("These sides will make a right triangle.");
        else
            System.out.println("These sides will not make a right triangle.");
    }
    
}
