package com.fifteenth_pattern_prb;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int row = 0; row < n; row++) {
            int noOfSpaces =row;
            for(int s=0; s< noOfSpaces; s++) {
                System.out.print("  ");
            }
            int colsInRow =n-row;
            for(int col = 0; col < colsInRow; col++) {
                System.out.print("* ");
            }
           if(row<n-1) System.out.println();
        }
    }
}
