package com.jike.chapter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
	public static void main(String[] args) {
		// 获取配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jike/chapter01/beans.xml");
		// 根据bean的id来获取bean
		Person person = (Person) context.getBean("person");
		person.say();
	}
}
