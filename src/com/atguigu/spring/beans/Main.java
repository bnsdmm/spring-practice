package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		 * HelloWorld helloWorld = new HelloWorld(); helloWorld.setUserName("Spring");
		 * helloWorld.hello();
		 */
		// 1. 创建 Spring 的IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. 从容器中获取Bean
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		/*
		 * HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		 */

		// 3. 调用方法
		helloWorld.hello();

	}
}
