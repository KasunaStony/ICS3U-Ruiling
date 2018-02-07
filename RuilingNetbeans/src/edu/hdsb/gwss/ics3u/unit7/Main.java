/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit7;

import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author maruiling
 */
public class Main {

    public static void main(String args[]) {

        Element root = new Element("mls");
        Document doc = new Document(root);
        
        Element eastConf = new Element("Conference");
        Element westConf = new Element("Conference");
        
        Element confNameE = new Element("Name");
        confNameE.appendChild("East");
        
        Element confNameW = new Element("Name");
        confNameW.appendChild("West");
        
        eastConf.appendChild(confNameE);
        westConf.appendChild(confNameW);
        
        root.appendChild(eastConf);
        root.appendChild(westConf);

        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(doc);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

}
