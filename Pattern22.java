package com.fifteenth_pattern_prb;

public class Pattern22 {
    /*

        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1

   */
    public static void main(String[] args) {

        // number of lines
        int n = 5;
        // outer loop iterates over n;
        for(int row = 1; row <= n; row++) {
            // set num = 1;
            int num = 1;
            // number of spaces before printing elements
            int noOfSpaces = n - row ;
            // outer loop iterates over noOfSpaces;
            for(int space = 1; space <= noOfSpaces; space++) {
                // print spaces
                System.out.print(" ");
            }
            // inner loop iterates over row;
            for(int col = 1 ; col <= row; col++) {
                // print num;
                System.out.print(num + " ");
                // update num value for next number
                num = num * (row - col)/ (col);
            }
            // add a new line
            System.out.println();
        }
    }
}
