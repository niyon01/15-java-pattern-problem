package com.fifteenth_pattern_prb;

public class Pattern13 {
    /*

     * * * * *
      * * * *
       * * *
        * *
         *

     */
    public static void main(String[] args) {

        // number of lines in the pattern
        int n = 5;
        // outer loop iterates over Number of lines which is rows
        for(int row = 1; row <= n; row ++) {
            // number of columns for printing space
            int noOfSpaces = row-1;
            // inner loop iterates over Number of spaces
            for(int space = 1; space <= noOfSpaces; space ++) {
                System.out.print(" ");
            }
            // number of columns for printing star
            int noOfStars = n-row+1;
            // inner loop iterates over Number of stars
            for(int star = 1; star <= noOfStars; star ++) {
                System.out.print("* ");
            }
            // after printing each row, add a new line
            System.out.println();
        }
    }
}
