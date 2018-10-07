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
Date: Apr 21 2017
Version: 1.0
Description: convert standard and traditional time
 */
import java.util.*;
import java.util.regex.*;

public class StandardTime {

    /**
     * Precondition: time is a String of a standard time with a format like
     * 12:00(/d/d./d/d) Postcondition: return a String of converted String of a
     * traditional time
     *
     * @param time
     * @return a String of converted time
     */
    public static String convertToTraditional(String time) {

        //postfix of a traditional time(AM for PM)
        String postfix;
        //the hour of the time
        String hours = time.substring(0, 2);
        //the minute of the time
        String min = time.substring(3, 5);
        //the standard time 00:** is 12:** AM in traditional time
        if (hours.equals("00")) {
            hours = "12";
            postfix = "AM";
        } //the standard time 12:** won't change when convert to tranditional time expect the extra "PM"
        else if (hours.equals("12")) {
            postfix = "PM";
        } //normal condition
        else {
            //cast a String to a int
            int hour = Integer.parseInt(hours);
            //hour stay the same if it's smaller than 12
            if (hour < 12) {
                //it's morning
                postfix = "AM";
            } //hour - 12 if it's afternoon
            else {
                hour -= 12;
                //chang hours to the new hour
                hours = String.valueOf(hour);
                //it's afternoon
                postfix = "PM";
            }
        }
        //return the String of traditional time
        return hours + ":" + min + " " + postfix;
    }

    /**
     * Precondition: time is a String of a traditional time like:
     * 12:00PM(/d/d./d/d[APMapm][APMapm]) Postcondition: return a String of
     * converted standard time
     *
     * @param time
     * @return a String of converted time
     */
    public static String convertToStandardTime(String time) {
        //read the time separatly
        String postfix = time.substring(5);
        String hours = time.substring(0, 2);
        String min = time.substring(3, 5);
        //check it's AM or PM
        if (postfix.equalsIgnoreCase("AM")) {
            //if it's 12:**AM, chang hours to 00
            if (hours.equals("12")) {
                hours = "00";
            }
        } else //if it's a PM time and not 12:**PM, hours plus 12
        if (!hours.equals("12")) {
            hours = String.valueOf(Integer.parseInt(hours) + 12);
        }
        //return the String of converted time
        return hours + ":" + min;

    }

    /**
     * Read User input of time and print the converted time in console
     */
    public static void convert() {
        //to read user input
        Scanner input = new Scanner(System.in);

        //read user input
        System.out.print("Please enter a standard time: ");
        String time1 = input.next();
        //a Pattern to check the format of the time
        Pattern p = Pattern.compile("\\d\\d.\\d\\d");
        //a Matcher to compare the format
        Matcher m = p.matcher(time1);
        //a boolean of the result of the compartion
        boolean b = m.matches();
        //deal with the wrong format input
        while (!b) {
            //re-read user input
            System.out.print("Please enter a valued time (notice that \nthe standard should look like \"12:00\"): ");
            time1 = input.next();
            //renew Matcher
            m = p.matcher(time1);
            b = m.matches();
        }
        //if the format is correct, read the hour and min for the time to int
        int hour = Integer.valueOf(time1.substring(0, 2));
        int min = Integer.valueOf(time1.substring(3, 5));
        //check if they are unreasonalble
        while (hour < 0 || hour > 23 || min < 0 || min > 59) {
            //re-read user input
            System.out.print("Please enter a valued time: ");
            time1 = input.next();
            //renew hour and min
            hour = Integer.valueOf(time1.substring(0, 2));
            min = Integer.valueOf(time1.substring(3, 5));
        }
        //print message and result of convertion
        System.out.print("Tranditional Time: ");
        System.out.println(convertToTraditional(time1));
        System.out.println();
        
        //read user input
        System.out.print("Please enter a tranditional time: ");
        String time2 = input.next();
        //change the regular expression of the pattern to the tranditional time format
        p = Pattern.compile("\\d\\d.\\d\\d[APMapm][APMapm]");
        //change the matcher and boolean
        m = p.matcher(time2);
        b = m.matches();
        //deal with the wrong format input
        while (!b) {
            //re-read user input
            System.out.print("Please enter a valued time (notice that \nthere should be no space between the time and the AM or PM): ");
            time2 = input.next();
            //renew the matcher
            m = p.matcher(time2);
            b = m.matches();
        }
        
         //if the format is correct, read the hour and min for the time to int
        hour = Integer.valueOf(time2.substring(0, 2));
        min = Integer.valueOf(time2.substring(3, 5));
        //check if they are unreasonalble
        while (hour < 0 || hour > 12 || min < 0 || min > 59) {
            //re-read user input
            System.out.print("Please enter a valued time: ");
            time2 = input.next();
            //renew hour and min
            hour = Integer.valueOf(time2.substring(0, 2));
            min = Integer.valueOf(time2.substring(3, 5));
        }
        //print message and the converted time
        System.out.print("Standard Time: ");
        System.out.println(convertToStandardTime(time2));

    }

    public static void main(String args[]) {
        //invoke
        convert();

    }

}
