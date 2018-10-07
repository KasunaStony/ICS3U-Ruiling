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
public class TipCalculator {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the subtotal and the gratuity rate: ");
        double sub = input.nextDouble();
        double rate = input.nextDouble();
        System.out.println("The gratuity is " + (sub * rate * 0.01) + " and total is " + (sub * 1 + sub*rate*0.01));
        
    }
    
}
