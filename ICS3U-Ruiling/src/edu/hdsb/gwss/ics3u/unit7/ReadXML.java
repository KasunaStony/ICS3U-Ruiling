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
public class ReadXML {
    
    public static void main(String args[]){
       
        
         try {
            File file = new File("Example.xml");
            Builder builder = new Builder();
            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            int i = root.getChildCount();
            System.out.println(i);
            Elements friends = root.getChildElements();
            System.out.println( doc.toXML() );
            System.out.println( friends.get(0).getFirstChildElement("name").getValue() );
        }
        catch(Exception e ) {
           e.printStackTrace();
           //System.out.println("  haha  ");
        }
                       
    }
    
}
