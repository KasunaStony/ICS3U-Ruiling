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
Description: calculate if the three sides can make a triangle or not
*/
import java.util.*;
public class Triangle {
    
    public static void main(String args[]){
        //Scanner to read user input
        Scanner input = new Scanner(System.in);
        
        //print message to user
        System.out.println("Triangle \n");
        System.out.println("Three numbers represent the sides of a triangle when the sum of any \ntwo sides is greater than the third side. This program has the user enter /nthree lengths of sides and determines whether the figure is a triangle or \nnot.\n");
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
        
        //if any two sides add togther is greater than the third side, it is a triangle
        if(side1 + side2 > side3 && side3 + side2 > side1 && side1 + side3 > side2)
            System.out.println("These sides can make a triangle.");
        else
            System.out.println("These sides can't make a triangle");
                 
    }
    
}
