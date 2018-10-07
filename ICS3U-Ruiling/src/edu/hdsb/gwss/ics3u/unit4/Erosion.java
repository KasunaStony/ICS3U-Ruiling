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
Description: caculate the number of years of erosion
*/
public class Erosion {
    
    public static void main(String args[]){
        //print message to user
        System.out.println("Topsoil Erosion\n");
        
        System.out.println("Careless land management causes approximately 1 percent of the topsoil to erode \neach year. It is then lost forever, since it takes nature approximately \n500 years to produce 2.5 cm of topsoil. At 9 cm the topsoil is so shallow \nthat crops cannot be grown on a large scale. If Canada has about 30 cm of \ntopsoil, how many years will it take for the depth to be reduced to 9 cm?\n");
        
        //the groth rate each year 
        final double GROW_EACH_YEAR = 2.5/500;
        //the original thickness of soil
        double soil = 30;
        //the number of years
        int year = 0;
        //if the soil is still thicker than 9, contiune looping
        while(soil > 9){     
            //the erosion of soil
            soil -= 0.01 * soil;
            //the growth of soil
            soil += GROW_EACH_YEAR;
            //add one year
            year++;
        }
        //print the result
        System.out.println("It will take " + year + " years for the soil to erode to a depth such that crops \nwill not grow");
    }
    
}
