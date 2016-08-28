package com.rohit.venturesity;

import java.util.HashMap;

public class HashMapExample {

	/*
	 * this method is to insert the train.tsv data to a data structure 
	 * wo that it can be found easily by catagory and product title.
	 */
	public void insertIntoHashmap(){
		
		String catagory="abcd";
		HashMap<String, HashMap<String, String>> trainList = new HashMap<String, HashMap<String,String>>();
		if(trainList.containsKey(catagory)){
			//now find discription inside and find the brand
			String description="abcd";
			String brandId = "abcd";
			HashMap<String, String> productTitleList=trainList.get(catagory);
			if(productTitleList.containsKey(description)){
				productTitleList.put(description, brandId);
			}
			
		}
		else
		{
			HashMap<String, String> productTitleList = new HashMap<String, String>();
			productTitleList.put("", "");
		}
	}
	
	
	public static void main(String arg[]){
		
		HashMap<String, String> mapList = new HashMap<String, String>();
		
		mapList.put("1", "One");
		mapList.put("2", "two");
		mapList.put("3", "three");
		mapList.put("4", "four");
		mapList.put("5", "five");
		mapList.put("6", "six");
		mapList.put("7", "seven");
		
		System.out.println(mapList.get("7"));
		
	}
}
