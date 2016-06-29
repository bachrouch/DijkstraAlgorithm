/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.filereader;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Houssem
 */
public class PdfToArray {

    private String A;
    private String B;
    private String C;
    private String contentLine[];
    private int i;
    private int j;
    private int k;

    public PdfToArray(String FilePath) throws IOException {
        PdfReader pdf = new PdfReader();
        pdf.setFilePath(FilePath);
        A = pdf.ToText();
    }
    
    public String[] pdfToArray(){
        
        contentLine = new String[10000];
        j=0;
        B = new String();
        for (i=0; i<A.length(); i++){
            if (A.charAt(i) != '\n'){
                B= B + A.charAt(i);
            }else{
                C = new String();
                C = B.trim();
                contentLine[j]=C;
                B = new String();
                j++;
            }
        }
        return contentLine;
    }

}
