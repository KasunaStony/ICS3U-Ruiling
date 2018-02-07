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
import java.util.*;
public class LeapYear {
    
    public static void main(String args[]){
        
        //Scanner to read user input
        Scanner input = new Scanner(System.in);
        //print message
        System.out.print("Please enter the year you want to determine if it is a leap year: ");
        //read user input
        int year = input.nextInt();
        //if the year is divisible by 4 and not divisible by 100 or it's divisible by 400, it is a leap year 
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
            
            System.out.println(year + " is a leap year.");
        else
            
            System.out.println(year + " is not a leap year.");
                    
       
        
    }
    
}
