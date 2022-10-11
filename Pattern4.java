package com.fifteenth_pattern_prb;

public class Pattern4 {
         /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
       */
    public static void main(String[] args) {
        // number of lines look similar
        int n = 5;
        // outer loop iterates over number of lines in the pattern
        for(int row = 1; row < 2*n; row++) {
            // calculate number of columns in a row
            int noOfCol = row > n ? 2*n - row : row;
            // inner loop iterates over number of columns
            for(int col = 1; col <= noOfCol; col++) {
                // print *
                System.out.print("* ");
            }
            // add new line after every row
            System.out.println();
        }

    }
}
