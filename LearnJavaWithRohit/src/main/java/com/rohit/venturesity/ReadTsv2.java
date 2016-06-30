package com.rohit.venturesity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadTsv2 {

	public static 	HashMap<String, HashMap<String, String>> trainList = new HashMap<String, HashMap<String,String>>();

	public static void insertIntoHashmap(ProductDetails product){
		
		HashMap<String, HashMap<String, String>> trainList = new HashMap<String, HashMap<String,String>>();
		
		if(trainList.containsKey(product.getCatagoryId())){
			
			HashMap<String, String> productCatList=trainList.get(product.getCatagoryId());
			if(productCatList.containsKey(product.getProductTitle())){
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
	
	
	public static void main(String[] args) {
		try {
			BufferedReader TsvFile = new BufferedReader(new FileReader("classification_train.tsv"));
			
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
		System.err.println(trainList.size());

	}

}
