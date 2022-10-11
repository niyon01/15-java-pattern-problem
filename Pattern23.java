package com.fifteenth_pattern_prb;

public class Pattern23 {
    /*

   1
  212
 32123
4321234
 32123
  212
   1

     */
    public static void main(String[] args) {

        // number of input
        int n = 4;
        // number of lines
        int N = 2*n-1;
        // outer loop iterates over N;
        for(int row = 1; row <= N; row++) {
            // number of spaces in a row
            int noOfSpaces = row > n ? row - n : n - row ;
            // inner loop iterates over noOfSpaces;
            for(int space = 1; space <= noOfSpaces; space++) {
                // print space
                System.out.print(" ");
            }
            // number of cols c;
            int c = row > n ? 2*n-row : row ;
            // from c to 1
            for(int col = c; col >= 1 ; col--) {
                System.out.print(col);
            }
            // from 2 to c;
            for(int col = 2; col <=c ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }}

}
