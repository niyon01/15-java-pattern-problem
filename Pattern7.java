package com.fifteenth_pattern_prb;

public class Pattern7 {
    /*

     * * * * *
     * * * *
     * * *
     * *
     *
     *
     * *
     * * *
     * * * *
     * * * * *

     */
    public static void main(String[] args) {
        // number of similar lines that don't repeated
        int n = 5;
        // outer loop iterates over number of lines
        for(int row = 1; row <=2*n; row++) {
            // calculate the number of columns in each row
            int noOfCols = row > n? row - n : (n+1)-row ;
            // inner loop iterates over number of columns
            for(int col = 1; col <= noOfCols; col++) {
                // print *
                System.out.print("* ");
            }
            // after printing each row, add a new line
            System.out.println();
        }
    }
}
