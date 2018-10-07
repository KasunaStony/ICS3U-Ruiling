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
Description: calculate the cost of sending a letter
*/
import java.util.*;
import java.text.NumberFormat;
public class LetterCost {
    
    public static void main(String args[]){
        //Scanner to read user input
        Scanner input = new Scanner(System.in);
        //NumberFormat to format the money
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //print message to user
        System.out.println("Cost of Mailing a letter\n");
        System.out.println("This program will calculate the cost of sending a first class or second \nclass letter depending on the mass of letter\n");
        System.out.print("Enter Letter Class (1 for first class, 2 for second class): ");
        
        //read user input
        int letterClass = input.nextInt();
        System.out.println();
        
        //read user input
        System.out.print("Enter the mass of letter (in grams): ");
        int mass = input.nextInt();
        
        //a double var for cost
        double cost = 0;
        
        //switch for the class of letter
        switch (letterClass){
            //when it is the first class
            case 1:
                //determine the cost by mass
                if(mass <= 30)
                    cost = 0.40;
                else if(mass > 30 && mass <= 50)
                    cost = 0.60;
                else if(mass > 50 && mass <= 100)
                    cost = 0.80;
                else{
                    cost = 0.80;
                    mass -= 100;
                    while(mass > 0){
                        cost += 0.25;
                        mass -= 50;
                    }
                }               
                break;
            //when it is the second class
            case 2:
                //determine the cost by mass
                if(mass <= 30)
                    cost = 0.30;
                else if(mass > 30 && mass <= 50)
                    cost = 0.50;
                else if(mass > 50 && mass <= 100)
                    cost = 0.60;
                else{
                    cost = 0.60;
                    mass -= 100;
                    while(mass > 0){
                        cost += 0.20;
                        mass -= 50;
                    }
                }               
                break;
                
                    

        }
        //print the cost of sending the letter
        System.out.println("\nThe cost of sending a letter is: " + money.format(cost));
                
    }
    
}
