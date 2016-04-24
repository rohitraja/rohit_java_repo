package com.rohit.algo;

import java.util.Scanner;

public class TrappingRainWater {
	public static Integer []elevationMap;
	public static Integer []elevationMap1;

	/*
	 * Algo1: 
	 * step 1. get the leftmost tower and right most tower 
	 * step 2. traverse leftmost tower to right most tower 
	 * count water where index value is less then equal 0 and reduce the each tower lenght by 1
	 * step 3. repeate above steps till tower count is <1
	 * 
	 * complexcity: O(n^2)
	 */
	Integer maxLWater(Integer []integ){
		Integer water=0,towerLeft=integ.length,start=0,last1=integ.length-1;
		
		while(towerLeft>1){
			if(integ[start]<=0){
				while(integ[start]<=0){
					start++;
				}
				while(integ[last1]<=0){
					last1--;
				}
			}
			towerLeft=0;
			for(int i=start;i<last1;i++){
				if(integ[i]<=0){
					water++;
					towerLeft++;
				}
				integ[i]--;
			}
		}
		
		return water;
	}
	
	Integer maxWater(Integer integ[]){
		Integer water=0;
		Integer leftMax[] = new Integer[integ.length];
		Integer rightMax[] = new Integer[integ.length];
		leftMax[0]=integ[0];
		System.out.println("Left"+leftMax[0]+" ");
		for(int i=1;i<integ.length;i++)
		{
			leftMax[i]=Math.max(leftMax[i-1],integ[i]);
		}
		rightMax[integ.length-1]=integ[integ.length-1];
		for(int i=integ.length-2;i>=0;i--){
			rightMax[i] = Math.max(rightMax[i+1], integ[i]);
		}
		
		for(int i=0;i<integ.length;i++){
			water+=Math.min(leftMax[i], rightMax[i])-integ[i];
		}
		return water;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Elevator Length:");
		Integer eleLength = scan.nextInt();
		elevationMap = new Integer[eleLength];
		elevationMap1 = new Integer[eleLength];
		System.out.println("Enter the Elevation");
		for(int i=0;i<eleLength;i++){
			elevationMap1[i]=elevationMap[i]=scan.nextInt();
		}
		TrappingRainWater rain = new TrappingRainWater();
		System.out.println("Algo 1 "+rain.maxLWater(elevationMap));
		System.out.println("Algo 2 "+rain.maxWater(elevationMap1));

	}
	

}
