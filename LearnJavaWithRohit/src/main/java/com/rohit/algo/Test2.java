package com.rohit.algo;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> intStore = new HashMap<Integer, Integer>();
		
		intStore.put(1, 1);
		intStore.put(5, 5);
		intStore.put(3, 3);
		intStore.put(4, 4);
		intStore.put(2, 2);
		if(intStore.containsKey(1))
			System.out.println(1);
		else
			System.err.println();
	}

}
