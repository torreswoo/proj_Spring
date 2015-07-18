package com.skplanet.study.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skplanet.study.bean.Magician;

public class Main {

	public static void main(String [] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/skplanet/study/properties/applicationContext-messageProperties.xml");		

		MessageService messageService = context.getBean( MessageService.class);
		String message = messageService.getMessage();
		System.out.println("message : "+ message);
		
	}
}
