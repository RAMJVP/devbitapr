package com.example.devbitjson;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class Tsq2 {
	
	

	/*
	 * Declare Map, Map<Integer, List<Item>> Map contains 4 key-value pair Each
	 * value of Map contains 4 Items Item - name, price
	 * 
	 * Order the Map in ascending Order, based on the list of Items which are
	 * arranged in ascending order.
	 * 
	 * 
	 * Example :
	 * 
	 * Unordered :
	 * 
	 * 
	 * Map -1 ->List<Item> (Item Price - 2,3,4,1) 2->List<Item> (Item Price -
	 * 1,2,3,4) 3->List<Item> (Item Price - 4,3,2,1) 4->List<Item> (Item Price -
	 * 3,4,1,2)
	 * 
	 * 
	 * output: -------- Ordered : Map -1 ->List<Item> (Item Price - 1,2,3,4)
	 * 2->List<Item> (Item Price - 2,3,4,1) 3->List<Item> (Item Price - 3,4,1,2)
	 * 4->List<Item> (Item Price - 4,3,2,1) has context menu
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		 Map<Integer, List<Integer>>  map=new HashMap<>();
		// map.put(1, List.of(new Item(3),new Item(2),new Item(1)));
		 
		 map.put(1, List.of(3,2,1));
		 
		 map.forEach((k,v)->{
			//v.sort(Comparator.naturalOrder()); //NO
			
			 v=v.stream().sorted().toList();
			 
			 //rotate here
			 
			 
			 
			 v.stream().sorted().count();
			 
			 
			 
			 v.stream().sorted().findAny();
			 
			 
			 
			
			 
			 
			 
			 
			 
			 
			 
			 
			map.put(k, v);
			
		 });
		 
		 
		 System.out.println(map);
		
		  
		 //map.entrySet().stream().sorted((e1,e2)->e1.c)
		 
		 //map.
		 
		 
		 
		 
		 
		
	}
	
	public static class Item{
		
	private	int pr;
	
	Item(int pr){
		this.pr=pr;
	}
		
	}
	
	
	public  static record Item1(int pr){}
	
	

}
