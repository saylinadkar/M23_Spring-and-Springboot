package com.cg.springioc;

public class Airtel implements Sim {

	Airtel()
	{
		System.out.println("Airtel consrtructor called");
	}
	public void call() {
		System.out.println("call using airtel");
		}

	public void data() {
		System.out.println("data using airtel");
		
	   }

}
