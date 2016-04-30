package com.jike.chapter01;

public class Person {
	private SayHello sayHello;

	public void say() {
		System.out.print("say : ");
		sayHello.sayHello();
	}

	public SayHello getSayHello() {
		return sayHello;
	}

	public void setSayHello(SayHello sayHello) {
		this.sayHello = sayHello;
	}

}
