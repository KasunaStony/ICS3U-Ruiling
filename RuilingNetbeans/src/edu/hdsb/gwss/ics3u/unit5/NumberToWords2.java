/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit5;

/**
 *
 * @author maruiling
 */
/*
Name: Ruiling Ma
Date: Apr 11 2017
Version: 1.0
Description: Change numbers to words
 */
import java.util.Scanner;

public class NumberToWords2 {
    
    public static void numberToWord() {
        //scanner to read input
        Scanner input = new Scanner(System.in);
        //message
        System.out.print("Please Enter A Number Between 1 to 999: ");
        //read input        
        int n = input.nextInt();
        //deal with invalid input
        while (n < 1 || n > 999) {
            System.out.print("Please enter a number between 1 to 999:");
            n = input.nextInt();
        }
        //name of the number
        String name = "";
        //determine the hundreds
        switch (n / 100) {

            case 0:
                break;
            case 1:
                name += "ONE HUNDRED ";
                break;
            case 2:
                name += "TWO HUNDRED ";
                break;
            case 3:
                name += "THREE HUNDRED ";
                break;
            case 4:
                name += "FOUR HUNDRED ";
                break;
            case 5:
                name += "FIVE HUNDRED ";
                break;
            case 6:
                name += "SIX HUNDRED ";
                break;
            case 7:
                name += "SEVEN HUNDRED ";
                break;
            case 8:
                name += "EIGHT HUNDRED ";
                break;
            case 9:
                name += "NINE HUNDRED ";
                break;
        }

        //determine the decade
        switch (n / 10 % 10) {

            case 0:
                name += "AND ";
                break;
            //if the decade start with 1
            case 1:
                //determine the name of 1*
                switch (n % 100) {

                    case 10:
                        name += "TEN ";
                        break;
                    case 11:
                        name += "ELEVEN ";
                        break;
                    case 12:
                        name += "TWELVE ";
                        break;
                    case 13:
                        name += "THIRTEEN ";
                        break;
                    case 14:
                        name += "FOURTEEN ";
                        break;
                    case 15:
                        name += "FIFTEEN ";
                        break;
                    case 16:
                        name += "SIXTEEN ";
                        break;
                    case 17:
                        name += "SEVENTEEN ";
                        break;
                    case 18:
                        name += "EIGHTEEN ";
                        break;
                    case 19:
                        name += "NINETEEN ";
                        break;
                }
                break;
            case 2:
                name += "TWENTY ";
                break;
            case 3:
                name += "THIRTY ";
                break;
            case 4:
                name += "FORTY ";
                break;
            case 5:
                name += "FIFTY ";
                break;
            case 6:
                name += "SIXTY ";
                break;
            case 7:
                name += "SEVENTY ";
                break;
            case 8:
                name += "EIGHTY ";
                break;
            case 9:
                name += "NINETY ";
                break;
        }

        //determine the unit
        if (!(n / 10 % 10 == 1)) {
            switch (n % 10) {

                case 0:
                    break;
                case 1:
                    name += "ONE";
                    break;
                case 2:
                    name += "TWO";
                    break;
                case 3:
                    name += "THREE";
                    break;
                case 4:
                    name += "FOUR";
                    break;
                case 5:
                    name += "FIVE";
                    break;
                case 6:
                    name += "SIX";
                    break;
                case 7:
                    name += "SEVEN";
                    break;
                case 8:
                    name += "EIGHT";
                    break;
                case 9:
                    name += "NINE";
                    break;
            }
        }
        //print the result
        System.out.println(name);
    }

    public static void main(String args[]) {
        //invoke the method
        numberToWord();
    }
}
