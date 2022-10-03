package com.fifteenth_pattern_prb;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++) {
            int noOfSpaces= n-row-1;
            for(int col=0;col<noOfSpaces;col++) {
                System.out.print("  ");
            }
            int colsInRow=row+1;
            for(int col=0;col<colsInRow;col++) {
                System.out.print("* ");
            }
            if(row!=n-1) System.out.println();
        }
    }
}
