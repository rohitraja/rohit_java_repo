package com.rohit.venturesity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadTsv2 {

	public static 	HashMap<String, HashMap<String, String>> trainList = new HashMap<String, HashMap<String,String>>();

	public static void insertIntoHashmap(ProductDetails product){
		if(trainList.containsKey(product.getCatagoryId())){
			HashMap<String, String> productCatList=trainList.get(product.getCatagoryId());
			if(!productCatList.containsKey(product.getProductTitle())){
				productCatList.put(product.getProductTitle(), product.getBrandId());
			}
			
		}
		else
		{
			HashMap<String, String> productCatList = new HashMap<String, String>();
			productCatList.put(product.getProductTitle(), product.getBrandId());
			trainList.put(product.getCatagoryId(), productCatList);
		}
	}
	
	public static void countOfCatagory(){
		
		for(String catagoryId:trainList.keySet()){
			HashMap<String, String> cataoryList = trainList.get(catagoryId);
			System.out.println(cataoryList.size());
		}
	}
	
	
	
	public static void createProductList() {
		try {
			BufferedReader TsvFile = new BufferedReader(new FileReader("C://Users//Bahubali//Downloads//classification_train.tsv//classification_train.tsv"));
			
			String datarow = TsvFile.readLine();
			while(datarow!=null){
				String [] dataArray = datarow.split("\t");
				String prodDec = null,cataoryId = null,brandId = null;
				for(int i=0;i<3;i++){
					if(i==0)
						prodDec=dataArray[0];
					if(i==1)
						brandId=dataArray[1];
					if(i==2)
						cataoryId=dataArray[2];
					
				}
				ProductDetails product = new ProductDetails(cataoryId,prodDec,brandId);		
				if(trainList==null){
					insertIntoHashmap(product);				
					}
				else{
					insertIntoHashmap(product);				
				}
				datarow = TsvFile.readLine();
				
			}
			TsvFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Boolean  findBrandInItems(ProductDetails productDetails){
		Boolean found=false;
		Integer maxLengthFound =0;
		HashMap<Integer, String> matchFoundList = new HashMap<Integer, String>();
		if(trainList.containsKey(productDetails.getCatagoryId())){
			HashMap<String, String> catList = trainList.get(productDetails.getCatagoryId());
			for(String key:catList.keySet()){
				if(productDetails.getProductTitle().contains(key)){
					matchFoundList.put(key.length(), catList.get(key));
					maxLengthFound=(key.length()>maxLengthFound?key.length():maxLengthFound);
				}
			}
			if(matchFoundList.size()>0){
				System.out.println(matchFoundList.get(maxLengthFound));
				found=true;
			}
			else{
				System.out.println("Not_found");
			}
		}
		return found;
	}
	
	
	
	public static void findBrandId(){
		Integer found=0;
		Integer totalCount=0;
		try {
			BufferedReader TsvFile = new BufferedReader(new FileReader("C://Users//Bahubali//Downloads//classification_blind_set_corrected.tsv//classification_blind_set_corrected.tsv"));
			String datarow = TsvFile.readLine();

			while(datarow!=null){
				String [] dataArray = datarow.split("\t");
				String prodDec = null,cataoryId = null;
				for(int i=0;i<2;i++){
					if(i==0)
						prodDec=dataArray[0];
					if(i==1)
						cataoryId=dataArray[1];
					
				}
				ProductDetails product = new ProductDetails(cataoryId,prodDec,null);
				if(findBrandInItems(product)){
					found++;
				}
				datarow = TsvFile.readLine();
				totalCount++;
			}
			TsvFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("found: "+found);
		System.out.println("total: "+totalCount);
		System.out.println("Items found "+(found*100)/totalCount);
	}
	public static void main(String[] args) {
		createProductList();
		ProductDetails productDetails = new ProductDetails("348", "Targus Products - Targus - CityLite Laptop Case, Nylon, 15-3/4 x 4 x 13-3/4, Black/Gray - Sold As 1 Each - Padded case has a compartment for your laptop. - Easy-access front compartment and interior file section create ample space to hold pens, cords, CDs and other mobile accessories. - Also features a divided, expandable file section. - Includes luggage strap for easy attachment to rolling travel cases. - Lightweight construction-weighs only 2-1/4 lbs.",null);
		findBrandInItems(productDetails);
		findBrandId();
		
		
		
	}




}
