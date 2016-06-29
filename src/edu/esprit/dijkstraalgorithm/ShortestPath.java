/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dijkstraalgorithm;

import edu.esprit.filepartition.PdfPartition;
import edu.esprit.filepartition.TxtPartition;
import edu.esprit.output.OutputFile;
import java.io.IOException;

/**
 *
 * @author Houssem
 */
public class ShortestPath {

    private int min = 1000, nextNode = 0; // min holds the minimum value, nextNode holds the value for the next node.
    private int[] preD;
    private int[] distance;
    private int[] visited;
    private String FinalPath;
    private int MatLength;
    public ShortestPath(String fileName) throws IOException {
        if(fileName.endsWith("txt")){
            TxtPartition txtp = new TxtPartition(fileName);
            MatLength = txtp.MatrixLength();
        }else{
            PdfPartition pdfp = new PdfPartition(fileName);
            MatLength = pdfp.MatrixLength();
        }
        
        preD = new int[MatLength];
        distance = new int[MatLength]; // the distance matrix
        visited = new int[MatLength]; // the visited array
    }

    public void shortestPath(int matrix[][]) {
        distance = matrix[0]; //initialize the distance array
        visited[0] = 1; //set the source node as visited
        distance[0] = 0; //set the distance from source to source to zero which is the starting point

        for (int counter = 0; counter < matrix.length; counter++) {

            min = 1000;

            for (int i = 0; i < matrix.length; i++) {

                if (min > distance[i] && visited[i] != 1) {

                    min = distance[i];
                    nextNode = i;

                }

            }

            visited[nextNode] = 1;

            for (int i = 0; i < matrix.length; i++) {

                if (visited[i] != 1) {

                    if (min + matrix[nextNode][i] < distance[i]) {

                        distance[i] = min + matrix[nextNode][i];
                        preD[i] = nextNode;

                    }

                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {

            //System.out.print("|" + distance[i]);

        }
        //System.out.println("|");

        int j;
        FinalPath = new String();
        for (int i = 0; i < matrix.length; i++) {

            if (i != 0) {
                FinalPath = ""+(i + 1);
               // System.out.print("Path = " + (i + 1));
                j = i;
                do {

                    j = preD[j];
                    FinalPath = FinalPath + " <- " + (j + 1);
                    //System.out.print(" <- " + (j + 1));

                } while (j != 0);

            }

            //System.out.println();

        }
        System.out.println(FinalPath);
        OutputFile outp = new OutputFile();
        outp.outputInFile(FinalPath);
    }
}
