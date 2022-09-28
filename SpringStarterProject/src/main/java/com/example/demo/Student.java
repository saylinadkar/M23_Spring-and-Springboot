package com.example.demo;


	import org.springframework.stereotype.Component;

	@Component
	public class Student {
		
		private int rollno;
		private String name;
		//getter setter method 
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void display()
		{
		System.out.println("Student class");
		}
		public Student() {
			super();
			System.out.println("Student constructor");
		}
		
		

	}


