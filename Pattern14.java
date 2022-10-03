package com.fifteenth_pattern_prb;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;

        for( int row = 0; row < n-1; row++ ) {

            for(int col = 0; col < n; col++ ) {
                if(row == 0 || col == 0 || row == n-2  || col == n-1) {
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
