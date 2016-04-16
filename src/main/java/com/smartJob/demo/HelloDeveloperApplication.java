package com.smartJob.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloDeveloperApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloDeveloperApplication.class, args);
		HelloBean helloBean = ctx.getBean(HelloBean.class);
		System.out.println(helloBean.sayHello());
	}
}
