package com.fifteenth_pattern_prb;

public class Pattern14 {
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
        // number of lines in the pattern which is rows
        int N = 10;
        // number of similar lines in the pattern
        int n = 5;
        // outer loop iterates over the number of lines N
        for (int row = 1; row <= N; row++) {
            // number of spaces in the column
            int noOfSpaces = row > n ? N - row : row - 1;
            // inner loop iterates over the number of spaces
            for(int space = 1; space <= noOfSpaces; space++) {
                System.out.print(" ");
            }
            // number of stars in the column
            int noOfStars = row > n ? row-n : n-row+1;
            // inner loop iterates over the number of stars
            for(int stars = 1; stars <= noOfStars; stars++) {
                System.out.print("* ");
            }
            // add a new line after printing rows
            System.out.println();
        }
    }
}
