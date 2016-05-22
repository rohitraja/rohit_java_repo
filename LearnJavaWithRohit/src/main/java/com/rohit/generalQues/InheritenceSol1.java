
package com.rohit.generalQues;

class Base {
	public void foo(){}

}

class Derived extends Base{
	public void foo(){
		System.out.println("Done");
	}
}

public class InheritenceSol1{
	
	public static void main(String arg[]){
		Derived derived  =  new Derived();
		derived.foo();
	}
}