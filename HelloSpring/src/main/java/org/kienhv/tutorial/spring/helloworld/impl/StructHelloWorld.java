package org.kienhv.tutorial.spring.helloworld.impl;

import org.kienhv.tutorial.spring.helloworld.HelloWorld;

public class StructHelloWorld implements HelloWorld{
	@Override
	public void sayHello() {
		System.out.println("Struct Hello World");
	}
}
