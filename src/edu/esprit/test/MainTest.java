/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.test;

import edu.esprit.dijkstraalgorithm.ShortestPath;
import edu.esprit.filepartition.PdfPartition;
import edu.esprit.filepartition.TxtPartition;
import edu.esprit.filereader.PdfToArray;
import edu.esprit.filereader.TxtReader;
import static java.awt.PageAttributes.MediaType.A;
import java.io.IOException;
import edu.esprit.output.OutputFile;

/**
 *
 * @author Houssem
 */
public class MainTest {
    public static void main(String[] args) throws IOException {
        int i=0;
       
        /************* PDF TEST *************/
        /************************************/
//        PdfReader pdf = new PdfReader();
//        pdf.setFilePath("C:\\Users\\Houssem\\Downloads\\Documents\\sarl_suarl.pdf");
//        String L = pdf.ToText();
//        System.out.println(L);


        /************* TXT TEST *************/
        /************************************/
//        TxtReader txt = new TxtReader();
//        String fileName = "C:\\Users\\Houssem\\Desktop\\xxxx\\hhhh.txt";
//        txt.txtReader(fileName);
//        a=txt.getContentLine();
//        System.out.println("///////////////////");
//        
//        while (a[i]!=null){
//            System.out.println(a[i]);
//            i++;
//        }
                

        /************* TXT PARTITION *************/
        /*****************************************/
//        TxtPartition txt = new TxtPartition();
//        int x= txt.MatrixNumber();
//        String y = txt.RequestType();
//        int z= txt.MatrixLength();
//        int w[][];
//     
//        w=txt.TextToMatrix();
//       
//        for(i=0; i<w.length; i++){
//            for(int k=0; k<w.length; k++){
//                System.out.println(w[i][k]);
//            }
//            System.out.println("-----------------");
//        }
      
      
      /************* PDF TO ARRAY *************/
      /****************************************/
//        PdfToArray xxx = new PdfToArray();
//        String A[]= new String[1000000];
//        A= xxx.pdfToArray();
//        i=0;
//        while(A[i]!=null){
//            System.out.println(A[i]);
//            i++;
//        }

      /************* PDF PARTITION *************/
      /*****************************************/
//        PdfPartition pdfP = new PdfPartition("C:\\Users\\Houssem\\Desktop\\xxxx\\xxx1.pdf");
//        int x = pdfP.MatrixLength();
//        String y = pdfP.RequestType();
//        int z = pdfP.MatrixNumber();
////        System.out.println("Length= "+x);
////        System.out.println("Type= "+y);
////        System.out.println("Mat Number= "+z);
//        int w[][];
//        w= pdfP.TextToMatrix();
////        for(i=0; i<w.length; i++){
////            for(int k=0; k<w.length; k++){
////                System.out.println(w[i][k]);
////            }
////            System.out.println("-----------------");
////        }
//        
//      /************* Shortest PATH *************/
//      /*****************************************/
//        ShortestPath shp = new ShortestPath("C:\\Users\\Houssem\\Desktop\\xxxx\\xxx1.pdf");
//        shp.shortestPath(w);
//        

        
    }
}
