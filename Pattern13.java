package com.fifteenth_pattern_prb;

public class Pattern13 {
    public static void main(String[] args) {

        int n = 4;
        int N = 2*n-1;

        for(int row = 0; row <N; row++) {

            for(int col = 0; col <2*n-1; col++) {
                int atEveryIndex = Math.min(Math.min(row, col),Math.min(N-1-row,N-1-col));
                System.out.print(n -atEveryIndex+" ");;

            }
            System.out.println();
        }
    }
}
