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
Description: caculate the amount of food and the number of animals
*/
import java.util.*;
public class LabAnimals {
    
    public static void main(String args[]){
        //scanner objest to read input
        Scanner input = new Scanner(System.in);
        //print message to user
        System.out.println("Lab Animals\n");       
        System.out.println("At present there are X animals in the lab and enough food for Y animals. \nAt the end of every hour the population doubles, and enough food is added \nto z more animals. During hour the animals will eat enough \nfood for only themselves, The program will determine when the population \nwill outgrow the food subply.\n");
        //get user input
        System.out.print("Enter the initial population(X): ");
        int pop = input.nextInt();
        System.out.println();
        System.out.print("Enter the initial food supply(Y): ");
        int food = input.nextInt();
        System.out.println();
        System.out.print("Enter the amount of food added each hour(Z): ");
        int add = input.nextInt();
        System.out.println();
        
        //the difference of food and population
        int more = food - pop;
        
        //title of table
        System.out.printf("%-5s | %-15s | %-12s | %-12s | %-12s | ", "Hour", "Animal at Start", "Food at Start", "Food at End", "Animal at End");
        System.out.println();
        
        int oldPop;
        int oldFood;
        //print the table
        for(int i = 1; more >= 0; i++){
            //copy the original pop and food
            oldPop = pop;
            oldFood = food;
            //pop gets double, add the increases of food
            pop *= 2;
            food += add;
            //caculate the difference between food and pop
            more = food - pop;
            //if fodd is less than pop, break the loop
            if(more < 0)break;
            //print table
            System.out.printf("%-5s    %-15s    %-12s    %-12s    %-12s ", i, oldPop, oldFood, food, pop);
            System.out.println();
            
        }
    }
    
}
