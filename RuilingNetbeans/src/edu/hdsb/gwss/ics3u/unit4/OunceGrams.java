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
/*
Name: Ruiling Ma
Date: Apr 3 2017
Version: 1.0
Description: convert ounces to grams 
*/
public class OunceGrams {
    
    public static void main(String args[]){
        //print message to user
        System.out.println("Ounce to Grams Conversion Chart\n");
        System.out.println("This program will print out a titled that can be used to convert\nounce to grams, for value 1 to 15.\n ");
        System.out.format("%-7s %-7s", "Ounces","Grams");
        System.out.println();
        
        //conversion coefficient
        final double CONVERSION = 28.35;
        
        //print the conversion 1 to 15
        for(int i = 1; i <= 15; i++){
            System.out.printf("%-7s %-4.2f", i, (i * CONVERSION));
            System.out.println();
            
        }
            
    }
    
}
