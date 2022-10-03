package com.fifteenth_pattern_prb;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0; row < 2*n; row++) {
            int noOfSpaces = row > n-1? 2*n-row-1 : row;
            for(int s = 0; s< noOfSpaces; s++) {
                System.out.print(" ");
            }
            int noOfCols = row > n-1 ? row-n+1 : n-row;
            for(int col =0; col < noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
