package com.fifteenth_pattern_prb;

public class Pattern5 {
    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void main(String[] args) {
        // number of lines look similar
        int n = 5;
        // outer loop iterates over number of lines in the pattern
        for(int row = 1; row < 2*n; row++){
            // calculate number of columns in a row
            int noOfCols = row > n ? row+1-n : n+1-row;
            // inner loop iterates over number of columns
            for(int col = 1; col <= noOfCols; col++) {
                // print *
                System.out.print("* ");
            }
            // After printing each row, add a new line
            System.out.println();
        }

    }
}
