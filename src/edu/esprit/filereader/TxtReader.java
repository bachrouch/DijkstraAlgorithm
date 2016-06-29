/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Houssem
 */
public class TxtReader {
        
        
        
        BufferedReader br = null;
        private String line;
        private String filePath;
        private String contentLine[];
                int i;

    public TxtReader() {
    }
        
        

    public void txtReader(String filePath) throws FileNotFoundException {
        
        
        
        
        try{
            br = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException fnfex){
            System.out.println(fnfex.getMessage());
            System.exit(0);
        }
        contentLine= new String[10000];
        i=0;
        try {
            
            while((line = br.readLine()) != null){
                contentLine[i]= line;
                i++;
//                System.out.println(contentLine);
//                System.out.println("*****");
//                System.out.println(line);
                
            } 
            
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage() + "error reading file");
//        }finally{
//            System.exit(0);
        }
    }

    public String[] getContentLine() {
        return contentLine;
    }

    
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    
}
