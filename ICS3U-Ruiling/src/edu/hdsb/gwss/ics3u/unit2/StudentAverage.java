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
public class StudentAverage {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Plese enter your name: ");
        String name = input.nextLine();
        System.out.print("Plese enter your marks for your four subjects: ");
        double Sub1 = input.nextDouble();
        double Sub2 = input.nextDouble();
        double Sub3 = input.nextDouble();
        double Sub4 = input.nextDouble();
        System.out.print(name + ", your average is " + ((Sub1 + Sub2 + Sub3 + Sub4)/4));
        
    }
    
}
