package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@Configurable

@EnableAutoConfiguration
@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringStarterProjectApplication.class, args);
		//Student s=new Student();
		//spring IOC
		ConfigurableApplicationContext c=SpringApplication.run(SpringStarterProjectApplication.class, args);
		Student s=c.getBean(Student.class);
		
		s.display();
		
		//System.out.println("Welcome to M23");
		
	}

}
