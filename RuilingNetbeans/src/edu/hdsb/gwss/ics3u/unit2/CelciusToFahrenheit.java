/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit2;

/**
 *
 * @author maruiling
 */
/*
Name: Ruiling Ma
Date: Feb 24
Version: 1.0
*/
import java.util.*;
public class CelciusToFahrenheit {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        final double fator = 1.8;
        final int b = 32;
        
        System.out.print("Please enter a degree in Celcius: ");
        double c = input.nextDouble();
        System.out.println(c + "Celcius is " + (c * 1.8 + 32) + " in Fahrenheit.");
          
        
        
    }
}
