package com.fifteenth_pattern_prb;

public class Pattern15 {
    public static void main(String[] args) {

        int n= 5;
        for(int row =0; row < n; row++) {
            for(int col = 0; col<row+1; col++) {
                if((row+col)%2 == 0) {
                    System.out.print(1+ " ");
                }else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
