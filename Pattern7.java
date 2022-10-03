package com.fifteenth_pattern_prb;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0; row < n; row++) {
            int noOfSpaces = row;
            for(int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            int noOfCols = n-row;
            for(int col = 0; col < noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
