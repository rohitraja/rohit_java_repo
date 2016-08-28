package com.rohit.algo;

import java.util.Scanner;

public class Test {
	
	
	public static char[][] insertInMatrix(String cypher,Integer rows,Integer columns){
		Integer strLength = cypher.length();
		char [][]stringMatrix = new char[rows][columns];
		int index=0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				 if(index<strLength){
					 stringMatrix[i][j] = cypher.charAt(index);
				 }
				 index++;
			 }
		 }
		 return stringMatrix;
		 
	}
	
	public static String encryptTxt(char[][] stringMatrix,String cypher,Integer rows,Integer columns){
		 Integer index=0,strLength;
		 strLength = cypher.length();
		 String encriptedTxt="";
		 for(int i=0;i<columns;i++){
			 for(int j=0;j<rows;j++){
				 if(index<strLength  && (int)stringMatrix[j][i]!=0){
					 encriptedTxt = encriptedTxt+stringMatrix[j][i];
					 index++;
				 }
			 }
			 encriptedTxt = encriptedTxt+" ";
		 }
		return encriptedTxt;
	}

	
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String cypher = scan.nextLine();
		cypher=cypher.replaceAll(" ","");
		Integer  strLength= cypher.length();
		Double root = Math.sqrt(cypher.length());
		
		
		Integer columns = (int) Math.ceil(root);
		Integer rows = (int)Math.floor(root);
		
		while(columns*rows<strLength){
			rows++;
		}
		 char [][]stringMatrix = new char[rows][columns];
		 stringMatrix = Test.insertInMatrix(cypher, rows, columns);
		 String encriptedTxt="";
		 encriptedTxt = Test.encryptTxt(stringMatrix, cypher, rows, columns);
		 System.out.println(encriptedTxt);
	}

}
