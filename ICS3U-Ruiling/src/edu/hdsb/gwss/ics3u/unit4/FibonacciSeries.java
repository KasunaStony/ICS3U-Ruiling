/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit4;

/**
 *
 * @author maruiling
 */
///*
//Name: Ruiling Ma
//Date: Apr 3 2017
//Version: 1.0
//Description: print the first twenty terms of the Fibonacci series
//*/
public class FibonacciSeries {
    
    public static void main(String args[]){
        //print message to user
        System.out.println("Fibonacci Series\n");
        System.out.println("This program will print the first twenty terms of the Fibonacci series.\n");
        
        //the first two numbers
        int a = 1;
        int b = 1;
        //print the first two number 
        System.out.print(a + " " + b + " ");
        int c;
        //print the rest of 20
        for(int i = 0; i < 18; i++){
            //the sum of two previous number
            c = a + b;
            //print the sum
            System.out.print(c + " ");
            //change a to b, b to c
            a = b;
            b = c;
        }
    }
    
}
