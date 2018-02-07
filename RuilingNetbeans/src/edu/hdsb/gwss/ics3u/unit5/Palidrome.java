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
Description: check if a word is palidrome
 */
import java.util.*;

public class Palidrome {
     
    /**
     * Read user input from Output
     * Print the result of checking a word is palidrome or not
     */
    public static void checkPalidrome(){
        //scanner to read user input
        Scanner input = new Scanner(System.in);
        //boolean to check the word
        boolean check = true;
        //print message
        System.out.println("Palidrome\n");
        System.out.println("Words are the same forwards and backwards are called palidromes. This program determine if a word is a palidrome.\n");
        System.out.print("Enter a word: ");
        //read user input
        String str = input.next();
        System.out.println();
        //a StringBuilder to reverse the word        
        StringBuilder reverseStr = new StringBuilder(str);
        //reverse the word 
        reverseStr.reverse();
        //create a new String based on the reversed word
        String compare = new String(reverseStr);
        //compare the original word with the reversed one, ignore case
        if(!str.equalsIgnoreCase(compare))
            //set check to false if not match
            check = false;
        //print the backwards of the word
        System.out.println(str + " backwards is " + compare);
        //print the result
        if(check)
            System.out.println(str + " is a palidrome");
        else
            System.out.println(str + " is not a palidrome");
    }
    
    public static void main(String args[]){
       //invoke the method
       checkPalidrome();
       
    }
    
}
