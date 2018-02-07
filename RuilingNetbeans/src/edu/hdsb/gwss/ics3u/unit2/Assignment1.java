/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Name: Ruiling Ma
Date: Mar 1 2017
Version: 1.0
Description: sample input and output file is in the outer package
*/

/*
Problem from USACO Training Site:

Greedy Gift Givers

A group of NP (2 ≤ NP ≤ 10) uniquely named friends has decided to exchange gifts of money. Each of these friends might or might not give some money to 
any or all of the other friends. Likewise, each friend might or might not receive money from any or all of the other friends. Your goal in this problem 
is to deduce how much more money each person gives than they receive.
The rules for gift-giving are potentially different than you might expect. Each person sets aside a certain amount of money to give and divides this 
money evenly among all those to whom he or she is giving a gift. No fractional money is available, so dividing 3 among 2 friends would be 1 each for 
the friends with 1 left over -- that 1 left over stays in the giver's "account".
In any group of friends, some people are more giving than others (or at least may have more acquaintances) and some people have more money than others.
Given a group of friends, no one of whom has a name longer than 14 characters, the money each person in the group spends on gifts, and a (sub)list of 
friends to whom each person gives gifts, determine how much more (or less) each person in the group gives than they receive.

INPUT FORMAT

Line 1:	The single integer, NP
Lines 2..NP+1:	Each line contains the name of a group member
Lines NP+2..end:	NP groups of lines organized like this:
The first line in the group tells the person's name who will be giving gifts.
The second line in the group contains two numbers: The initial amount of money (in the range 0..2000) to be divided up into gifts by the giver and then 
the number of people to whom the giver will give gifts, NGi (0 ≤ NGi ≤ NP-1).
If NGi is nonzero, each of the next NGi lines lists the the name of a recipient of a gift.

SAMPLE INPUT 

5
dave
laura
owen
vick
amr
dave
200 3
laura
owen
vick
owen
500 1
dave
amr
150 2
vick
owen
laura
0 2
amr
vick
vick
0 0

OUTPUT FORMAT

The output is NP lines, each with the name of a person followed by a single blank followed by the net gain or loss (final_money_value - initial_money_value)
for that person. The names should be printed in the same order they appear starting on line 2 of the input.
All gifts are integers. Each person gives the same integer amount of money to each friend to whom any money is given, and gives as much as possible that 
meets this constraint. Any money not given is kept by the giver.

SAMPLE OUTPUT 

dave 302
laura 66
owen -359
vick 141
amr -150

OUTPUT EXPLANATION

Five names: dave, laura, owen, vick, amr Let's keep a table of the gives (money) each person 'has':
dave	laura	owen	vick	amr
0	0	0	0	0
First, 'dave' splits 200 among 'laura', 'owen', and 'vick'. That comes to 66 each, with 2 left over
-200+2	66	66	66	0
Second, 'owen' gives 500 to 'dave':
-198+500	66	66-500	66	0
Third, 'amr' splits 150 between 'vick' and 'owen':
302	66	-434+75	66+75	-150
Fourth, 'laura' splits 0 between 'amr' and 'vick'; no changes:
302	66	-359	141	-150
Finally, 'vick' gives 0 to no one:
dave	laura	owen	vick	amr
302	66	-359	141	-150

*/


package edu.hdsb.gwss.ics3u.unit2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author maruiling
 */



public class Assignment1 {
    //each object represents a person
    //private String var for each person's name
    private String name;
    /*
    private int var, total is the final amount of money each person have, give is the amount each person give,
    givep is the number of person each person give, back is give mod givep which the money will be back, gain is 
    the amount of money each person gain from others
    */
    private int total, give, givep, back, gain;
    
    public static void main (String [] args) throws IOException {
     
        //reader and writer object
        BufferedReader reader = new BufferedReader(new FileReader("assignment1.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("assignment1.out"));
    
  
        //StringTokenizer object
        StringTokenizer st = new StringTokenizer(reader.readLine());
    

        //number of person
        int NP = Integer.parseInt(st.nextToken());
    
        //array of people
        Assignment1 name[] = new Assignment1[NP];
        
        //initialize every object and initialize name for each object
        for(int i = 0; i < NP; i++){
        
            name[i] = new Assignment1();
            name[i].name = reader.readLine();
             
        }
    
    
        //put a mark after the names
        reader.mark(0);
    
        //c is subscript of array objects
        int c;
        //infinite loop because the name and money they give is not ordered like above
        for( ; ; ){
            //each time initial c as 0
            c = 0;
 
            //loop for NP times to check each name and their giving amount and giving person number
            for( ; c < NP; c++){
                //reset reader
                reader.reset();
                //check the name, if it's the same, read in the amount that person give and the number of person he/she give
                if ((name[c].name).equals(reader.readLine())){
                       
                    StringTokenizer q = new StringTokenizer(reader.readLine());
                                   
                    name[c].give = Integer.parseInt(q.nextToken());
                    name[c].givep = Integer.parseInt(q.nextToken());
            
                    //if the number of person is not 0, then caculate the amount of the mod, which will be back
                    if(name[c].givep != 0){
                
                            name[c].back += name[c].give % name[c].givep;
                    //if there is no one to give, change the give to negative give becasue it's actully not giving
                    }else name[c].give = -name[c].give;
            
                    //loop to read the name of person to give money
                    for(int a = 0; a < name[c].givep; a++){
                        //read the first name
                        String line = reader.readLine();
                        //find the name in the array
                        for(int b = 0; b < NP; b++){ 
                            //if the name matched, add the money to this person
                            if(name[b].name.equals(line)){
                   
                                name[b].gain += name[c].give / name[c].givep;

                            }
                        }   
                    }
                    //set a new mark
                    reader.mark(100);
                }
            }
            //if read to the end of the file, stop the loop
            if(reader.read() == -1)break;
        }  
        //caculate the total money each person now have
        for(int y = 0; y < NP; y++){
        
            name[y].total = name[y].back + name[y].gain - name[y].give;

        }
        //write the total money to the output file
        for(int e = 0; e < NP; e++){
        
            writer.write(name[e].name + " " + name[e].total + "\n");
    
        }
        //close the reader and writer
        reader.close();
        writer.close();
        
    }
    
}
