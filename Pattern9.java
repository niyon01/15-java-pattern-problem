package com.fifteenth_pattern_prb;

public class Pattern9 {
    public static void main(String[] args) {

        int n = 5;
        for( int row = 0; row < 2*n-1; row++ ) {
            int noOfCols = row > n-1 ? 2*n -row-1 : row+1;
            int noOfSpaces = n-noOfCols;
            for(int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }
            for(int col = 0; col < noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
