package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


@SpringBootApplication
public class DemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		

		SpringApplication.run(DemoApplication.class, args);
	}
	
	

	
	@Bean
	public CommandLineRunner run() throws Exception {
 		return args -> {
			//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
			//System.out.println("factory done");
		//	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
			AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
			context.registerShutdownHook();
			Shape shape= (Shape) context.getBean("circle");
			
		//	Triangle triangle= (Triangle) context.getBean("triangle");
		//	triangle.draw();
			shape.draw();
		//	System.out.println(context.getMessage("greeting", null,"Default Greeting",null));

// 			Triangle triangle=new Triangle();
// 			triangle.draw();
 			
			log.info(null);
		};
		
	}

}
