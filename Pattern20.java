package com.fifteenth_pattern_prb;

public class Pattern20 {
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
        // outer loop for executing the number of rows which is equal to number of lines l
        for(int row = 1; row <=l; row ++) {

            // number of spaces in the column before printing stars
            int noOfSpaces = row -1;
            // inner loop executes over noOfSpaces
            for(int spaces = 1; spaces <= noOfSpaces; spaces++) {
                // print stars before printing stars
                System.out.print(" ");
            }
            // number of stars and middle spaces
            int noOfStars = l;
            // inner loop executes over noOfStars
            for(int stars = 1; stars <=noOfStars; stars++) {
                // print stars in  first and last position of column and row
                if(stars == 1 || stars == noOfStars || row == 1 || row == l){
                    System.out.print("*");
                }
                // otherwise print middle spaces
                else System.out.print(" ");
            }
            // add a new line after each row
            System.out.println();
        }
    }
}
