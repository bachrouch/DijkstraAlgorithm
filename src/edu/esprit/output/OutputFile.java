/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Houssem
 */
public class OutputFile {

    public OutputFile() {
    }
    
    
    
    public void outputInFile(String solution){
        
        try{
            PrintStream outputTxt = new PrintStream(new File("C:\\Users\\Houssem\\Desktop\\xxxx\\output.txt"));
            System.setOut(outputTxt);
            outputTxt.print(solution);
            
        }catch(FileNotFoundException fx){
            System.out.println(fx);
        }
    }
    
}
