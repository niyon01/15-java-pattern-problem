package com.fifteenth_pattern_prb;

public class Pattern1 {
    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */
    public static void main(String[] args) {

        // number of lines in the pattern
        int n = 5;
        //outer loop iterates over n;
        for(int row = 1; row <=n; row++){
            //inner loop iterates over row;
            for(int col = 1; col <=row; col++){
                //print *;
                System.out.print("* ");
            }
            //print new line;
            System.out.println();
        }
    }
}





