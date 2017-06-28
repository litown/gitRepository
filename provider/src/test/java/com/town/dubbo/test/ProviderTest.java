package com.town.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		application.start();
		System.out.println("provider提供服务注册成功==========");
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
