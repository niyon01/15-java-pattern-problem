package com.fifteenth_pattern_prb;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            int noOfSpaces = n - row - 1;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            int colsInARow = row + 1;
            for (int col = 0; col < colsInARow; col++) {
                System.out.print("*  ");
            }
            if(row<n-1) System.out.println();
        }
    }
}
