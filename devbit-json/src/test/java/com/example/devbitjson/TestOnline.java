package com.example.devbitjson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestOnline {
	
	

	/*
	 * Declare List<String>, assign 10 random numeric string of 2 digit, like
	 * "12","21","32", "44" ... Using Streams(java 8), group the elements which are
	 * having same sum of digits.
	 * 
	 * Example : "12", "21", "32", "44", "55", "23","66","19","98","85"
	 * 
	 * Output:
	 * 
	 * "12", "21" - sum of digit is 3 "32", "23" - sum of digit is 5 "55","19" - sum
	 * of digit is 10
	 */
	
	
	
	
	
	public static void main(String[] args) {
		
		
		List<String> list=Arrays.asList(new String []{"12", "21", "32", "44", "55", "23","66","19","98","85"});
		
		
		
		System.out.println(list.stream().map(s->Integer.parseInt(s)).collect(Collectors.groupingBy(n->sum(n))));
		
//		list.stream().collect(Collectors.groupingBy(null))
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int sum(int nu) {
		int sum=0;
		while (nu>0) {
			int digit=nu%10;
			 nu=nu/10;
			 sum=sum+digit;
		}
		
		return sum;
		
		
	}

}
