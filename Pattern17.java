package com.fifteenth_pattern_prb;

public class Pattern17 {
    /*

     *****
     *   *
     *   *
     *   *
     *****

     */
    public static void main(String[] args) {

        // number of lines in the pattern
        int l = 5;
        // outer loop executes over l
        for(int row = 1; row <=l; row ++) {
            // number of stars and spaces in a row;
            int noOfStars = l ;
            // inner loop executes over noOfStars;
            for(int star = 1; star <=noOfStars; star ++) {
                // print star in column first,column last, row first and row last positions
                if(star == 1 || star == noOfStars || row == l || row == 1){
                    System.out.print("*");
                }
                // print spaces
                else System.out.print(" ");
            }
            // add a new line after each row
            System.out.println();
        }

    }
}
