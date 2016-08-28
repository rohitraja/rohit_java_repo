package com.rohit.classDesign;

/* Line 2 */
class Base extends Thread {
	public static void main(String[] args) {
		Base t = new Base();
		t.start();
		System.out.print("one. ");
		t.start();
		System.out.print("two. ");
	}

	public void run() {
		System.out.print("Thread ");
	}
	
}