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
Description: demonstrates the result of adding some numbers
*/
import java.math.*;
public class CloserToTwo {
    
    public static void main(String args[]){
        //print message to user
        System.out.println("Closer To Two");
        System.out.println("This program demonstrates that the result of adding the numbers 1, 1/2, \n1/4, 1/8, 1/16, ... and so on gets closer and closer to 2 without becoming 2.\n");
        //the result after each adding, initial as 0
        double result = 0;
        double oldresult;
        //print the result
        for(int i = 0; result < 2; i++){
            //copy the original result
            oldresult = result;
            //caculate the new result
            result += 1/Math.pow(2, i);
            //if the result is 2, break the loop
            if(result == 2)break;
            //print the result
            System.out.println(oldresult + " + " + "1/" + (int)Math.pow(2, i) + " = " + result);
        }
    }
    
}
