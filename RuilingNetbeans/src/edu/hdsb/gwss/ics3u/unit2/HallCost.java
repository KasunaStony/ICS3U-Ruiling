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
public class HallCost {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        final int hallR = 350;
        
        System.out.print("Plese enter your name: ");
        String name = input.nextLine();
        System.out.print("Plese enter the number of guests: ");
        int numGuest = input.nextInt();
        System.out.print("Plese enter the cost per person: ");
        double pCost = input.nextDouble();
        System.out.println(name + ", your total cost is " + (numGuest*pCost + hallR));
    }
    
}
