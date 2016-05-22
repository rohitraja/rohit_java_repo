package com.rohit.algo;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int i=0,sum1=0,sum2=0;
        while(i<n){
            System.out.println("["+i+"]["+i+"]");
            sum1+=a[i][i];
            i++;
        }
        System.out.println("Sum1 "+sum1);
        i--;
        int j=0;
        while(i>=0&& j<n){
            System.out.println("["+j+"]["+i+"]");
            sum2+=a[j][i];
            i--;
            j++;
        }
        System.out.println("Sum2 "+sum2);
        System.out.println(sum1-sum2);

    }
}
