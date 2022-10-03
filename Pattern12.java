package com.fifteenth_pattern_prb;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for( int row = 0; row < 2*n-1; row++ ) {
            int colItem = row >= n ? 2*n-row-1:row + 1;
            for(int s = 0; s < n-colItem; s++ ) {
                System.out.print("  ");
            }
            for(int col = colItem; col >0;col-- ) {
                System.out.print(col+" ");
            }
            for(int col = 2; col<=colItem; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
