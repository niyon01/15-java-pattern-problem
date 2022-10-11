package com.fifteenth_pattern_prb;

public class Pattern21 {
    /*

     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *

     */
    public static void main(String[] args) {
        // number of lines
        int l = 9;
        // number of similar lines
        int n = l/2+1;
        // outer loop iterates over l;
        for(int row = 1; row <= l; row++) {
            // number of spaces before printing each column
            int noOfSpaces = row > n ? row - n : n - row ;
            // inner loop iterates over noOfSpaces;
            for(int space = 1; space <= noOfSpaces; space++) {
                // print spaces
                System.out.print(" ");
            }
            // number of stars in a column
            int noOfStars = row > n ?  2*n - row : row ;
            // inner loop iterates over noOfStars;
            for(int star = 1; star <= noOfStars; star++) {
                // star print in first and last column in a row
                if(star == 1 || star == noOfStars) {
                    System.out.print("* ");
                }
                // otherwise print spaces
                else System.out.print("  ");
            }
            // add a new line after each row
            System.out.println();
        }
    }
}
