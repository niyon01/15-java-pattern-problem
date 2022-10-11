package com.fifteenth_pattern_prb;

public class Pattern11 {
    /*

     * * * * * * * * *
       * * * * * * *
         * * * * *
           * * *
             *

     */
    public static void main(String[] args) {

        // number of lines in the pattern
        int n = 5;
        // outer loop executes until the number of lines is reached
        for(int row = 1; row <=n; row++) {
            // number of spaces in the columns
            int noOfSpaces = row-1;
            // inner loop executes until the number of spaces  is reached
            for(int space = 1; space <=noOfSpaces; space++) {
                System.out.print("  ");
            }
            // number of stars in the columns
            int noOfStars = 2* (n-row)+1;
            // inner loop executes until the number of stars is reached
            for(int star = 1; star <= noOfStars; star++) {
                System.out.print("* ");
            }
            // after printing each row,add a new line
            System.out.println();
        }

    }
}
