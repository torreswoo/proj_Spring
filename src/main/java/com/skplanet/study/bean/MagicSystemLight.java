package com.skplanet.study.bean;

import org.springframework.stereotype.Component;

@Component
public class MagicSystemLight implements MagicSystem {

	@Override
	public void magic() {
		System.out.println("Light Ball");
		
	}

	@Override
	public String showMagicName() {
		
		return "Light Ball";
	}

}
