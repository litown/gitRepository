package com.li.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.town.dubbo.service.IDubboService;

public class ConsumerTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		context.start();
		IDubboService service = (IDubboService) context.getBean("dubboServiceImpl");
		service.test1();
		
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
