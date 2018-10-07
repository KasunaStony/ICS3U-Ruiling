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
public class ISBNChecker {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        final int First10 = 91;
        
        System.out.print("Digit 11? ");
        int D11 = input.nextInt();
        System.out.print("Digit 12? ");
        int D12 = input.nextInt();
        System.out.print("Digit 13? ");
        int D13 = input.nextInt();
        
        System.out.println("The 1-3-sum is " + (First10 + D11 * 1 + D12 * 3 + D13 * 1));
    }
    
    
}
