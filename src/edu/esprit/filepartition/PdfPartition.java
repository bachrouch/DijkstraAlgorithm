/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.filepartition;

import edu.esprit.filereader.PdfToArray;
import java.io.IOException;

/**
 *
 * @author Houssem
 */
public class PdfPartition {

    String A[];
    private int i;

    public PdfPartition(String FilePath) throws IOException {

        PdfToArray xxx = new PdfToArray(FilePath);
        A = new String[1000000];
        A = xxx.pdfToArray();
    }

    public int MatrixNumber() {

        int MatNumber = Integer.parseInt(A[0]);
        return MatNumber;
    }

    public String RequestType() {
        return A[1];
    }

    public int MatrixLength() {
        int MatLength = Integer.parseInt(A[2]);
        return MatLength;
    }

    public int[][] TextToMatrix() {
        int j;
        int k;

        String block;
        int M[][] = new int[MatrixLength()][MatrixLength()];
        for (i = 0; i < MatrixLength(); i++) {
            j = 0;
            block = new String();
            k = 0;
            (A[i + 3]) = (A[i + 3]) + " ";
            //while ((j < (A[i + 3]).length()) && (k < MatrixLenth())) {
            for (j = 0; j < (A[i + 3]).length(); j++) {
                if ((A[i + 3]).charAt(j) != ' ') {
                    block = block + ((A[i + 3]).charAt(j));
                    // j++;
                } else {
                    M[i][k] = Integer.parseInt(block);
                    //  j++;
                    k++;
                    block = new String();
                }
            }
        }
        return M;
    }

}
