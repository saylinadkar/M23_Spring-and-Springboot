package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
  //object creation for airtel
		//Sim s=new Airtel();
		//s.call();
		//s.data();
  //object creation for jio
		//Sim j=new Jio();
		//j.call();
		//j.data();

	ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("config...loaded");
	
	//using IOC
    Sim obj=a.getBean("sim",Sim.class);
	obj.call();
	obj.data();
	
	/*Jio obj1=(Jio)a.getBean("jio");
	obj1.call();
	obj1.data();  */
	
	
	
	
	}

}
