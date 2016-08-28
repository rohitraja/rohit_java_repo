package com.rohit.algo;

public class SelectionSor {
	
	public static int[] sort(int[]ar,int n){
		int minindex;
		int swapVar;
		for(int i=0;i<n;i++){
			minindex =i;
			for(int j=i+1;j<n;j++){
				if(ar[j-1]>ar[j]){
					minindex=j;
				}
				
			}
			swapVar = ar[i];
			ar[i] = ar[minindex];
			ar[minindex]=swapVar;
			/*
			 * 
			 The below method of swap will not work here because we are dealing with the index of an array here.
			 This will not work  if you want to swap the same index.
			 eg: i=mininex=5 and ar[5] = 10
			     ar[5] = 10 +10;
			     ar[5] = 20 -10;
			     ar[5] =10 -10; ie 0
			 	
			 
			ar[i]=ar[i]+ar[minindex];
			ar[minindex]= ar[i]-ar[minindex];
			ar[i]=ar[i]-ar[minindex];
			*/
			System.out.println("************************");
			printArray(ar);
		}
		return ar;
	}
	
	public static int[] selectionSortByRec(int[]ar,int startIndex,int endIndex){
		int tempI,minIndex,swapVar;
		if(startIndex==endIndex-1)//base condition
			return ar;
		else{
			tempI =minIndex = startIndex;
			//find the min element index in non sorted array
			while(tempI!=endIndex-1){
				if(ar[tempI]>ar[tempI+1])
					minIndex = tempI+1;
				tempI++;
			}
			swapVar = ar[startIndex];
			ar[startIndex] = ar[minIndex];
			ar[minIndex]=swapVar;
			
			ar =selectionSortByRec(ar, startIndex+1, endIndex);
		}
		
		return ar;
	}

	public static void printArray(int[] ar){
		int length = ar.length;
		for(int i=0;i<length;i++){
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		
		int [] ar ={6,3,4,8,2,1};
		ar = selectionSortByRec(ar,0,6);
		printArray(ar);
	}

}
