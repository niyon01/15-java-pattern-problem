package com.fifteenth_pattern_prb;

public class Pattern2 {
               /*
     * * * * *
     * * * *
     * * *
     * *
     *

              */
    public static void main(String[] args) {
        // number of lines in the pattern;
        int n = 5;
        // outer loop iterates over number of lines;
        for(int row = 1; row <= n; row++) {
            // inner loop iterates over the formula (n + 1)-row ;
            for(int col = 1; col <= n+1-row; col++) {
                //print *
                System.out.print("* ");
            }
            // add new line
            System.out.println();
        }
    }
}
