package com.example.studentinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ClgApplication {

	public static void main(String[] args) {
		// Start Spring Boot application
		ApplicationContext springContext = SpringApplication.run(ClgApplication.class, args);

		// If you want to use your Java config beans:
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainAppConfig.class);

		// Get student bean
		Student student = context.getBean("student1", Student.class);
		student.showDetails();

		// Close the context when done
		context.close();
	}
}