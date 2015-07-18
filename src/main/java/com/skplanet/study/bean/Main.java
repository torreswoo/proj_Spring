package com.skplanet.study.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String [] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/skplanet/study/bean/applicationContext.xml");		

	//	1. 생성자로 DI 
	//	Magician magicianFire = context.getBean("magicianFire", Magician.class);
		
	//  2. 애노테이션으로 DI
	//	MagicSystem magicSystemFire = context.getBean(MagicSystem.class);
		Magician magicianFire = context.getBean( Magician.class);
		magicianFire.magic();
		
	}
}
