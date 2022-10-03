package com.fifteenth_pattern_prb;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5 ;

        for( int row = 0; row < n; row++){
            for(int s = 0; s < n-row-1; s++) {
                System.out.print("  ");
            }
            for(int col = row+1; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col<=row+1; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
