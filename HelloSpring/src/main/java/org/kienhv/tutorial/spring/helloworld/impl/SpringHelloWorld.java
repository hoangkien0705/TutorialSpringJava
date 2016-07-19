package org.kienhv.tutorial.spring.helloworld.impl;

import org.kienhv.tutorial.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld{

	@Override
	public void sayHello() {
		System.out.println("Spring Hello World");
	}
}
