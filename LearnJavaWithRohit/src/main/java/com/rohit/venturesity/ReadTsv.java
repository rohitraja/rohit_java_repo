package com.rohit.venturesity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadTsv {
	
	

	public static void main(String arg[]){

	HashMap<ProductDto, String> productList = new HashMap<ProductDto, String>();
		

		
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
				ProductDto product = new ProductDto(cataoryId,prodDec);		
				if(productList==null){
					productList.put(product, brandId);
				}
				else{
					productList.put(product, brandId);
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
		
		Integer found=0;
		Integer totalBlind=0;
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
				ProductDto product = new ProductDto(cataoryId,prodDec);		
				if(productList.get(product)!=null){
					System.out.println("Brand: "+productList.get(product));
					found++;
					
				}
				else
				{
					System.out.println("Not found");
				}
				datarow = TsvFile.readLine();
				totalBlind++;
				
			}
			TsvFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Found: "+found);
		System.out.println("Togal : "+totalBlind);
		System.out.println("Data found : "+(found*100)/totalBlind+"%");
		
		
	}

}
