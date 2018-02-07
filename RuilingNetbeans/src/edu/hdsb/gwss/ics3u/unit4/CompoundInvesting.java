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
Description: caculate the interest of the investing
*/
import java.util.*;
public class CompoundInvesting {
    
    public static void main(String args[]){
        //scanner object to read input
        Scanner input = new Scanner(System.in);
        //print message to user
        System.out.println("Compound Inversing\n");
        System.out.println("This program will print out a table that will display the amount of\nyearly investment over a period of up to 15 years.\n");
        //get user input
        System.out.print("Enter yearly investment: ");
        double invest = input.nextDouble();
        System.out.println();
        System.out.print("Enter the interest rate(%): ");
        double rate = input.nextDouble();
        System.out.println();
        System.out.print("Enter the number of years: ");
        int year = input.nextInt();
        System.out.println();
        //the title of table
        System.out.printf("%-7s %-25s %-17s %-10s", "Year", "Amount in account", "Interest", "Total");
        System.out.println();
        
        double oldinvest;
        double interest;
        //print the investing for each year
        for(int i = 1; i <= year; i++){
            //copy the original invest
            oldinvest = invest;
            //the interest each year
            interest = rate/100 * invest;      
            //new invest
            invest += interest;
            //print the table
            System.out.printf("%-12s $%-20.2f $%-15.2f $%-10.2f", i, oldinvest, interest, invest);
            System.out.println();
        }
    }
    
}
