/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit7;

/**
 *
 * @author maruiling
 */
import java.io.*;
import nu.xom.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmericanLeague {

    public static void main(String args[]) throws Exception {

        File f = new File("AL.STANDINGS.xml");
        Builder builder = new Builder();
        Document doc = builder.build(f);

        Element root = doc.getRootElement();

        Elements league = root.getChildElements();

        Element newRoot = new Element("americanLeagueEastTeams");
        Document newDoc = new Document(newRoot);

        Element name;
        Element division;
        Element record;
        Element team;

        for (int i = 0; i < league.size(); i++) {

            if (league.get(i).getChildElements().get(1).getValue().compareTo("East") == 0) {

                name = new Element("name");
                division = new Element("division");
                record = new Element("record");
                team = new Element("team");

                name.appendChild(league.get(i).getChildElements().get(0).getValue());
                division.appendChild("East");
                record.appendChild(league.get(i).getChildElements().get(2).getValue());

                team.appendChild(name);
                team.appendChild(division);
                team.appendChild(record);

                newRoot.appendChild(team);
            }

        }

        File newF = new File("AL.EAST.STANDINGS.XML");
        BufferedWriter writer = new BufferedWriter(new FileWriter(newF));

        writer.write(newDoc.toXML());
        writer.close();
        

        newF = new File("AL.WEST.STANDINGS.XML");
        writer = new BufferedWriter(new FileWriter(newF));

        newRoot = new Element("americanLeagueWestTeams");
        newDoc = new Document(newRoot);

        for (int i = 0; i < league.size(); i++) {

            if (league.get(i).getChildElements().get(1).getValue().compareTo("West") == 0) {

                name = new Element("name");
                division = new Element("division");
                record = new Element("record");
                team = new Element("team");

                name.appendChild(league.get(i).getChildElements().get(0).getValue());
                division.appendChild("West");
                record.appendChild(league.get(i).getChildElements().get(2).getValue());

                team.appendChild(name);
                team.appendChild(division);
                team.appendChild(record);

                newRoot.appendChild(team);
            }

           
        }
        
        writer.write(newDoc.toXML());
        writer.close();

        newF = new File("AL.CENTRAL.STANDINGS.XML");
        writer = new BufferedWriter(new FileWriter(newF));

        newRoot = new Element("americanLeagueCentralTeams");
        newDoc = new Document(newRoot);

        for (int i = 0; i < league.size(); i++) {

            if (league.get(i).getChildElements().get(1).getValue().compareTo("Central") == 0) {

                name = new Element("name");
                division = new Element("division");
                record = new Element("record");
                team = new Element("team");

                name.appendChild(league.get(i).getChildElements().get(0).getValue());
                division.appendChild("Central");
                record.appendChild(league.get(i).getChildElements().get(2).getValue());

                team.appendChild(name);
                team.appendChild(division);
                team.appendChild(record);

                newRoot.appendChild(team);
            }

            
        }
        
        writer.write(newDoc.toXML());
        writer.close();

    }
}
