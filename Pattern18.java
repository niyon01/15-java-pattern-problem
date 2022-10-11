package com.fifteenth_pattern_prb;

public class Pattern18 {
    /*

     * * * * *
      * * * * *
       * * * * *
        * * * * *
         * * * * *


     */
    public static void main(String[] args) {

        // total lines in the pattern
        int l = 5;

        // outer loop executes over the l
        for(int row = 1; row <= l; row++) {

            // number of Spaces before printing stars
            int noOfSpaces = row - 1;
            // inner loop executes over noOFSpaces;
            for(int space = 1; space <= noOfSpaces; space++) {
                // print space
                System.out.print(" ");
            }
            // number of stars;
            int noOfStars = l;
            // inner loop executes over noOfStars;
            for(int star = 1; star <= noOfStars; star++) {
                // print star
                System.out.print("* ");
            }
            // add a new line before executes next row
            System.out.println();
        }
    }
}
