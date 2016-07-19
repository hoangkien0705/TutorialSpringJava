package org.kienhv.tutorial.spring;

import org.kienhv.tutorial.spring.helloworld.HelloWorld;
import org.kienhv.tutorial.spring.helloworld.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class HelloProgram {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		HelloWorldService helloWorldService = (HelloWorldService) context.getBean("HelloWorldService");
		HelloWorld helloWorld = helloWorldService.getHelloWorld();
		helloWorld.sayHello();
	}
}
