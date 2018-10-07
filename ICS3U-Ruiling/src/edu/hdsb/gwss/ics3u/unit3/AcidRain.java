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
Description: determine the pH level is good for fish or not
*/
import java.util.*;
public class AcidRain {
    
    public static void main(String args[]){
        //Scanner to read user input
        Scanner input = new Scanner(System.in);
        
        //print message to user
        System.out.println("Acid Rain \n");  
        System.out.println("Acid Rain is an environmental problem. This problem determines if the pH level in \nwater is safe for fish. \n");
        System.out.print("Enter a pH level: ");
        
        //read user input
        int pH  = input.nextInt();
        System.out.println();
                
        //deal with unvalied input
        while(pH < 0 || pH > 14){
           System.out.print("Please enter a value pH level: ");
           pH = input.nextInt();
           System.out.print("\n");
        }
       
        //determine the pH level is neutral or acidic or alkaline
        if(pH >= 6.4 && pH <= 7.4)
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        else if(pH < 6.4)
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        else 
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
                  
                   
            
    }
    
}
