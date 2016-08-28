package com.rohit.generalQues;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxDiffrence {
	
    static int maxDifference(int[] a) {
        int last,first=0;
        last = a.length;
        //grates form the last and smallest from the first
        int[] lastgratest = new int[last];
        int[]  firstSmallest = new int[last];
        firstSmallest[0]=a[0];
        lastgratest[last-1] = a[last-1];
        last=last-2;
        first++;
        int maxdiffrence;
        while(last>=0 && first<=a.length-1){
            if(a[first]<firstSmallest[first-1]){
                firstSmallest[first] = a[first];
            }else{
                firstSmallest[first] = firstSmallest[first-1];

            }
            if(a[last]>lastgratest[last+1]){
                lastgratest[last] = a[last];
            }else{
            	lastgratest[last] = lastgratest[last+1];
            }
            last--;
            first++;
        }
        maxdiffrence=lastgratest[0]- firstSmallest[0];
        for(int i=0;i<a.length;i++){
        	System.out.println("maxarray:"+lastgratest[i]+"         minarray: "+firstSmallest[i]);
            if(maxdiffrence<lastgratest[i]- firstSmallest[i]){
                maxdiffrence=lastgratest[i]- firstSmallest[i];
                System.out.print("   "+maxdiffrence);
            }
        }

        return maxdiffrence;
    }
	   public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);

	        int N ;
	        N= in.nextInt();
	        int[] a= new int[N];
	        for(int i =0;i<N;i++){
	        	a[i]=in.nextInt();
	        }
	        
	        System.out.println(maxDifference(a));
	        

	    }
	}


