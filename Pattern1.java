package com.fifteenth_pattern_prb;

public class Pattern1 {
    public static void main(String[] args) {
       int n=10;
       for(int row = 0; row < 2 * n; row++) {
           if(row==0) continue;
           int colInRow = row>n ? 2*n-row: row;
           for(int col = 0; col < colInRow; col++) {
               System.out.print("* ");
           }
         if(row!=2*n) System.out.println();
       }
    }
}





