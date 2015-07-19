package com.skplanet.study.bean;

import org.aspectj.lang.JoinPoint;

public class Logger_AOP {

	public void afterLogger(JoinPoint joinPoint){
		System.out.println("afterLogger : " + joinPoint);
	}
}
