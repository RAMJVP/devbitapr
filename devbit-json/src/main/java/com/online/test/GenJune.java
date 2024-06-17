package com.online.test;

import java.util.Arrays;
import java.util.Set;

public class GenJune {
	
	
	    public static void main(String[] args) {
	        int[] input = {1, 2, 4, 5, 8, 9, 10, 3};
	        findMissingNumbers(input);
	    }

	    public static void findMissingNumbers(int[] input) {
	        int n = 10;
	        boolean[] present = new boolean[n + 1];

	        // Mark the present numbers
	        for (int num : input) {
	            if (num <= n) {
	                present[num] = true;
	            }
	        }

	        // Find the missing numbers
	        System.out.print("Missing numbers: ");
	        for (int i = 1; i <= n; i++) {
	            if (!present[i]) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	
	
}