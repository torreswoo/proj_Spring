package com.skplanet.study.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String [] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/skplanet/study/bean/applicationContext.xml");
		
		
	}
}
