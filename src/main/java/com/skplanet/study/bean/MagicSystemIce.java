package com.skplanet.study.bean;

import org.springframework.stereotype.Component;

@Component
public class MagicSystemIce implements MagicSystem {

	@Override
	public void magic() {
		System.out.println("Ice Ball");
		
	}

	@Override
	public String showMagicName() {
		return "Ice Ball";
	}

}
