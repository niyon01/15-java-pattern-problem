package com.fifteenth_pattern_prb;

public class Pattern24 {
    /*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

     */

    public static void main(String[] args) {
        // number of lines
        int n = 5;
        // outer loop iterates over n;
        for (int row = 1; row <= n; row++) {

            // inner loop executes each col till number of rows;
            for (int col = 1; col <= row; col++) {
                // print 1 for even
                if ((row + col) % 2 == 0) {
                    System.out.print(1+ " ");
                }
                // print 0 for odd
                else {
                    System.out.print(0+ " ");
                }
            }
            // add a new line
            System.out.println();
        }
    }
}
