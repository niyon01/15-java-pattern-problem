package com.fifteenth_pattern_prb;

/*

    *
   * *
  *   *
 *     *
*********

 */
public class Pattern15 {
    public static void main(String[] args) {

        // number of lines in the pattern
        int n = 5;
        // outer loop will be executed till the number of lines
        for(int row = 1; row <=n; row++) {
            // number of spaces in the column before printing star
            int noOfSpaces = n -row;
            //inner loop executes until the noOfSpaces is reached
            for(int space = 1; space <=noOfSpaces; space++) {
                // print spaces
                System.out.print(" ");
            }
            // number of stars and spaces in the pattern
            int noOfStars = row + row -1;
            // inner loop executes until the noOfStars is reached
            for(int star = 1; star <= noOfStars; star++){
                // print stars in first, last in the column and last row
                if(star ==1 || star == noOfStars || row == n){
                    System.out.print("*");
                }
                // otherwise print spaces
                else System.out.print(" ");

            }
            // adding a new line after printing each row
            System.out.println();
        }

    }
}
