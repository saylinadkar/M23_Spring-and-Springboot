package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	//DI setter method
	@Autowired
	@Qualifier("Humanheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	//default constructor
		public Human() {
			this.heart=heart;
		}
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
	
		
	}

	public void pumping()
	{
		heart.pump();
		System.out.println("name of the animal is "+heart.getNameofAnimal());
		System.out.println("number of the heart is "+heart.getNumberofHeart());
		
	}

}
