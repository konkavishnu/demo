package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args); //( "CofnigurableApplicationContext" is a keyword to create 
		//the spring container where the Beans are initialized)
		System.out.println("Hello World");
		Student S = context.getBean(Student.class); // "getBean" is used to get the bean from the container and "Student" is the name of the bean
		S.display();
	}

}
